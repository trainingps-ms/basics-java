package com.basics;

import java.util.Date;

public class OverloadingDemo {
	public static void main(String[] args) {
		Student student = new Student("Ramesh");
		System.out.println(student.getName());
		
		Student student1 = new Student("John",new Date());
		System.out.println(student1.getName());
		System.out.println(student1.getDob());
	}
}

class Student{
	private String name;//instance variable
	private Date dob;
	public Student (String name) {
		if (name == null) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
	}
	public Student(String name,Date dob) {
		this(name);
		this.dob = dob;
	}
	public void study() {
		System.out.println(this.name + "is studying");
	}
	public void study(int duration) {
		System.out.println(this.name + "will study for "+duration+" hours");
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}	