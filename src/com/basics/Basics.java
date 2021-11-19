package com.basics;

public class Basics {
	public static void main(String[] args) {
//		demo1();
		forLoop();
//		stringDemo();
	}
	private static void forLoop(){ 
		int i=1;
		for (; i < 10;) {
//			if(i==1)
//				break;
			System.out.println(++i);
			
		}
	}
	private static void stringDemo() {
		//String
		String s1 = new String("Sapient");
		System.out.println(s1);
//		new String("Sapient"); // create object only
		String s2 = s1;
		System.out.println(s2);
		String s3 = new String("Sapient"); //create reference only
		System.out.println(s3);
	}

	private static void demo1() {
		int age=11; //variable 4 bytes
//		System.out.println(age);
		age=10;
//		System.out.println(age);
		char character1='A'; // 2 bytes
		System.out.println(character1);
		age=character1; //implicit type casting,ascii value 65
		System.out.println(age);
	}
}

