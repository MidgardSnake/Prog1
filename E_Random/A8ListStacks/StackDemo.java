package E_Random.A8ListStacks;

public class StackDemo {

    public static void main(String[] args) {
        System.out.println("\n" + "ListStack Demo:");

        ListStack listStack = new ListStack();
        listStack.push("1");
        listStack.push("2");
        System.out.println(listStack.top());
        listStack.push("3");
        listStack.push("4");
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println("verbleibender Wert "+listStack.top());
    }
}
