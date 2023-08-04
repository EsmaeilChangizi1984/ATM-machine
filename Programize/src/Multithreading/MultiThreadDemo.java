package Multithreading;

public class MultiThreadDemo {

	public static void main(String[] args) {
		
		MultiThread nt1 = new MultiThread("One");
		MultiThread nt2 = new MultiThread("Two");
		MultiThread nt3 = new MultiThread("Three");
		
		nt1.s.start();
		nt2.s.start();
		nt3.s.start();
		
		
		System.out.println("Thread One Is Alive ; "+nt1.s.isAlive());
		System.out.println("Thread Two Is Alive ; "+nt2.s.isAlive());
		System.out.println("Thread Three Is Alive ; "+nt3.s.isAlive());
		
		
		try {
		System.out.println("Waiting for Threads to Finish");
		nt1.s.join();
		nt2.s.join();
		nt3.s.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Thread One Is Alive ; "+nt1.s.isAlive());
		System.out.println("Thread Two Is Alive ; "+nt2.s.isAlive());
		System.out.println("Thread Three Is Alive ; "+nt3.s.isAlive());
		
		
		
		
		
//		try {
//			Thread.sleep(10000);
//		}catch(InterruptedException e) {
//			System.out.println("Main Thread Interrupted");
//		}
//		
    	System.out.println("Main Thread Exiting.");
		
		
		
		
		

	}

}
