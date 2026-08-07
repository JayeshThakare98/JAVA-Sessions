package com.exceptions;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
//			int result = 10 / 2; // it wont show exception
			int result = 10 / 0; // it will show exception
			// multiplication
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("You cant divide anything by 0");
		} // this catch block is for multiply by Zero
		finally {
			System.out.println("This finally block getting excuted always ");
		}

//	System.out.println(10/0);
		/*
		 * try { i am teaching -> students are understanding the topic another teacher
		 * comes - > Exception hit }catch { students are not understanding }
		 * 
		 * finally { mla front end pn ghyach ahe }
		 * 
		 */
	}
}
