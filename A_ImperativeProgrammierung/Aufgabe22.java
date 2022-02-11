package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe22 {

    public static void main(String[] args) {
        int height = IOTools.readInt("Gib die Höhe ein: ");

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++)
                System.out.print(" ");
            for (int j=1; j<=(2*i-1); j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i=1; i<height; i++)
            System.out.print(" ");
        System.out.println("I");
        for (int i=1; i<height; i++)
            System.out.print(" ");
        System.out.println("I");
    }
}

