package Aufgabe7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List <String> teilnehmer = new ArrayList<>();
        teilnehmer.add("Hugo");
        teilnehmer.add("Umberto");
        teilnehmer.add("Schmidt");
        teilnehmer.add("Rudolf");

       String members= "";
       for ( String t : teilnehmer)
           members += t+",";
        System.out.println(members);
    }
}
