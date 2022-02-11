package B2_OOP.Aufgabe9;

import Prog1Tools.IOTools;

public class Punkt {

    private double x;
    private double y;

    public Punkt ( double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void read(){
        x = IOTools.readDouble("Gib den X-Wert ein");
        y = IOTools.readDouble("Gib den y-Wert ein");
    }

    public String toString(){
        return "("+x+","+y+")";
    }
}
