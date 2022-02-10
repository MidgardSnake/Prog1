package Aufgabe6_M2;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue<T> {

    private List<T> queue = new LinkedList<>();
    private int limit = 10;

    public MyBlockingQueue(int limit) {
        this.limit = limit;

    }

    public void enqueue(T item) throws QueueFullException {//methode kann nur von einem thread bearbeitet werden mit synchronized
        synchronized (queue){   // entweder so synchronizen (anstatt queue kannste auch this nehmen)
        if (queue.size() < limit) {
            queue.add(item);
        } else throw new QueueFullException();
        }
    }

    public synchronized T dequeue(){    // oder im MethodenKopf synchronzien
        T result = null;
        if(queue.size()>0){
            result = queue.remove(0);
        }
        return result;
    }
}

class QueueFullException extends Exception {

    public QueueFullException() {
        super();
    }

    public QueueFullException(String message) {
        super(message);
    }
}


