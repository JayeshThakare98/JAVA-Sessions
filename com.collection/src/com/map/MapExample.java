package com.map;

import java.util.HashMap;

public class MapExample {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<>() ;
//	 Object            objname = new Object () ; 
	hm.put(1, "One");
	hm.put(2, "Two");
	hm.put(3, "Three");
	hm.put(4, "Four");
	hm.put(5, null);
	hm.put(1, "five");
	
	System.out.println(hm);
	
	HashMap<String, Student> hm1 = new HashMap<>();
	
	hm1.put("Collage_1", new Student(101,"sam","A+"));
	hm1.put("clg2",new Student(102,"tom","B+"));
	hm1.put("clg3",new Student(103,"Athrav","A-"));
	hm1.put("clg4",new Student(104,"nia","AB+"));
	hm1.put("clg5",new Student(105,"Joe","O-"));
	hm1.put("clg6",new Student(106,"JAck","A+"));
	hm1.put("clg7", new Student(107, "tom", "o+"));
	// syso hm1 -> tom 
	hm1.put("clg7", new Student(107, "Raja", "o+"));
	
	System.out.println(hm1); // - > raja
	// searching in map 
//	 Object objname = new Object () ; 
	
	if(hm1.containsKey("clg7")) {
		hm1.get("clg7").setName("Jimmy");
	}
	System.out.println(hm1); // -> Jimmy
	// Delete in HM 
	String keyToRemove = "clg7";
	Student removedStu= hm1.remove(keyToRemove) ; 
	System.out.println("Removed ELment from map :- "+ removedStu);
	System.out.println(hm1);
	
	if(hm1.containsKey("clg7")) {
		hm1.get("clg7").setName("YOYO");
	}
	System.out.println(hm1);
}
}
