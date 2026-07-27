package com.interfaces;

public class Transaction {
public static void main(String[] args) {
	Cash cash = new Cash() ; 
	cash.makePayment(); //
	
	UPI upi = new UPI() ; 
	upi.makePayment();//
	
	CC cc = new CC () ; 
	cc.declineTransaction();//
	cc.makePayment();//
}
}
