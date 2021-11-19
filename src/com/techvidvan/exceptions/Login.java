package com.techvidvan.exceptions;

public class Login {
	public static void main(String[] args) {
		Login login = new Login();
		try {
			login.doLogin("ajay");
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void doLogin(String username) throws UserNotFoundException{
		//calldb
		throw new UserNotFoundException(username + " does not exist ");
	}
}
