package B2_OOP.Aufgabe13_2ndTry;

public class TennisSpieler {

    public String name;
    public int alter;

    public int altersDifferenz(int alter) {
        return Math.abs(alter - this.alter);
    }

    public static void main(String[] args) {
        TennisSpieler maier = new TennisSpieler("H.Maier", 45);
        TennisSpieler schmid = new TennisSpieler("G Schmid", 42, maier);
        TennisSpieler berger = new TennisSpieler("I. Berger", 37, schmid);

        System.out.println(maier);
        System.out.println(schmid);
        System.out.println(berger);

    }

    public TennisSpieler verfolger;
    public int startNummer;
    public static int folgeNummer = 0;

    public TennisSpieler(String name, int alter) {
        this.name = name;
        this.alter = alter;
        startNummer = folgeNummer++;
    }

    public TennisSpieler(String name, int alter, TennisSpieler verfolger) {
        this.name = name;
        this.alter = alter;
        this.verfolger = verfolger;

        startNummer = folgeNummer++;
    }

    public boolean istLetzter(TennisSpieler verfolger) {
        return verfolger == null;
    }

    public String toString () {
        String printText = name + " (" + startNummer +")";
        if (verfolger != null)
            printText = printText + " liegt vor " + verfolger.toString();
        return printText;
    }
}
