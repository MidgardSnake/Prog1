package B2_OOP.Aufgabe16_17_2ndTry;

import Prog1Tools.IOTools;

public class DameFigur extends Spielfigur {

    private final String name = "Dame";

    public DameFigur(char x, int y, String f) {
        super(x, y, f);

    }


    public void ziehe(char richtung, int anzahl) {
        switch (richtung) {
            case '-':
                ziehe(anzahl, 0);
                break;
            case '|':
                ziehe(0, anzahl);
                break;
            case '/':
                ziehe(anzahl, anzahl);
                break;
            case '\\':
                ziehe(anzahl, - anzahl);
                break;
        }
    }
    public boolean trifft (DameFigur andere){
        return getXpos()== andere.getXpos() && getYpos()== andere.getYpos();
    }


    public String toString() {
        return getFarbe()+"e Dame auf dem Feld "+getXpos()+getYpos();
    }
}