package B2_OOP.Aufgabe10_11;

public class Test {

    public static void main(String[] args) {
        Bruch bruch1 = new Bruch();
        Bruch bruch2 = new Bruch();


        bruch1.einlesen();
        bruch2.einlesen();

        System.out.println("Multiplikation: \n "+bruch1+" * "+bruch2+" = "+bruch1.mul(bruch2).kuerze());
        System.out.println("Kehrwert von Bruch1: \n"+bruch1.kehrwert());
        System.out.println("Kehrwert von Bruch2: \n"+bruch2.kehrwert());

        System.out.println("Subtraktion: \n"+bruch1+" - "+bruch2+" = "+bruch1.sub(bruch2));
    }
}
