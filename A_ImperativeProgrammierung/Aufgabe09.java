package A_IP;

public class Aufgabe09 {

    public static void main(String[] args) {


        int n = 5;
        int i = 3;

        while (i++ < 2 * n) {
            double result = 3.14 / (2 * i - 1);
            System.out.println(result);
        }

        System.out.println("-----");
        for (i = 4; i < (2 * n)+1; i++) {
            double result = 3.14 / (2* i - 1);
            System.out.println(result);
        }
        System.out.println("-----");
        i=3;
        do{
            if(i++>=2*n)
                break;
            double result = 3.14 / (2 * i - 1);
            System.out.println(result);
        }  while (i<2*n);



    }
}
