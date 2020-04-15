package com.reactiveworks.jaxb.bind;

public class Student {
	
	private String firstName;
	private String lastName;
	private int rollNo;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Student [firstName:" + firstName + ", lastName:" + lastName + ", rollNo:" + rollNo
				+ "]";
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
