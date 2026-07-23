package com.collection.inheritence;

public class ParentSuperClass {
// types of inheritance
/*1)Single inheritance
 * 2)Multilevel inheritance
 * 3) Hierarchical inheritance
 * b . doesnt support directly into java 
 * 1) Hybrid inheritance
 * 2)Multiple inheritance
 *  extend key word :- class A (Parent) -> class B (Child) (Extend)
 *  Animal -> Four legs ,eat
 *  diff types of animal -> cats , dogs , cow , horse ,donkey 
 */
	public static void main(String[] args) {
		//  i want to create a dog class object 
		Dog dogObj = new Dog () ; 
		dogObj.bark(); //from Child class (own method)
		dogObj.eat() ; //from Parent class (inherited method )
		
		// i want to create object of DogPuppy (grand child )
		DogPuupy dpObj = new DogPuupy() ; 
		dpObj.bark(); //parent
		dpObj.eat(); // Grand Parent
		dpObj.sleep(); // self
		
	}
}
