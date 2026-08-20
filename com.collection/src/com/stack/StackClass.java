package com.stack;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<String> subStack = new Stack<>(); 
		subStack.push("mobile computing"); 
		subStack.push("Maths"); 
		subStack.push("java"); 
		subStack.push("sanskrit");
		subStack.push("Marathi");
		
		subStack.pop();
		subStack.pop();
		for(String a : subStack ) {
			System.out.println(a);
		}
	}
/*
 * Quick recap :-  vectors are as a String, integer 
 * Array List - > ArrayList <String> al = new ArrayList<>(); 
 * Linklist ->  LinkList <String> lL = new LinkList<>();
 * Stack -> Stack <String> stk = new Stack<>() ; 
 * 
 *  integer
 *  ArrayList <Integer> nums = new ArrayList<>();
 *  LinkList<Integer> nums = new LinkList<>();
 *  Stack <Intger> nums = new Stack<>();
 * 
 * Advance data manupalation 
 * List <String> list1 = new  ArrayList<>();
 * List <String> list2 = new LinkList<>();
 * List <String> list3 = new Stack<>() ; 
 * 
 */
}
