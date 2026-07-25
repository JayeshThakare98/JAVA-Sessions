package com.abstraction;

public class AbsClass {
//	Topic we gonna cover today 
//1) Abstract class
//2)Interfaces 
/*normal class :- (POJO Class- Plain Old Java Object:- Instance Variable,constructor , getter setteres , any single method  )
 * public class ClassName{
 * int a ; // Instance Variable
 * String b ; //Instance Variable
 * constrctor 
 * getter /setter 
 * public static / nonstatic ReturnType MethodName(Parameteres){
 * Business Logic
 * }
 * }
 * ***** Type of method ******
 * 1) Concreate method -> Method with a body (Declaration {} ) 
 * 2) Abstract method -> Method with abstract Keyword or Method without a body
 * Abstract class :- it will declare as a abstract class
 * (it must have to use abstract keyword at a start of a class) , 
 * we are using abstract methods / concreate methods 
 * abstract  class ClassName{
 *    Instance Variable 
 *    methods :- abstract methods / concreate methods
 *  }
 * 
 * Abstract method :- 
 * abstract void methodName() ; // 100 % abs Method 
 * public static / nonstatic ReturnType methodName(Parameteres);// Partial ABS Method  
 * abstract Class B extends A {
 * 
 * Class B will have all the methods present into the parent class A
 * }
 *  abstract parent Z - run , drink , eat 
 *  child Y :- all methods from parent and its own methods as well 
 */
	public static void main(String[] args) {
		PuppyDog puppyDog = new PuppyDog() ; 
		puppyDog.bark();
	}
}
