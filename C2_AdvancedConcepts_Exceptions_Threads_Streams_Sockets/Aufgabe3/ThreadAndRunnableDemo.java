package Aufgabe3;

public class ThreadAndRunnableDemo {

	public static void main(String[] args) {
		new SimpleThread().start();				// Java startet den Thread parallel mit den unteren Methoden
		new SimpleRunnable().run();				// hier führst du einfach nur ne Methode aus

		new Thread(new SimpleThread()).start();
		new Thread(new SimpleRunnable()).start();
	}
}
