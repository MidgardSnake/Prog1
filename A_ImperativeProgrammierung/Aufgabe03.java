package A_IP;

import Prog1Tools.IOTools;

public class Aufgabe03 {


    public static void main(String[] args) {

        String name = IOTools.readString("type in your name:");
        System.out.println(name);
        int age = IOTools.readInt("type in your age");
        System.out.println(age*365);
    }
}
