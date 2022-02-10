package Aufgabe5;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Counting up");
		Thread cu = new CountUp(100);
		cu.start();
		cu.join();		//wichtig, der main thread wird erst beendet. wenn erster prozess vorbei ist
		
		System.out.println("Counting down");
		Thread cd = new CountDown(100);
		cd.start();
		cd.join();		// Ansonsten drängeld sich dein "Done" irgendwo rein
		
		System.out.println("Done.");

	}

}
