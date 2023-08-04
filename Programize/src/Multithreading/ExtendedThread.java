package Multithreading;

public class ExtendedThread extends Thread{
	
	ExtendedThread(){
		super("Demo Thread");
		System.out.println("Child Thread : "+this);
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
