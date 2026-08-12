package com.collection.list;

import java.util.ArrayList;

public class SerchInList {
public static void main(String[] args) {
//	 we have to make a list of integer from 1 to 5 natural numbers
//	int [] arr = {1,2,3,4,5};
	ArrayList<Integer> nums = new ArrayList<>(); 
	nums.add(1);
	nums.add(2);
	nums.add(3);
	nums.add(4);
	nums.add(5);
	for(int a : nums) {
		System.out.println(a);
	}
//	  we have to search for number 2  into the list 
	System.out.println(nums.contains(2)); // true 
	System.out.println(nums.contains(6)); // false 
//	int i =0 ; 
//	while(i<nums.size()){
//		System.out.println(i); 
//		i++;
//	} prachi will run this loop for elements 
	
}
}
