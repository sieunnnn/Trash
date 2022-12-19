package multiCampus.QRServer.presentation;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import src.multiCampus.QRServer.http.HttpStatusCode;


public class QRController {
    private ServerSocket serverSocket;

    public QRController() {

        try {
            serverSocket = new ServerSocket(80);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void startServer() {

        System.out.println("QR서버 시작합니다...");

        // connetionless : Http서버는 요청에 대한 응답이 끝나면 통신을 종료(socket을 닫는다) 해준다.
        // stateless 	 : Http서버는 사용자의 이전 상태를 기억하지 않는다.
        //				   클라이언트가 매 요청 자신을 인증할 수 있는 정보를 함께 보낸다.
        while(true) {

            // try-with-resources로 인해 매 요청 소켓을 닫아줌
            try{

                Socket socket = serverSocket.accept();
                BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //StringBuffer sb = new StringBuffer();
                //testHttpMessageFormat(br, sb);

                String request = br.readLine();
                request = URLDecoder.decode(request, "utf-8");

                //시작줄에서 url만 추출
                String url = request.substring(request.indexOf(" ")+1, request.lastIndexOf(" "));

                if(url.equals("/")) {

                    String responseHeader = "Content-Type: text/html; Charset=utf-8 \n\n";
                    String body = indexTemplate();
                    String httpMessage = HttpStatusCode.OK.getStartLine() + responseHeader + body;
                    bos.write(httpMessage.getBytes());
                    bos.flush();

                }else if(url.startsWith("/qrcode")){

                    Map<String, String> parameter = getParameter(url);

                    String responseHeader = "Content-Type: text/html; Charset=utf-8 \n";
                    responseHeader += "Content-Disposition: attachment; filename=" + parameter.get("fileName") + ".jpg \n\n";
                    String header = HttpStatusCode.OK.getStartLine() + responseHeader;

                    bos.write(header.getBytes());

                    QRCodeWriter qr = new QRCodeWriter();
                    BitMatrix matrix = qr.encode(parameter.get("contents"), BarcodeFormat.QR_CODE, 1000, 1000);

                    String color = "ff" + parameter.get("color").replace("#", "");

                    int argb = Integer.parseUnsignedInt(color, 16);
                    MatrixToImageConfig config = new MatrixToImageConfig(argb, MatrixToImageConfig.WHITE);
                    MatrixToImageWriter.writeToStream(matrix, "jpg", bos, config);

                    bos.flush();

                }else {
                    // 존재하지 않는 리소스 요청
                    bos.write(HttpStatusCode.NOT_FOUND.getStartLine().getBytes());
                    bos.flush();
                }

                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (WriterException e) {
                e.printStackTrace();
            }finally {

            }
        }
    }

    private Map<String, String> getParameter(String url) {

        String queryString = url.substring(url.indexOf("?")+1);
        Map<String, String> params = new HashMap<String, String>();

        for(String param : queryString.split("&")) {
            String[] entry = param.split("=");
            params.put(entry[0], entry[1]);
        }

        return params;
    }

    private String indexTemplate() {
        return  "<h1><center>QRCode 를 다운받는 사이트 입니다.</center></h1>"
                + "<h2><center>QR코드를 원하시나요?</center></h2>"

                + "<br><br><br><form action='/qrcode'>\n" // get / http/1.1
                + "<center><img src = https://pbs.twimg.com/media/Ehof12pU8AAYnA6.jpg /></center>"
                + "<center><br><br><h4>파일 이름을 입력해주세요</h4></center> \n"
                + "<center><input type='text' name='fileName' required/></center> \n"
                + "<center><h4>QR 코드로 만들 문자열을 입력해주세요</h4></center> \n"
                + "<center><input type='text' name='contents' required/></center>\n"
                + "<center><h4>QR 코드 색상을 선택해주세요 </h4></center> \n"
                + "<center><input type='color' name='color' required/></center> \n"
                + "<br><center><button>전송하기</button></center> \n"
                + "</form> \n";
    }

    private void testHttpMessageFormat(BufferedReader br, StringBuffer sb) throws IOException {

        String httpMessage = "";

        // http message를 구경해보자
        while((httpMessage = br.readLine()) != null) {
            sb.append(httpMessage + "\n");
        }

        System.out.println(sb);
    }

}
