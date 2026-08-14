package com.scanner;

import java.util.Scanner;

public class ScanerExp {
//	 import scanner class from java.util.scanner 
	public static void main(String[] args) {
		// 1 make object of a scanner 
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter youre name ");
		String name = sc.nextLine(); // 2 intialize input the data type 
		System.out.println("pls enter youre Id ");
		int id = sc.nextInt();
		System.out.println("pls enter youre age ");
		int age = sc.nextInt();
		System.out.println("pls enter youre YOE ");
		int yoe = sc.nextInt();
		System.out.println("you have entered id :- "+id +
				" name :- "+ name + " Age :- " + age +" YOE:- "+ yoe );
		// 3 Close the scanner 
		sc.close();
		
	}

}
