package A_IP;

public class Aufgabe13 {

    public static void main(String[] args) {
        print(1, 5);
        print(4);

    }

    public static void print(int breite, int höhe) {
        System.out.println("*".repeat(breite));
        if (breite != höhe) print(++breite, höhe);
    }

    public static void print(int x) {
        if (x != 0) print(x - 1);
        System.out.println("*".repeat(x));

    }

}

