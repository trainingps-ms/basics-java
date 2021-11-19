package com.basics;

public abstract class Person { //abstract method
	public abstract void work();
	
	public void sleep() { //concrete method
		System.out.println("sleeping");
	}

}
class Doctor extends Person{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("treat people");
	}
}
class Engineer extends Person{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("solve real life problems.");
		
	}	
}
