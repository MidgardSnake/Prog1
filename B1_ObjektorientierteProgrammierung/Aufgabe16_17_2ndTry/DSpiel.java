package B2_OOP.Aufgabe16_17_2ndTry;

import Prog1Tools.IOTools;

public class DSpiel {

    public static void main(String[] args) {
        DameFigur beute, jaeger;

        String farbe;
        char zeile;
        int spalte;

        farbe = IOTools.readString("Gib die Farbe der Figur ein:");
        zeile = IOTools.readChar("Gib die Zeile der Figur ein (A-H): ");
        spalte = IOTools.readInt("Gib die Spalte der Figur ein (1-8): ");

        beute = new DameFigur(zeile, spalte, farbe);

        Bildschirm.loeschen();

        farbe = IOTools.readString("Gib die Farbe der Figur ein:");
        zeile = IOTools.readChar("Gib die Zeile der Figur ein (A-H): ");
        spalte = IOTools.readInt("Gib die Spalte der Figur ein (1-8): ");

        jaeger = new DameFigur(zeile, spalte, farbe);

        if (jaeger.trifft(beute))
            System.out.println("Du liegst bereits richtig");
        else {
            System.out.println("Du hast 10 Züge ");
            System.out.println("Bewege deine " + farbe + "e Dame auf dem Feld " + zeile + spalte);


            for (int i = 1; i < 10; i++) {
                System.out.println("Willst du waagerecht (-) , senkrecht (|), oder diagonal ( /, \\)");

                char richtung = IOTools.readChar(" Gib die Richtung ein");
                int anzahl = IOTools.readInt("Gib die Anzahl der Felder ein: ");

                jaeger.ziehe(richtung, anzahl);


                if (jaeger.trifft(beute)) {
                    System.out.println("du hast getroffen, nach " + i + " Zügen.");
                    break;
                } else if ( i<10){
                    System.out.println("Versuchs nochmal.");
                    System.out.println(" Dame auf dem Feld " + jaeger.getXpos() + jaeger.getYpos());
                }else
                    System.out.println("Du hast keine Versuche mehr");


            }
        }


    }

}


