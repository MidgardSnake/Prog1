package E_Random.A6DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList sll = new DoublyLinkedList();
        System.out.println(sll);
        sll.append(5);
        System.out.println(sll);
        sll.append(10);
        System.out.println(sll);

        sll.insertAtHead(8);
        System.out.println(sll);

        sll.insertAfter(1, 8);
        System.out.println(sll);

        System.out.println(sll.getValue(1));

        sll.deleteValue(8);
        System.out.println(sll);
        sll.deleteValue(1);
        System.out.println(sll);
        sll.deleteValue(5);
        System.out.println(sll);
        sll.deleteValue(10);
        System.out.println(sll);



    }
}
