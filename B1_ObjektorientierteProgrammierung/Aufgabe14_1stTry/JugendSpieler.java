package B2_OOP.Aufgabe14_1stTry;


import B2_OOP.Aufgabe13_1stTry.TennisSpieler;

public class JugendSpieler extends TennisSpieler {

    private double groesse;


    public JugendSpieler(String name, int alter, double groesse, TennisSpieler verfolger) {
        //Nutzung von TennisSpieler mit Konstruktor +super
        super(name, alter, verfolger);
        this.groesse=groesse;
    }
    public JugendSpieler(String name, int alter, double groesse) {
        super(name, alter);
        this.groesse= groesse;
    }

    public static void main(String[] args) {
        JugendSpieler maier,schmid,berger;
        maier = new JugendSpieler("S. Maier", 8, 112);
        schmid = new JugendSpieler("T. Schmid", 15, 180, maier);
        berger = new JugendSpieler("U. Berger", 16, 185,schmid);
        System.out.println(maier.altersDifferenz(berger.alter));
        System.out.println(schmid.name);
        System.out.println(schmid.alter);
        System.out.println(maier.istLetzter());
        System.out.println(schmid.istLetzter());
        System.out.println(berger.istLetzter());
        System.out.println(maier);
        System.out.println(schmid);
        System.out.println(berger);
    }
}
