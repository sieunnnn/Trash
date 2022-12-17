package src.multiCampus.io.filter;

public class Run {
    public static void main(String[] args) {

        BufferedIO bio = new BufferedIO();
        bio.copyFileWithBuffer();

        BufferedWR bwr = new BufferedWR();
        bwr.readWithBuffer();

        ObjectIO cio = new ObjectIO();
        cio.readObject();
        cio.writeObject();

    }

}
