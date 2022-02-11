package E_Random.A7ArrayStacks;



public class StackDemo {
    public static void main(String[] args) {
        System.out.println("ArrayStack Demo:");
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("1");
        System.out.println(arrayStack.top());

        arrayStack.push("2");
        System.out.println(arrayStack.top());

        arrayStack.push("deine Mudder");
        arrayStack.push("4");
        System.out.println(arrayStack.top());

        System.out.println("Entferne " + arrayStack.pop());
        System.out.println("liegt oben: " + arrayStack.top());

        System.out.println("Entferne " + arrayStack.pop());

        System.out.println("Entferne " + arrayStack.pop());

        System.out.println("Entferne " + arrayStack.pop());
        System.out.println("Verbleibender Wert " + arrayStack.top());

    }
}

