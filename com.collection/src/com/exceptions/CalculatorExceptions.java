package com.exceptions;

public class CalculatorExceptions {
// divide , addtion , multiplication , subtraction 
//	for two intgeres a, b 
//	we have to do division of such numberes where a is bigger than b 
	
	public static double checkAndCalculte(int a , int b) throws ArithmeticException ,IllegalArgumentException {
		if(a<b) {
		throw new IllegalArgumentException("PLs use the value of A  more than B "); 
		}
		
		double c = a/b ; 
		return c ; 
	}
	public static void main(String[] args) {
		// scenerio 1 - a is greter then b 
		try {
		System.out.println(checkAndCalculte(10,2)); //5
		} catch (IllegalArgumentException e) {
			System.out.println("Comparsion Eror occured "+ e.getMessage());
		}
		// scerio 2 -> a is smaller then b 
		try {
			System.out.println(checkAndCalculte(1,10)); //0.1
			} catch (IllegalArgumentException e) {
				System.out.println("Comparion Eror occured "+ e.getMessage());
			}
		// scerio 3 -> when we divide somthing by 0 
		try {
			System.out.println(checkAndCalculte(1,0));
			} catch (IllegalArgumentException e) {
				System.out.println("Comparion Eror occured "+ e.getMessage());
			}catch (ArithmeticException e) {
				System.out.println("Pls do not divide with ZERO"+ e.getMessage());
			}
//		scerio 4 -> when we divide both values are 0 
		try {
			System.out.println(checkAndCalculte(0,0));
			} catch (IllegalArgumentException e) {
				System.out.println("Comparion Eror occured "+ e.getMessage());
			}catch (ArithmeticException e) {
				System.out.println("Pls do not divide with ZERO"+ e.getMessage());
			}
//		scerio 5 -> when we divide both values are a is 0 and b is bigger  
		try {
			System.out.println(checkAndCalculte(0,30));
			} catch (IllegalArgumentException e) {
				System.out.println("Comparion Eror occured "+ e.getMessage());
			}catch (ArithmeticException e) {
				System.out.println("Pls do not divide with ZERO"+ e.getMessage());
			}
//		System.out.println(10/0);// inifintiy exception Arithematic 
//		System.out.println(10/2);//5
//		System.out.println(10/5);// 2
//		System.out.println(10/100);//0.1
//		System.out.println(2/10);//0.2
//		System.out.println(23/1000);//0.023
	}
}
