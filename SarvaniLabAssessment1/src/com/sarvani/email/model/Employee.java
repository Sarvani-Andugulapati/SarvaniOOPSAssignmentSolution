package com.sarvani.email.model;
public class Employee {
	private String FirstName;
	private String LastName;
public void Employee(String FirstName,String LastName) {
	this.FirstName= FirstName;
	this.LastName=LastName;
	}
public Employee() {
	super();
}
public String getFirstName() {
	return (FirstName);
}
public String setFirstName(String FirstName) {
	this.FirstName=FirstName;
	return FirstName;
}
public String getLastName(){
	return( LastName);

}
public String setLastName(String LastName) {
	this.LastName=LastName;
	return LastName;
}
}
