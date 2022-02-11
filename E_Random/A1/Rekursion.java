package E_Random.A1;

public class Rekursion {

    public static void baumfällen( int a){
        System.out.println("hacken");
        if(a==1)
            System.out.println("baum fällt!");
        else {
            baumfällen(a-1);
        }
    }

    public static void main(String[] args) {
        baumfällen(3);
    }
}
