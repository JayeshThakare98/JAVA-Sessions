package com.customexception;

public class InvalidAgeException extends Exception{
	
//	public InvalidAgeException () {
//		super() ; 
//	}
	
	public InvalidAgeException (String mesg) {
		super(mesg) ; 
	}

}
