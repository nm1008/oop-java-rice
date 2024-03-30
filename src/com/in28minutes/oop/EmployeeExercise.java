package com.in28minutes.oop;

public class EmployeeExercise extends PersonExercise {

	private String employer;
	private int employeeGrade;
	private int salary;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format(
				"name is - %s, phoneNumber is - %s, email is - %s, salary is - %d, employeeGrade is - %d, title is - %s, employer is - %s",
				name, phoneNumber, email, salary, employeeGrade, title, employer);
	}

}
