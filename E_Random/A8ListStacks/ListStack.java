package E_Random.A8ListStacks;

import E_Random.A6DoublyLinkedList.DoublyLinkedList;

public class ListStack {

    DoublyLinkedList dll = new DoublyLinkedList();

    public void push ( Object o){
        dll.insertAtHead(o);
    }

    public Object pop (){
        Object res = dll.getValue(0);
        dll.deleteValue(res);
        return res;
    }

    public Object top(){
        return dll.getValue(0);
    }
}
