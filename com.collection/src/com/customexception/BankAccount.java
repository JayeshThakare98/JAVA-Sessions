package com.customexception;

import com.exceptions.CustomException;

public class BankAccount {
// we have to check for insufficient balance . 
// i have 5000 and my spending is 6000 -> my balance is insufficient 
//always i need to spend -  balance > spending 
//	always i need incufficient balance - balance < spending 
	// onac spending is done i need to check my balance 
	
	static void withdrow(int spending)throws CustomException {
		int balance = 5000 ; 
		if(spending >balance ) { // 3000
			throw new CustomException("Insufficient balance ");	
		}
		balance -=spending ;
		System.out.println("Spending Done ");
		System.out.println("after spending current balance is :-"+ balance);
	}
	 public static void main(String[] args) {
	try {
		withdrow(8000);
		 withdrow(2000);
	}catch (Exception e) {
	System.out.println(e.getMessage());
	}
	}
}
