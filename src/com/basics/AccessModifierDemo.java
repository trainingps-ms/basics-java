package com.basics;

public class AccessModifierDemo {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.age);
//		System.out.println(a.salary);
		System.out.println(a.gender);
		System.out.println(a.name);
	}
}
class A{
	int age = 10;//default
	private int salary = 1000;
	public boolean gender =  true;
	protected String name = "Ram";
}
