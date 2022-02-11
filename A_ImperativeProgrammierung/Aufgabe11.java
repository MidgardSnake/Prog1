package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe11{

    public static void main(String[] args) {


        int in = IOTools.readInt("Gib ne Zahl ein: ");
        int i=1;

        while (i <= 10) {
            System.out.print(in*i+" ");
            i++;

        }
    }

}
