package com.collection.Day1;

public class Car {
 int num =1 ; 
 String name = "Thar" ; 
 String model = "Mahindra" ; 
 String type ; 
 // Constructor -> Default , Parameterised
 //Constructor is also a method with same name of the class . 
 // Default constructor 
 // Static key word -> variable , method , block 
 // Instance variable -> variable which are written inside a class but out side 
 //a method is known ar Instance variable  
 public Car() {
	super();
	 }
 // Parameterised Constructor 
 // public static void methodOne(int a ,int b ,int c ){
 // int a = 2 , int b =3 , int c =4 ;
 // int d = a+b+c
 //}
public Car (int num , String name ,String type) {
	 this.num = num; 
	 this.name=name ;
	 this.type=type; 
 }
public Car (int num , String name ,String type,String model) {
	 this.num = num; 
	 this.name=name ;
	 this.type=type;
	 this.model=model ; 
}
}
