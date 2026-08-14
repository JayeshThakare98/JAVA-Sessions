package com.scanner;

import java.util.Scanner;

public class ScannerCalculator {
	// we have to make addtion methods who is taking two numbers
//	 for substraction 
public static void main(String[] args) {
	//1 create object of scanner 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("type value of a");
	int a = sc.nextInt();
	System.out.println("type value of b ");
	int b =sc.nextInt();
	int sum = a+b ; 
	int sub = a-b ;
	System.out.println("ans of addition = "+ sum);
	System.out.println("ans of Substractiob = "+sub);
	sc.close();
}
}
