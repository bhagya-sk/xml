package com.reactiveworks.jaxb.bind;


import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="employee")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL) //to order the elements alphabetically
@XmlAccessorType (XmlAccessType.FIELD) // only all public fields (non-static) will be automatically included for marshalling.No getter will be considered.
public class Employee {

	@XmlAttribute
	private int empNo;
	@XmlTransient  //Prevents mapping a field or property to the XML Schema
	private double salary;
	
	@XmlElement()
	private String lastName;
	
	@XmlElement
	private String firstName;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", salary=" + salary + ", lastName=" + lastName + ", firstName=" + firstName
				+ "]";
	}
	
}