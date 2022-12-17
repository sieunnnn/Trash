package src.multiCampus.exception.checked;

import java.net.MalformedURLException;
import java.net.URL;

public class Exception {
    public void studyCheckedException() {

        //Checked Exception 은 예외처리가 강제된다.
        try {

            URL url = new URL("https://www.naver.com");

            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getProtocol());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
