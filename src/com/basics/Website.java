package com.basics;

public class Website{
//	fields(or instance variable)
	String websiteName;
	int websiteAge;
	
//	constructor
	Website(String name, int age){
		this.websiteName = name;
		this.websiteAge  = age;
		
	}
	public static void name(String args[]) {
//		creating objects
		Website obj1 = new Website("Techvidvan",2);
		Website obj2 = new Website ("Google",18);
		
//		Accessing object data through reference
		System.out.println("Website Name: " + obj1.websiteName);
		System.out.println("age: " + obj1.websiteAge);
		System.out.println("Website Name: " + obj2.websiteName);
		System.out.println("age: " + obj2.websiteAge);
	}
}