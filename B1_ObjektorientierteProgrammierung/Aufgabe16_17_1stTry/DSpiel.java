package B2_OOP.Aufgabe16_17_1stTry;

import Prog1Tools.IOTools;

public class DSpiel {

    public static void main(String[] args) {

        DameFigur beute, jaeger;

        int zeilenPos, anzahl;
        char spaltenPos, richtung;

        String farbe;

        System.out.println("Positioniere deine Beute:");
        spaltenPos = IOTools.readChar("Spalte (A bis H) deiner Figur?: ");
        zeilenPos = IOTools.readInt("Zeile (1 bis 8) deiner Figur?: ");
        farbe = IOTools.readString("Farbe deiner Figur?: ");
        beute = new DameFigur(spaltenPos, zeilenPos, farbe);

        Bildschirm.loeschen();

        System.out.println("Die Beute steht. Positioniere nun den Jaeger");
        spaltenPos = IOTools.readChar("Spalte (A bis H) deiner Figur?: ");
        zeilenPos = IOTools.readInt("Zeile (1 bis 8) deiner Figur?: ");
        farbe = IOTools.readString("Farbe deiner Figur?: ");
        jaeger = new DameFigur(spaltenPos, zeilenPos, farbe);

        if (jaeger.trifft(beute))
            System.out.println("Treffer, hast gewonnen. Glückwunsch!");
        else {
            System.out.println("Beute steht woanders, versuch es nochmal");
            System.out.println("Hast insgesamt 10 Züge um die Beute zu treffen.");

            for (int i = 1; i < 10; i++) {
                System.out.println("Bewege deinen Jäger" + jaeger);
                richtung = IOTools.readChar("Gib deine Richtung ein (waagerecht - , senkrecht | , diagonal \\, /");
                anzahl = IOTools.readInt("wieviele Felder willste ziehen? <0 ist noch links, > 0 nach rechts.");

                jaeger.ziehe(richtung, anzahl);

                if (jaeger.trifft(beute)) {
                    System.out.println("Treffer, der Jaeger hat gewonnen.");
                    break;
                } else if (i < 10)
                    System.out.println("leider kein Treffer");
                else System.out.println("hast verloren, keine Züge mehr");

            }
        }
    }
}
