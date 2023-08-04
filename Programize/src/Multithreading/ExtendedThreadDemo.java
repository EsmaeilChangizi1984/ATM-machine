package Multithreading;

public class ExtendedThreadDemo {

	public static void main(String[] args) {

		ExtendedThread nt = new ExtendedThread();

		nt.start();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println("Main Thread Interupted.");
		}
		System.out.println("Exiting Maiin Thread.");

	}

}
