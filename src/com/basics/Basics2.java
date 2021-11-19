package com.basics;

public class Basics2 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.name = "Ajay";
		a1.age = 20;
		System.out.println(a1.hashCode());
		System.out.println(a1);

	}
}

//object class is the base class for all class
//DRY principle
class A1 {// object
	String name;
	int age;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + this.age;
	}
}