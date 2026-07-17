package com.collection.Day1;

public class Constructors {
public static void main(String[] args) {
	Car carObj1 = new Car() ; 
	
	System.out.println(carObj1.model);
	System.out.println(carObj1);
	
	Car carObj2 = new Car(3, "700", "Disel") ;
	System.out.println(carObj2.num);
	System.out.println(carObj2.model);
	System.out.println(carObj2.name);
	System.out.println(carObj2.type);
	
	Car carObj3 = new Car(4, "Safari", "Petrol", "TATA");
	System.out.println(carObj3.num);
	System.out.println(carObj3.model);
	System.out.println(carObj3.name);
	System.out.println(carObj3.type);

}
}
