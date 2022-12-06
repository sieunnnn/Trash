package codecademy.learnJavaBegginerProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class BuildADroid {

    /*
    This program will build a droid.
        [Function]
        1. Introduce its name that you give.
        2. Perform some task you assigned.
        3. Display Remaining battery Power.

     */

    static int batteryLevel;
    static String name;

    static String task;

    public static void main(String[] args) throws IOException {

        BuildADroid myDroid = new BuildADroid(BuildADroid.name);

        out.println(myDroid);
        out.println("===========================================");

        while (true) {
            myDroid.performTask(task);
            out.println("===========================================");
            myDroid.energyReport();

            if(batteryLevel == 0) {
                out.println("The battery is dead. Please charge " + name + ".");
                break;
            }
        }

    }
    public BuildADroid(String droidName) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        out.println("Give the droid a name and press the Enter key");
        droidName = br.readLine();
        name = droidName;

        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid " + name;
    }

    public void performTask(String droidTask) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        out.println("Give the droid a task and press the Enter key");
        droidTask = br.readLine();
        task = droidTask;

        out.println(name + " is performing task: " + task);

        batteryLevel -= 10;
    }

    public void energyReport() {
        out.println("BatteryLevel is " + batteryLevel);
    }
}
