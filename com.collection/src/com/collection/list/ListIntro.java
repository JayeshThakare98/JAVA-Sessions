package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIntro {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	int [] sarr = {};
//	for -> intialise from 1st position i have to end it with not including last element 
// creating am ArrayList 
// 1) Empty arryalist 
//	ArrayList<String> al =new ArrayList<>() ;
// 2) ArrayList with default size 
//	ArrayList<String> al1 = new ArrayList<>(50);
	ArrayList<String> studentList = new ArrayList<>() ; 
	studentList.add("Jayesh");
	studentList.add("Pranjali");
	studentList.add("Gayatri");
	studentList.add("Prachi");
	studentList.add(null);
	studentList.add(null);
	studentList.add("Prachi");
//	System.out.println(studentList);
//	System.out.println(studentList.size());
//	 Traversing A list 
//	1) for loop 
//	2) Enhanced for loop 
//	3)Iterator 
	System.out.println("Traversing A list with for loop");
	for(int i =0 ; i<studentList.size();i++) {
		System.out.println(studentList.get(i)); 
	}
	System.out.println("Traversing A list with Enhanced for loop");
	for(String a : studentList) {
		System.out.println(a);
	}
	System.out.println("Traversing A list with Iterator");
	Iterator <String> itr = studentList.iterator();
	while(itr.hasNext()) {
		String i = itr.next(); // i++
		System.out.println(i);
	}
}
}
