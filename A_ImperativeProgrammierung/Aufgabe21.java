package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe21 {

    public static void main(String[] args) {

        System.out.println("Das ist ein Zahlensortiersystem");

        int count = IOTools.readInt("Gib ein, wieviele Zahlen du eingeben wirst: ");
        int[] zahl = new int[count];

        for (int i = 0; i < count; i++)
            zahl[i] = IOTools.readInt(i + 1 + ". Zahl: ");

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (zahl[j] > zahl[j + 1]) {
                    int temp = zahl[j]; //Melonenvergleich ,3 Stellen erschaffen für Wechsel == Bubblesort
                    zahl[j] = zahl[j + 1];
                    zahl[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < count; i++)
            System.out.print(zahl[i] + " ");
        System.out.println();
    }
}
