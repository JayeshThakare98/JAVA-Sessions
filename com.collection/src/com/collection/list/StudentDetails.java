package com.collection.list;

import java.util.ArrayList;

public class StudentDetails {
public static void main(String[] args) {
	ArrayList<Student> studentsList = new ArrayList<>() ;
	
	studentsList.add(new Student(1,"Jacob","Computer"));
	studentsList.add(new Student(12, "Bella", "Mechanical"));
	studentsList.add(new Student(21, "tom", "civil"));
	studentsList.add(new Student(45, "jerry", "electrical"));
	studentsList.add(new Student(54,"Henna","IT"));
	
	for(Student st : studentsList ) {
		System.out.println(st.getRoll());
		System.out.println(st.getBranch());
		System.out.println(st.getName());
		System.out.println(st);
	}
}
}
