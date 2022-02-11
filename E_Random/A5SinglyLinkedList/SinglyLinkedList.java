package E_Random.A5SinglyLinkedList;

public class SinglyLinkedList {
    Node head;

    public void append(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null)
            head = node;
        else {
            Node node1 = head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;
        }
    }


    public void print() {
        Node node = head;
        System.out.print("[");

        while (node.next != null) {
            System.out.print(node.data + ",");
            node = node.next;
        }
        System.out.println(node.data + "]");
    }
}
