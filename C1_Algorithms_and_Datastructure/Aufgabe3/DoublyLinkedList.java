package Aufgabe3;

public class DoublyLinkedList {

    private DoublyLinkedListEntry head;


    public void append(Object value) {
        if (head == null) {
            // insert at head
            head = new DoublyLinkedListEntry();
            head.value = value;

        }
        // find end
        DoublyLinkedListEntry current = head, last = head;
        while (current != null) {
            last = current;
            current = current.next;
        }
        current = new DoublyLinkedListEntry();
        current.value = value;
        current.prev = last;
        last.next = current;
    }

    public void insertAtHead(Object value) {
        if (head == null) {
            head = new DoublyLinkedListEntry();
            head.value = value;
        }
        Aufgabe3.DoublyLinkedListEntry newHead = new DoublyLinkedListEntry();
        newHead.value = value;
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
    }

    public void insertAfter(Object value, Object after) {
        if (head == null) {
            head = new Aufgabe3.DoublyLinkedListEntry();
            head.value = value;
        }
        Aufgabe3.DoublyLinkedListEntry newone = new Aufgabe3.DoublyLinkedListEntry();
        newone.value = value;
        Aufgabe3.DoublyLinkedListEntry current = head;
        while (current.next != null && current.value != after)
            current = current.next;
        Aufgabe3.DoublyLinkedListEntry temp = current.next;
        current.next = newone;
        newone.prev = current;
        newone.next = temp;
        if (current.next != null) {
            temp.prev = newone;
        }
    }

    public Object getValue(int position) {
        int counter = 0;
        Aufgabe3.DoublyLinkedListEntry current = head;
        while (current != null && position != counter++)
            current = current.next;
        if (current == null)
            return null;
        else
            return current.value;
    }

    public void deleteValue(Object value) {
        if (head == null)
            return; // empty list
        Aufgabe3.DoublyLinkedListEntry current = head, last = head;
        if (current.value == value) {
            // it's the head element
            head = head.next;
            return;
        }
        while (current.next != null && current.value != value) {
            last = current;
            current = current.next;
        }
        if (current.value != value)
            return; // not in this list
        last.next = current.next;
        if (current.next != null)
            current.next.prev = last;

    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        Aufgabe3.DoublyLinkedListEntry current = head;
        if (current == null)
            return "[]";
        String res = "[";
        while (current != null && current.next != null) {
            res += current.value + ",";
            current = current.next;
        }
        res += current.value + "]";
        return res;
    }
}