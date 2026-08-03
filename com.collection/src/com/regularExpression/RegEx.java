package com.regularExpression;

import java.util.regex.Pattern;

public class RegEx {
	/*# Regular Expression:
String str = "Eduvation"-> char ch = 'A'
A regular expression is a special sequence of characters that 
helps us to match or find other string or set of strings using a 
specialized syntax held in a pattern . it can be used to search,
edit, and manipulate text and data.

Example:
We can write a Regular Expression to represent all valid mail ids.
We can write a Regular Expression to represent all valid mobile numbers.

The main important application areas of Regular Expression are:
To implement validation logic.-> e.g signup page -> id , passward 
id - > abc@gmail.com , abc@yahoo.com , abc@hotmail.com , abc@eduvation.com , .in , .ai , 
.org , .co.in , .uk , .pk >> abcgmailcom ,
To develop Pattern matching applications.
mobile number -> +91 , +1 ,+93 (10 digits ,91,99,80,70,11,2)
To develop translators like compilers, interpreters etc.

To represent and use Regular Expressions in Java applications, Java has provided a
predefined library in the form of a package "java.util.regex".

The Pattern and Matcher class of this java.util.regex package provides the facility of java
regular expression.

A Pattern object represents "compiled version of Regular Expression".

To create Regular Expression in the form of Pattern object we have to use the
following method from java.util.regex.Pattern class
	 * 
	 */
	
	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("ph"); 
//		Matcher matcher = pattern.matcher("elephent is eating alphanso's photo");
//		
//		while (matcher.find()) {
//	System.out.println(matcher.start()+" - "+matcher.end()+" - "+matcher.group());
//		}
		// Stement 3 Split method 
  Pattern pat = Pattern.compile("\\s"); 
  String [] word = pat.split("elephent is eatingal phanso's photo");
  
  for(String str : word) {
	  System.out.println(str);
  }
		
//		
// statement 2 
		/*
		 * Pattern:    [789]     [0-5]{6}

                         |           |
                         |           +---> Rule 2: Next 6 characters must be digits from 0 to 5
                         +---------------> Rule 1: The 1st character must be 7, 8, or 9
		 */
		System.out.println(Pattern.matches("[789][0-9]{9}", "9123456780"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "6123456780"));
		System.out.println(Pattern.matches("[678][0-7]{6}", "6623455"));
		
		
	}

}
