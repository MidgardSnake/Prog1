package Aufgabe10;

public class GenericDoublyLinkedListDemo {
    public static void main(String[] args) {
        Aufgabe10.GenericDoublyLinkedList<Integer> sll = new Aufgabe10.GenericDoublyLinkedList<Integer>();
        System.out.println(sll);
        sll.append(5);
        System.out.println(sll);
        sll.append(7);
        System.out.println(sll);
        sll.insertAtHead(8);
        System.out.println(sll);
        sll.insertAfter(11, 5);
        System.out.println(sll);
        System.out.println(sll.getValue(1));
        sll.deleteValue(5);
        System.out.println(sll);
        sll.deleteValue(8);
        System.out.println(sll);
        sll.deleteValue(7);
        System.out.println(sll);
        sll.deleteValue(11);
        System.out.println(sll);
    }

}
