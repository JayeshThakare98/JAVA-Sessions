package com.customexception;

public class SeatNotAvailableException extends Exception{
	public SeatNotAvailableException(){
	super()	;
	}
	
	public SeatNotAvailableException(String msg){
		super(msg)	;
		}
}
