package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe10 {

    public static void main(String[] args) {


        int t = IOTools.readInt("type in the day: ");
        int m = IOTools.readInt("type in the month: ");
        int j = IOTools.readInt("type in the year: ");

        System.out.println("The " + t + "." + m + "." + j + " was a");

        if (m <= 2) {
            m += 10;
            j -= 1;
        } else {
            m -= 2;
        }

        int c = j / 100;
        int y = j % 100;

        int h = (((26 * m - 2) / 10) + t + y + y / 4 + c / 4 - 2 * c) % 7;

        if (h < 0)
            h += 7;

        switch (h) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;

        }
    }

}