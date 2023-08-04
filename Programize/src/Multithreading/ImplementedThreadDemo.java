package Multithreading;

public class ImplementedThreadDemo {

	public static void main(String[] args) {
		
		ImplementedThread nt = new ImplementedThread();
		nt.t.start();
		
		try{
			for(int i=5; i>0; i--) {
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interupted.");
		}
		System.out.println("Exiting Maiin Thread.");

	}

}
