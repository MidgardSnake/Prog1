package B2_OOP.Aufgabe12;


import B2_OOP.Aufgabe10_11.Bruch;
import Prog1Tools.IOTools;

public class BruchRechner extends Bruch {
    public static void main(String[] args) {
        Bruch bruch1 = new Bruch();
        Bruch bruch2 = new Bruch();

        String in= "egal";

        while (in != "x") {
            System.out.println("Bruch1:" + bruch1);
            System.out.println("Bruch2:" + bruch2);
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("deine möglichen Aktionen: ");
            System.out.println("x: beenden");
            System.out.println("1: Bruch1 eingeben");
            System.out.println("2: Bruch2 eingeben ");
            System.out.println("b: Brueche kuerzen");
            System.out.println("*,/,+,-: Grundrechenarten");
            System.out.println("n: Bruch 1 negativ");
            System.out.println("k: Kehrwert von Bruch 1");
            System.out.println("d: double-Wert von Bruch2");
            System.out.println();
            in = IOTools.readString("Eingabe:");
            System.out.println();

            switch (in) {
                case "x":
                    System.out.println("Goodbye");
                    break;
                case "1":
                    bruch1.einlesen();
                    break;
                case "2":
                    bruch2.einlesen();
                    break;
                case "b":
                    bruch1 = bruch1.kuerze();
                    bruch2 = bruch2.kuerze();
                    break;
                case "n":
                    System.out.println(bruch1.neg());
                    break;
                case "k":
                    System.out.println(bruch1.kehrwert());
                    break;
                case "d":
                    System.out.println(bruch2.wert());
                    break;
                case "+":
                    System.out.println(bruch1.add(bruch2));
                    break;
                case "-":
                    System.out.println(bruch1.sub(bruch2));
                    break;
                case "*":
                    System.out.println(bruch1.mul(bruch2));
                    break;
                case "/":
                    System.out.println(bruch1.div(bruch2));
                    break;
            }
        }
    }
}
