package B2_OOP.Aufgabe16_17_1stTry;

public class DameFigur extends Spielfigur{

    public DameFigur(char x , int y , String f){
        super(x,y,f);
    }

    private final String name = "Dame";


    public void ziehe( char richtung , int anzahl) {
        if (richtung == '-')
            ziehe(anzahl, 0);
        else if (richtung == '|')
            ziehe(0, anzahl);
        else if (richtung == '/')
            ziehe(anzahl, anzahl);
        else if (richtung == '\\')
            ziehe(anzahl, -anzahl);
    }

    public boolean trifft (DameFigur d){
        return  (d.getXpos()==getXpos() && d.getYpos()==getYpos());
    }

    public String toString() {
        return getFarbe()+"e Dame auf dem Feld "+getXpos()+getYpos();
    }
}
