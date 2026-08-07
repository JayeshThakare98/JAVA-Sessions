package com.exceptions;

public class ThrowExample {
// Throw -explicitly throws an exception 
	public static void main(String[] args) {
		int age = 30 ; 
		try {
		if(age < 18 || age <=18 ) {
			throw new ArithmeticException("You are Not eligible for vote");
			
		}
		System.out.println("You are eligible for vote");
		}
		catch (ArithmeticException e) {
			
			System.out.println("Exception occure: "+ e.getMessage());
		}
//		if(16 < 18) {		
//			System.out.println("You can not vote ");
//		}else {
//			System.out.println("You can vote ");
//		}
	}
}
