package Aufgabe4;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("ArrayStack Demo:");
        Aufgabe4.ArrayStack arrayStack = new Aufgabe4.ArrayStack();
        arrayStack.push(new String("1"));
        arrayStack.push(new String("2"));
        System.out.println(arrayStack.top());
        arrayStack.push(new String("3"));
        arrayStack.push(new String("4!"));
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

        System.out.println("\n" + "ListStack Demo:");

        Aufgabe4.ListStack listStack = new Aufgabe4.ListStack();
        listStack.push(new String("1"));
        listStack.push(new String("2"));
        System.out.println(listStack.top());
        listStack.push(new String("3"));
        listStack.push(new String("4"));
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());

    }

}
