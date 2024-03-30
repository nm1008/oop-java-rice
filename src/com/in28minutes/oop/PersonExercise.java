package com.in28minutes.oop;

public class PersonExercise {
	protected String name;
	protected int phoneNumber;
	protected String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("name is - %s, email is - %s, phoneNumber is - %s", name, email, phoneNumber);
	}

}
