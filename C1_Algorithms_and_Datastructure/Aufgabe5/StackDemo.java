package Aufgabe5;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("ArrayStack Demo:");
        Aufgabe5.ArrayStack arrayStack = new Aufgabe5.ArrayStack();
        arrayStack.push(new String("Hallo"));
        arrayStack.push(new String("Es wurde gepusht!"));
        System.out.println(arrayStack.top());
        arrayStack.push(new String("Foo"));
        arrayStack.push(new String("Bar"));
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

        System.out.println("\n" + "ListStack Demo:");

        Aufgabe5.ListStack listStack = new Aufgabe5.ListStack();
        listStack.push(new String("Hallo"));
        listStack.push(new String("Es wurde gepusht!"));
        System.out.println(listStack.top());
        listStack.push(new String("Foo"));
        listStack.push(new String("Bar"));
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());

    }

}
