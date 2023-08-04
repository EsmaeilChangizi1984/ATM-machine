package Multithreading;

public class MultiThread implements Runnable {

	String name;
	Thread s;

	MultiThread(String ThreadName) {
		name = ThreadName;
		s = new Thread(this, name);
		System.out.println("New Thread : " + s);
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name+" : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted.");
		}

		System.out.println(name + " Exiting .");
	}

}
