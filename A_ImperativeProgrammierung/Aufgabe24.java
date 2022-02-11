package A_IP;

public class Aufgabe24 {

    public static void main(String[] args) {
        int a = 1;
        a++;
        System.out.println(a);//2
        a = a++;
        System.out.println(a);//2
        a= ++a;
        System.out.println(a);//3

        a = a+1;
        System.out.println(a);//4
        a=--a;
        System.out.println(a);//3
        a +=a;
        System.out.println(a);//6
        a -= a+1;
        System.out.println(a);//-1
        a=(a--) - (--a);
        // -1 [speichert a=-2] - (-3)
        System.out.println(a);//2
    }
}
