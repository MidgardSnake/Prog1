package B2_OOP.Aufgabe14_2ndTry;


import B2_OOP.Aufgabe13_2ndTry.TennisSpieler;

public class JugendSpieler extends TennisSpieler {

    private int groesse;

    public JugendSpieler(String name , int alter, TennisSpieler verfolger, int groesse){
        super(name,alter, verfolger);
        this.groesse= groesse;
    }

    public JugendSpieler(String name, int alter, int groesse){
        super(name,alter);
        this.groesse= groesse;
    }

    public static void main(String[] args) {
        TennisSpieler mayer = new JugendSpieler("B.Mayer", 19, 182);
        TennisSpieler schmid = new JugendSpieler("A.Schmid",21,mayer,170);
        TennisSpieler fritz = new JugendSpieler("F.Fritz", 16,schmid,175);

        System.out.println(mayer);
        System.out.println(schmid);
        System.out.println(fritz);
        System.out.println(fritz);

    }



}
