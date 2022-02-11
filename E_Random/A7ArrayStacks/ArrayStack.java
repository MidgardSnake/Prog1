package E_Random.A7ArrayStacks;

public class ArrayStack {

    Object [] array = new Object[10];
    private int head = 0;

    public void push ( Object value){
        head = head+1;
        array[head]= value;
    }

    public Object pop (){
        head = head-1;
        return array[head+1];
    }

    public Object top (){
        return array[head];
    }

}
