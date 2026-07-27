package com.interfaces;

public class UPI implements Payment,PaymentDecline{

	@Override
	public void makePayment() {
		System.out.println("This payment is made up by UPI");

		
	}

	@Override
	public void declineTransaction() {
		System.out.println("UPI server error - Payment decline");
		
	}

}
