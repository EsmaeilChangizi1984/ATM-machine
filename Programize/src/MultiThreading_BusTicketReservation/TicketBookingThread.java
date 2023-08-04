package MultiThreading_BusTicketReservation;

public class TicketBookingThread extends Thread{
	
	private TicketCounter ticketCounter;
	private String name;
	private int seats;
	
	public TicketBookingThread(TicketCounter ticketCounter,String name,int seats) {
		this.ticketCounter = ticketCounter;
		this.name = name;
		this.seats = seats;
	}
	
	public void run() {
		ticketCounter.bookTicket(name, seats);
	}

}
