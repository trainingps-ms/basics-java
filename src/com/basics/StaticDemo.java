package com.basics;

//public class StaticDemo {
//	public static void main(String[] args) {
//		Account account1 = new Account();
//		System.out.println(account1.count);
//		Account account2 = new Account();
//		System.out.println(account2.count);
//	}
//}
//
//class Account{
//	int count = 0;
//	
//	public Account() {
//		count++;
//	}
//}

public class StaticDemo {
	public static void main(String[] args) {
		Account account1 = new Account();
		System.out.println(Account.count);
		Account account2 = new Account();
		System.out.println(Account.count);
	}
}

class Account{
	static int count = 0;
	
	public Account() {
		count++;
	}
}