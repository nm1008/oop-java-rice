package com.in28minutes.oop;

public class Customer {

	// states
	private String name;
	private Address homeAddress; // created another class that defines Address contents [object composition]
	private Address workAddress;

	public Address getHomeAddress() {
		return homeAddress;
	}

	// constructor
	public Customer(String name, Address homeAddress, Address workAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
//		return make + " " + radius + " " + color;

		// docs - https://www.geeksforgeeks.org/java-string-format-method-with-examples/
		return String.format("name- [%s], home address - [%s], work address - [%s]", name, homeAddress, workAddress);
	}

}
