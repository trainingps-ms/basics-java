package com.exception;

public class UncheckedExceptions {
	public static void main(String[] args) {
//		printStackTrace() is used for exceptions logging
//		//ArrayIndexOutOfBoundsException
//		int array[] = {1,2,3,4,5};
//		System.out.println(array[7]);
		
		//NullPointerException
		String myString = null;
		try {
			System.out.println(myString.charAt(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("always called");
		}
	}

}
