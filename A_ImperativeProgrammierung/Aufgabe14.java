package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe14 {

    public static void main(String[] args) {
        int in =+ IOTools.readInt("Gib ne große Zahl ein: ");


        while (in != 0) {          //true
            int rest = in % 10;     //Restwert ist die letzte Ziffer
            in = in / 10;           //nimmt hier den nächsten Zehner , nachdem letzte ziffer ausgeführt wurde

            switch (rest) {
                case 0:
                    System.out.println("Null");
                    break;
                case 1:
                    System.out.println("eins");
                    break;
                case 2:
                    System.out.println("zwei");
                    break;
                case 3:
                    System.out.println("drei");
                    break;
                case 4:
                    System.out.println("vier");
                    break;
                case 5:
                    System.out.println("fünf");
                    break;
                case 6:
                    System.out.println("sechs");
                    break;
                case 7:
                    System.out.println("sieben");
                    break;
                case 8:
                    System.out.println("acht");
                    break;
                case 9:
                    System.out.println("neun");
                    break;
            }
        }
    }
}
