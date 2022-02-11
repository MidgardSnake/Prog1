package E_Random.A1;

public class BreakContinue {

    public static void main(String[] args) {
        int a = 0;



        do {
            if (a == 3)
                continue;
            System.out.println(a);
        }while (a++<10);
    }
}
