package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	// we are making file explorer 
	public static void readFile() {
		FileReader fileReader;
		try {
			fileReader = new FileReader("github.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) throws IOException,FileNotFoundException,ArithmeticException{
		readFile();
		System.out.println("File is readed successfully");
	}

}
