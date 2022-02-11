package A_IP;

public class Aufgabe16 {

    public static void main(String[] args) {

        double[] array1 = {12,17,12,18};

        double[] array2 = {12.0,18,12,17};


        System.out.print(sindGleich(array1, array2));

    }

    public static boolean sindGleich(double[] array1, double[] array2) {

        if (array1.length != array2.length) {
            return false;
        } else {

            for (int i = 0; i <= array1.length - 1; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }

            }
        }
        return true;
    }
}

