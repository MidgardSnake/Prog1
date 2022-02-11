package B2_OOP.Aufgabe6;

import Prog1Tools.IOTools;

public class MyMath {

    public static double hoch (double a, double b){
        for (int i = 1; i <b ; i++) {
            a *=a ;
        }
        return a;
    }

    public static int hoch (int a, int b){

        return  (int) hoch((double)a,b);
    }

    public static void main(String[] args) {
        int a = IOTools.readInt("Gib die Basis ein (ganze Zahl): ");
        int b = IOTools.readInt("Gib den Exponenten ein (ganze Zahl): ");
        System.out.println(hoch(a,b));


        double x = IOTools.readDouble("Gib die Basis ein (double-Wert): ");
        double y = IOTools.readDouble("Gib den Exponenten ein (double-Wert: ");

        System.out.println( hoch(x,y));
    }


}
