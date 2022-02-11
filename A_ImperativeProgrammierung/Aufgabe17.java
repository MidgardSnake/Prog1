package A_IP;

public class Aufgabe17 {

    public static void main(String[] args) {

        int[][] ma = new int[4][2];   // mehrdimensionales array mit 4 zeilen und 2 spalten
        for (int i = 0; i < ma.length; i++) {       //.length funktionopelt nicht?? Fragen

            System.out.print("+");
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print("0");
            }
            System.out.println();
        }

    }
}
