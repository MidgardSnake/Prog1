package B2_OOP.Aufgabe18_1;

import B1_OOP.Aufgabe18.Fernseher;
import Prog1Tools.IOTools;

public class FernseherDemo { public static void main(String[] args) {
    int laut, prog;
    String raum;
    B1_OOP.Aufgabe18.Fernseher d;

    System.out.println("Daten fuer einen Fernseher einlesen");
    raum = IOTools.readString("Raum-Bezeichnung: ");
    laut = IOTools.readInteger("Einstellung fuer die Lautstaerke: ");
    prog = IOTools.readInteger("Einstellung fuer das Programm: ");
    System.out.println();

    d = new Fernseher(raum, laut, prog);
    System.out.println("Daten des Fernsehers ausgeben");
    System.out.println(d);
    System.out.println();

    System.out.println("Der Fernseher wird nun anders eingestellt");
    System.out.println("(Lautstaerke um 9 erhoeht, Programm um 6 erniedrigt)");
    d.change("volume", 9);
    d.change("program", -6);
    System.out.println();

    System.out.println("Daten des neu eingestellten Fernsehers ausgeben");
    System.out.println(d);
}
}
