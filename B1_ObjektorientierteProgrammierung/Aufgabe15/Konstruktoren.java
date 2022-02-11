package B2_OOP.Aufgabe15;

public class Konstruktoren {        //das Ding klappt nicht mit den static Werten

    static class Thomas {

        public Thomas() {
            System.out.println("Thomas");
        }

    }

    static class Maria extends Thomas {
        Maria() {
            System.out.println("Maria");
        }
    }

     static class Susi extends Maria {
       Thomas t = new Thomas();

        Susi() {
            System.out.println("Susi");
        }
    }

     static class TestSusi {
       static Maria m = new Maria();
       static Thomas t = new Thomas();


        public static  void main(String[] args) {

            Susi s = new Susi();
        }
    }
}
