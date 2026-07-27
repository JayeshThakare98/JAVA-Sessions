package com.interfaces;

public class CC implements Payment,PaymentDecline{

	@Override
	public void makePayment() {
		System.out.println("This payment is made up by CC");
		
	}

	@Override
	public void declineTransaction() {
		System.out.println("CC server error - Payment decline");
		
	}

}
