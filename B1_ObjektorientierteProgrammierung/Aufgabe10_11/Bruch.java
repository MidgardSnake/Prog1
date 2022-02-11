package B2_OOP.Aufgabe10_11;

import Prog1Tools.IOTools;

public class Bruch {

    public int zaehler, nenner;


    public static int ggt(int zaehler, int nenner) {
        if (zaehler == 0)
            return nenner;
        if (nenner == 0)
            return zaehler;

        int x = Math.abs(zaehler);
        int y = Math.abs(nenner);

        while (x != y) {
            if (x > y)
                x -= y;
            else y -= x;
        }
        return x;
    }

    public Bruch(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public Bruch() {

    }

    public String toString() {
        return zaehler + "/" + nenner;
    }

    public Bruch kuerze() {
        int ggt = ggt(zaehler, nenner);
        return new Bruch(zaehler / ggt, nenner / ggt);

    }

    public void einlesen() {
        zaehler = IOTools.readInt("Gib den Zaehler ein : ");

        do {
            nenner = IOTools.readInt("Gib den Nenner ein: ");

        } while (nenner == 0);
    }

    public Bruch kehrwert() {
        return new Bruch(nenner, zaehler);
    }

    public Bruch neg() {
        return new Bruch(zaehler * -1, nenner);
    }

    public double wert() {
        return (double) zaehler / nenner;
    }

    public Bruch mul(Bruch bruch) {

        return new Bruch(bruch.zaehler * this.zaehler, bruch.nenner * this.nenner); //!!!
    }

    public Bruch div(Bruch bruch) {
        return new Bruch(bruch.zaehler * this.nenner, bruch.nenner * this.zaehler);
    }

    public Bruch add(Bruch bruch) {
        return new Bruch(bruch.zaehler * this.nenner + this.zaehler * bruch.nenner,
                this.nenner * bruch.nenner);
    }

    public Bruch sub(Bruch bruch) {
        return new Bruch(this.zaehler * bruch.nenner - bruch.zaehler * this.nenner, this.nenner * bruch.nenner);
    }

}
