package com.basics;

class employeeCount{
	private int numOfEmployees = 0;
	
	public void setNoOfEmployees(int count) {
		if (count < 0) {
			throw new IllegalArgumentException("count cannot be negative");
		}
		numOfEmployees = count;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
}
public class EncapsulationDemo {

}
