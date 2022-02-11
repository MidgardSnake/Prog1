package A_IP;

public class Aufgabe07 {

    public static void main(String[] args) {

        double a, b, c, d, e;
        a = 4;
        b = 3;
        c = 2;
        d = 1;

        if (b > a)
            if (c > b)
                if (d > c)
                    e = d;
                else e = c;
            else if (d > b) e = d;
            else e = b;
        else if (c > a) if (d > c) e = d;
        else e = c;
        else if (d > a) e = d;
        else e = a;
        System.out.println("e = " + e);


        if (a > b) b = a;
        if (c > d) d = c;
        if (b > d) d = b;
        System.out.println(d);
    }

}
