package B2_OOP.Aufgabe13_1stTry;

public class TennisSpieler {

    public String name;
    public int alter;

    public int altersDifferenz (int alter){
        return Math.abs(alter-this.alter);
    }

    public static void main(String[] args) {

        TennisSpieler maier= new TennisSpieler("H.Maier",68);
        TennisSpieler schmid = new TennisSpieler("G. Schmid",45,maier);
        TennisSpieler berger = new TennisSpieler("I. Berger",36,schmid);

        // zu 13.
        System.out.println(maier);
        System.out.println(schmid);
        System.out.println(berger);
        System.out.println("ist H.Maier letzter? "+maier.istLetzter());
    }

    public TennisSpieler verfolgerVerfolger(){
        return verfolger.verfolger;
    }


    //7.
    public TennisSpieler verfolger;
    public int startNummer;

    //8.
    public static int folgeNummer = 1;

    //9.

    public TennisSpieler( String name , int alter){
        this.name = name;
        this.alter= alter;
        this.startNummer = folgeNummer++;
    }

    public TennisSpieler (String name , int alter , TennisSpieler verfolger){
        this.name = name;
        this.alter = alter;
        this.verfolger = verfolger;
        this.startNummer = folgeNummer++;
    }

    //12.

    public boolean istLetzter (){
        return verfolger== null;
    }

    //13.
    public String toString (){
        String printText = name+" ( Startnummer: "+startNummer+")";
        if (verfolger !=null)
            printText = printText + " liegt vor "+ verfolger.toString();
        return printText;
    }






}
