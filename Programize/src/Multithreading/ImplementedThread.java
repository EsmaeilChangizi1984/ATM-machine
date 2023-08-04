package Multithreading;

public class ImplementedThread implements Runnable {

	Thread t;

	ImplementedThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("child thread: " + t);
	}

	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child Interrupted.");
		}

		System.out.println("Exiting child thread.");

	}

}
