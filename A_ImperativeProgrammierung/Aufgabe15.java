package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe15 {

    public static void main(String[] args) {
        int choice;
        int geheimezahl = (int) (99 * Math.random() + 1);

        System.out.println("This is a Game, choose a number between 0 and 100");


        do {
            choice = IOTools.readInt("Type in your number");
            if (choice == geheimezahl)
                System.out.println("youre right!");
            else if (choice > geheimezahl)
                System.out.println("number is lower");
            else if (choice < geheimezahl)
                System.out.println("number is higher");

        } while (choice != geheimezahl);
    }
}
