package com.customexception;

public class Theater {
	// i have to book a ticket , if ticket is not available
	//i will not be able to watch movie 
//i Have to select count of the  seats 
	static void bookTickets(int reqSeat) throws SeatNotAvailableException {
		int avlSeats  = 8 ; 
		if(reqSeat > avlSeats ) {
			throw new SeatNotAvailableException("Booking is full "
+ "for requsted seats "+reqSeat +"Curently seats are "
					+avlSeats+"Are available ");
		}
		avlSeats-=reqSeat ; 
		System.out.println("Booking succefull for "+reqSeat);
		System.out.println("available seats are "+avlSeats);		
	}
	public static void main(String[] args) {
		try {
		bookTickets(3);
		bookTickets(9);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
