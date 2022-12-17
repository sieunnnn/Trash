package src.multiCampus.io.file;

public class Run {
    public static void main(String[] args) {

        _File file = new _File();
        file.studyFile();

        FileIO fio = new FileIO();
        fio.writeFile();
        fio.readFile();
        fio.copyFile();

        FileWR fwr = new FileWR();
        fwr.writeFile();
        fwr.readFile();

        _PrintWriter pw = new _PrintWriter();
        pw.printWriter();



    }

}
