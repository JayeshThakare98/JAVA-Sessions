package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
public static void main(String[] args) {
	Set<String> hs = new HashSet<>(); 
	hs.add("peacock"); 
	hs.add("lion");
	hs.add("mouse");
	hs.add("mouse");
	hs.add(null);
	
	System.out.println(hs);
	
	// Linked hash set 
	LinkedHashSet<String> lS =  new LinkedHashSet<>();
	lS.add("apple"); 
	lS.add("papaya"); 
	lS.add("DragonFruite");
	lS.add("kiwi"); 
	lS.add(null);
	System.out.println(lS);
	
	TreeSet<String> ts = new TreeSet<>() ; 
	ts.add("c");
	ts.add("a");
	ts.add("z");
//	ts.add(null);
	System.out.println(ts); // acz null , null acz
	}
/*
 * Types of set :- 
 * hashset - > 3 propeties as it is like set
 * Linked hashset  -> 2 propeties as it is like set but works like LinkList folows Insertion order 
 * TreeSet - > 1) it also dont allow duplicate value ,not single null ,returns in  natural formate 
 * 9.2.1,4 - > 1,2,4,9
 * cbzya - > abcyz
 */ 

 
}
