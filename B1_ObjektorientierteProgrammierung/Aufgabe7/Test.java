package B2_OOP.Aufgabe7;

import Prog1Tools.IOTools;

public class Test {

    public static void main(String[] args) {
        CD TheWhiteStripes = new CD("Seven Nation Army",3.52,true);
        CD TheNational = new CD("Boston",3.12,false);
        CD PrinzPi = new CD("Gib dem Affen Zucker", 3.04,true);

        String in = IOTools.readString("Gib den gesuchten Künstler ein (ohne Leerzeichen): ");

        switch (in) {
            case "TheWhiteStripes":
                System.out.println(TheWhiteStripes.toString());
                break;
            case "TheNational":
                System.out.println(TheNational.toString());
                break;
            case "PrinzPi":
                System.out.println(PrinzPi.toString());
                break;
        }
    }
}
