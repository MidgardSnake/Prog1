package E_Random.A2Interfaces;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(3,12.5,"white",false);
        System.out.println(dog.aggressive);
        System.out.println(dog.changeWeight(4));
        System.out.println();

    }
}
