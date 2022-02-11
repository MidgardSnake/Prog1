package A_IP;

public class Aufgabe18 {

    public static void main(String[] args) {



        int[][][] feld = new int[6][10][7];
        for (int d1 = 0; d1 < feld.length ; d1++) {
            feld[d1] = new int[10][7];
            System.out.print("0");
            for (int d2 = 0; d2 < feld[d1].length ; d2++) {
                feld[d1][d2] = new int[7];
                System.out.print(" 1 ");
            }
            System.out.println();
        }
    }
}
