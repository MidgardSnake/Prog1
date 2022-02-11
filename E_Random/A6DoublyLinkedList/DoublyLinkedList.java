package E_Random.A6DoublyLinkedList;

public class DoublyLinkedList {

    public Node head;


    public void append (Object value){
        if ( head == null) {
            head = new Node();
            head.value = value;
            return;
        }
        Node current = head, last = head;
        while (current!= null) {
            last = current;
            current = current.next;
        }
        current = new Node();
        current.value= value;
        current.previous = last;
        last.next = current;


    }

    public void insertAtHead(Object val) {
       if ( head == null){
           head = new Node();
           head.value = val;
           return;
       }
     Node current = new Node();
       current.value = val ;
       current.next = head;
       head.previous = current;
       head = current;



    }

    public void insertAfter(Object newvalue, Object previousvalue) {
       if ( head == null){
           head = new Node();
           head.value = newvalue;
           return;
       }
       Node newNode = new Node();
       newNode.value = newvalue;
       Node prevNode = head;

       while (newNode.value !=  previousvalue && newNode.next != null )
           newNode = newNode.next;
       Node temp = prevNode.next;
       prevNode.next = newNode;
       newNode.previous = prevNode;
       newNode.next = temp;

    }

    public Object getValue(int position) {
     int counter = 0;
     Node current = head ;
     while ( current!= null && position!= counter++)
         current= current.next;
     if ( current== null)
         return null;
     else return current.value;
    }

    public void deleteValue(Object value) {
        if (head == null)
            return;
        Node current = head , last = head ;
        if ( current.value== value )
            head = head.next;
        else{
            while (current.next != null && current.value != null){
                last = current;
                current= current.next; }
            if ( current.value!=value)
                return;
            last.next = current.next;
            if ( current.next!=null)
                current.previous.next = last;

        }
    }


    public String toString() {
        Node current = head;

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

