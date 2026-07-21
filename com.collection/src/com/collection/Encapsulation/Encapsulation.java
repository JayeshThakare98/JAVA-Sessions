package com.collection.Encapsulation;

public class Encapsulation {
private String colour  ;
private String varient ;
private int number ; 
String brand = "Tata" ; 
// getters and setteres 
// Access modifier , return type , method name , parameter , method body 
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getVarient() {
	return varient;
}
public void setVarient(String varient) {
	this.varient = varient;
}
//methods Start 
//stop
//drift 
void start () {
	System.out.println("Car is Started ");
}
}
