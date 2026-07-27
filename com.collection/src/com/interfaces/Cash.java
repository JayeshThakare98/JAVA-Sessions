package com.interfaces;

public class Cash implements Payment{

	@Override
	public void makePayment() {
		System.out.println("This payment is made up by cash");
		
	}

}
