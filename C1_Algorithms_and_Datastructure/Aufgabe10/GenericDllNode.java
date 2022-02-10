package Aufgabe10;

public class GenericDllNode<T>{
    /**
     * value of this list entry
     */
    public T value;

    /**
     * references to the successor and predecessor of this list entry
     */
    public GenericDllNode<T> next;
    public GenericDllNode<T> prev;
}
