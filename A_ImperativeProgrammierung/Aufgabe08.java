package A_IP;

public class Aufgabe08 {

    public static void main(String[] args) {
        int x = 0, y = 4;

        if (x < 5)
            if (x < 0)
                System.out.println("x < 0");
            else
                System.out.println("x >= 0");//hier ist der Fehler

        if (x > 0) {
            System.out.println("ok! x > 0");
            System.out.println("1/x = " + (1 / x));
        }
        if (x > 0)
            System.out.println("1/x = " + (1 / x));

        if (y > x) { // vertausche x und y
        int z = y;
        y=x;
        x=z;

        }System.out.println("x = " + x + " y = " + y);
    }

}
