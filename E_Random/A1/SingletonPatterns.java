package E_Random.A1;

public class SingletonPatterns {

    public static void main(String[] args) {
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

    }
}

    class Abc {
        static Abc obj = new Abc();

        private Abc() {
        }

        public static Abc getInstance() {
            return obj;
        }
    }
