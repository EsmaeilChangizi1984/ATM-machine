package MultiThreading_BusTicketReservation;

public class TicketCounter {
	
	int availableSeats = 9;
	
	public synchronized void bookTicket(String name,int seats) {
		
		if(availableSeats >= seats && seats>0) {
			System.out.println(name + " Reserved : "+seats +" Successfully.");
			availableSeats-=seats;
		}else {
			System.out.println("Sorry "+name+" No seat available.");
		}
		
	}

}
