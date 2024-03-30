package com.in28minutes.oop;

public class StudentExercise extends PersonExercise {

	private String college;
	private String className;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return String.format("name is - %s, phoneNumber is - %s, email is - %s, college is - %s, className is - %s",
				name, phoneNumber, email, college, className);
	}
}
