package codecademy.learnJavaBegginerProject;

import static java.lang.System.out;

public class ContinentsAndCities {

    /*
    This program will print out a continent and the largest city in that continent,
    based on the value of an integer.
     */

    public static void main(String[] args) {

        int continent = 4;

        switch (continent) {
            case 1 -> out.println("North America: Mexico city, Mexico");
            case 2 -> out.println("South America: Sao Paulo, Brazil");
            case 3 -> out.println("Europe: Moscow, Russia");
            case 4 -> out.println("Africa: Shanghai, china");
            case 5 -> out.println("Asia: Shanghai, China");
            case 6 -> out.println("Australia: Sydney, Australia");
            case 7 -> out.println("Antarctica: McMurdoStation, US");
            default -> out.println("Undefined continent!");
        }
    }

}
