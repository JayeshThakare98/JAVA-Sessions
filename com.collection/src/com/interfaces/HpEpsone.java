package com.interfaces;

public class HpEpsone implements ScannerOne ,Printer {

	@Override
	public void printing() {
		System.out.println("Epsone is printing");		
	}

	@Override
	public void scann() {
		System.out.println("Epsone is scanning ");
		
	}

}
