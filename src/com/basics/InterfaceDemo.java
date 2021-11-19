package com.basics;
//in interface objects are not created 
public class InterfaceDemo {
	public static void main(String[] args) {
		Person doctor ;//= new Doctor();
		//doctor.work();
		doctor = new Engineer();
		doctor.work();
	}
}

//interface dont interfare in class heirarchy
interface Person1 { //abstract method
	public abstract void work();
	
	public void sleep();
	
}
class Doctor1 implements Person1{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("treat people");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}
class Engineer1 implements Person1{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("solve real life problems.");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}	
}

