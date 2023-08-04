package MultiThreading_BusTicketReservation;

public class Main {

	public static void main(String[] args) {
		
		TicketCounter TC = new TicketCounter();
		TicketBookingThread TB1 = new TicketBookingThread(TC,"Esmaeil",2);
		TicketBookingThread TB2 = new TicketBookingThread(TC,"Mark",3);
		TicketBookingThread TB3 = new TicketBookingThread(TC,"Mike",2);
		
		TB1.start();
		TB2.start();
		TB3.start();

	}

}
