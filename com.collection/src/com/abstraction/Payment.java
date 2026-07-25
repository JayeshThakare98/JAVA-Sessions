package com.abstraction;

public class Payment {
	public static void main(String[] args) {
		Transaction transaction ; 
		
		transaction = new UpiPayemt();
		transaction.spending(); //
		
		transaction = new CashPayemt() ; 
		transaction.spending();
		
		transaction = new CCPayemt();
		transaction.spending();
	}

}
