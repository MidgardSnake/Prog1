package Aufgabe7bM2;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {

    private static long execCounter = 0;    // ist doppelt soviel, weil
    private static long printCounter = 0; // 163763

    private BlockingQueue<String> q;

    private int heads = 0;
    private int tails = 0;

    public void run() {
        while (!(Thread.currentThread().isInterrupted())) {
            String s = q.poll();

            synchronized (q) {      //wichtig, damit die Threads sich nicht überschneiden im wait-prozess
                if (s == null) {
                    try {
                        q.wait();
                        s=q.poll(); // nochmal machen, damit executions und prints fast gleich sind 
                    } catch (InterruptedException e) {
                        this.interrupt();
                    }
                }
            }
            if (s != null) {
                if (s.equals("Heads")) {
                    heads++;
                } else {
                    tails++;
                }
                System.out.println("Relative frequency of heads = "
                        + Math.round(((double) heads / (heads + tails)) * 100)
                        / 100.0);
                printCounter++;
            }
            execCounter++;  // wird mehr als printcounter sein,weil immer gepollt wird , auch wennfalls s==null ist
        }
        System.out.println("Number of consumer executions: " + execCounter);
        System.out.println("Number of consumer prints: " + printCounter);
    }

    public void setQ(BlockingQueue<String> q) {
        this.q = q;
    }
}
