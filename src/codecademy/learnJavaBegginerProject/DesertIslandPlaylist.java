package codecademy.learnJavaBegginerProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.*;

public class DesertIslandPlaylist {

    /*
    This is a program for people who head to a desert island.
    Cut off from the world, for ths next six months.

    You can add six music in this playlist.
    Also, you can remove any music and switch play number of music.

     */
    public static void main(String[] args) throws IOException {

        // add music
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.println("Hello! Before you listen music, you should add six music first.");
        out.println("=================================================================");
        out.println("Add your first music");
        desertIslandPlaylist.add(br.readLine());

        out.println("Add your second music");
        desertIslandPlaylist.add(br.readLine());

        out.println("Add your third music");
        desertIslandPlaylist.add(br.readLine());

        out.println("Add your fourth music");
        desertIslandPlaylist.add(br.readLine());

        out.println("Add your fifth music");
        desertIslandPlaylist.add(br.readLine());

        out.println("Add your sixth music");
        desertIslandPlaylist.add(br.readLine());

        out.println("This is your playlist: " + desertIslandPlaylist);
        out.println("Your playlist has " + desertIslandPlaylist.size() + " music.");
        out.println("Work is done! Enjoy your playlist!");
        out.println("=================================================================");

        // setting menu for remove and switch
        while (true) {
            out.println("\n[Setting]");
            out.println("(1) Remove music");
            out.println("(2) Switch playlist order");

            int input = Integer.parseInt(br.readLine());

            if(input == 1) {
                out.println("[Warning");
                out.println(" No more music can be added. \n Are you sure you want to remove the music?");
                out.println(" If you want, please enter y and if you don't want enter n.");
                String answer = br.readLine();

                if(answer.equals("y")) {
                    out.println("=================================================================");
                    out.println("Please enter the song name you want to remove.");
                    String song = br.readLine();
                    desertIslandPlaylist.remove(song);
                    out.println("This is your final playlist: " + desertIslandPlaylist);
                    out.println("=================================================================");


                } else if(answer.equals("n")) {
                    out.println("Return to setting screen.");

                } else {
                    out.println("please enter y or n.");

                }

            } else if (input == 2) {
                out.println("Please enter the song name you want to switch play order.");
                String songA = br.readLine();

                out.println("Please enter which music you want to change the order with.");
                String songB = br.readLine();

                int indexA = desertIslandPlaylist.indexOf(songA);
                int indexB = desertIslandPlaylist.indexOf(songB);

                desertIslandPlaylist.set(indexA, songB);
                desertIslandPlaylist.set(indexB, songA);

                out.println("Your final playlist: " + desertIslandPlaylist);

            }

        }

    }
}
