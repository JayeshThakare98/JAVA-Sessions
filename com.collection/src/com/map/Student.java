package com.map;

import java.util.Objects;

public class Student {
	private int roll;
	private String name;
	private String bloodGroup;

	public Student() {
		super();
	}

	public Student(int roll, String name, String branch) {
		super();
		this.roll = roll;
		this.name = name;
		this.bloodGroup = branch;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return bloodGroup;
	}

	public void setBranch(String branch) {
		this.bloodGroup = branch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bloodGroup, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(bloodGroup, other.bloodGroup) && Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", bloodGroup=" + bloodGroup + "]";
	}
	
	

}
