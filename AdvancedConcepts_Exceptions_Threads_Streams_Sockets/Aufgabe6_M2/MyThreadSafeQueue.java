package Aufgabe6_M2;

import java.util.LinkedList;
import java.util.List;

public class MyThreadSafeQueue<T> {

	private List<T> queue = new LinkedList<>();
	private int limit = 10;

	public MyThreadSafeQueue(int limit) {
		this.limit = limit;
	}

	public void enqueue(T item) throws InterruptedException{
		while (this.queue.size()== this.limit){
			wait();			// warte mal
		}
		if(this.queue.size()==0){		// wenn Liste leer ist:
			notifyAll();				// alle wartende Threads, macht mal weiter
		}
		this.queue.add(item);

	}

	public T dequeue() throws InterruptedException{
		while (this.queue.size()==0){
			wait();						// warte mal
		}
		if(this.queue.size()==this.limit){		// wenn Liste voll ist:
			notifyAll();				// alle wartende Threads, macht mal weiter
		}
		return this.queue.remove(0);

	}



}
