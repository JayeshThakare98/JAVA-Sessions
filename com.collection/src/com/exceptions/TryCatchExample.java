package com.exceptions;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
//			int result = 10 / 2; // it wont show exception
		int result = 10/0 ; // it will show exception 
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("You cant divide anything by 0");
		}finally {
		System.out.println("This finally block getting excuted always ");	
		}

//	System.out.println(10/0);
	}
}
