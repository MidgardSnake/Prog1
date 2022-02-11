package A_IP;

public class Aufgabe19 {

    public static void main(String[] args) {

        for (int i = 1; i < 9; i++) {
            for (int j = i; j < 9 + i-1; j++) //
                if (j < 10 && j != i)
                    System.out.print(" "+j+" ");
                else
                    System.out.print(" "+j);
            System.out.println();

            int a = 0x1;// Binärwert
            int b = 045; //wert ausm octalsystem
        }
    }
}


