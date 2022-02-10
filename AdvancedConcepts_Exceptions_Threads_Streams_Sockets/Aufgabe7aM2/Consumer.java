package Aufgabe7aM2;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
	private BlockingQueue<String> q;

	private int heads = 0;
	private int tails = 0;

	private static long exeCounter = 0;
	private static long printCounter =0;

	public void run() {
		while (!(Thread.currentThread().isInterrupted())) {
			String s = q.poll();
			if (s != null) {
				System.out.println(s);
				if (s.equals("Heads")) {
					heads++;
				} else {
					tails++;
				}
				System.out.println("Relative frequency of heads = " + Math.round(((double)heads
						/ (heads + tails))*100)/100.0);
				printCounter++;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					this.interrupt();
				}
			}
			exeCounter++;
		}
		System.out.println("Number of consumer execution "+exeCounter);
		System.out.println("Number of consumer Prints: "+printCounter);
	}

	public void setQ(BlockingQueue<String> q) {
		this.q = q;
	}
}
