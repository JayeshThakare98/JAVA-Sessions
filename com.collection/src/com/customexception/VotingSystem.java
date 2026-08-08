package com.customexception;

public class VotingSystem {
	// 1 ) check the age 
	// 2) if age is below 18 we have to say you can not  vote
	// 3) if age is above 18 we have to say you can vote 
	// 4) use Our own custom exception 
	public static void checkAge(int age)throws InvalidAgeException,ArithmeticException ,IllegalArgumentException {
		if(age < 18) {
			throw new InvalidAgeException("age is below 18,  you can not vote ");
		}
		System.out.println("age is above 18 , you can vote ");
	}
	
	public static void main(String[] args) {
		try {
		checkAge(19);
		checkAge(10);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
