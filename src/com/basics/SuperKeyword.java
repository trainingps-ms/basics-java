package com.basics;

public class SuperKeyword {
	public static void main(String[] args) {
		Child child = new Child("Ram");
		System.out.println(child.name);
		child.childWork();
	}
}

class Parent {
	public Parent(String name2) {
		this.name = name2;
	}

	String name;

	void work() {
		System.out.println(name + " is working");
	}
}

class Child extends Parent {
	public Child(String name) {
		super(name);

	}

	void childWork() {
		super.work();
	}
}