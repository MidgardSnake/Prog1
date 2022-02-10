package Aufgabe7aM2;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

	private BlockingQueue<String> q;
	private static long exeCounter=0;

	public void setQ(BlockingQueue<String> q) {
		this.q = q;
	}

	public void run() {
		while (!(Thread.currentThread().isInterrupted())) {

			double randomNumber = Math.random();
			String result = randomNumber >= 0.5 ? "Heads" : "Tails"; //ist randomNumber >=0.5?  ja: Heads, sonst Tails
			q.add(result);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				this.interrupt();
			}catch (IllegalArgumentException i){
				System.out.println("Keine negativen Werte!");
			}
			exeCounter++;
		}
		System.out.println("Number of producer execution "+exeCounter);
	}


}
