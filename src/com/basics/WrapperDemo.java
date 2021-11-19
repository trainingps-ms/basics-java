package com.basics;

//auto boxing:wrap primitive value into object
//auto unboxing:wrap object into primitive value
public class WrapperDemo {
	public static void main(String[] args) {
		int a =1;//primitive
		Integer b = new Integer(2);//object
		System.out.println(b.doubleValue());
		
		double d1 = Double.parseDouble("2.3");
		Double objRef = d1;//auto boxing
		Double d2 = new Double (2.4);
		double d3 = d2;//auto unboxing
		System.out.println(d3);
	}
}
