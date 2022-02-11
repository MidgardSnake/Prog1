package A_IP;

public class Aufgabe12 {

    public static void main(String[] args) {

        double anlage = 100;
        double zins = 0.06;
        int laufzeit = 4;


        for (int i = 0; i < laufzeit; i++) {
            anlage += anlage*zins;
            System.out.println(anlage);
        }
    }


}
