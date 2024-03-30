package com.in28minutes.oop;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Asimo", 0.123, "White");
//		fan.switchOn();
//		System.out.println(fan);
//		fan.setSpeed((byte) 3); // needed to declare data type for method arguments
//		System.out.println(fan);
//		fan.switchOff();
//		System.out.println(fan);
//		System.out.println(fan.FanDetails());

		Rectangle rectangle = new Rectangle(20, 26);
//		System.out.println(rectangle);

		Address homeAddress = new Address("line1", "Tondo", "1012");
		Customer customer = new Customer("Nikko", homeAddress, null);
//		customer.setWorkAddress(homeAddress);
//		System.out.println(customer);

		Book book = new Book(123, "OOP Programming with Java", "Nikko", null);
//		book.addReview(new Review(10, "Great Book", 5));
//		book.addReview(new Review(10, "Great Book", 5));
//		System.out.println(book);

		Student student = new Student();
//		student.setName("Nikko");
//		student.setEmail("nikko@example.com");

//		PersonInheritance person = new PersonInheritance(); // duplicate line 36
//		System.out.println(person); // parent class is always default extends .toString()
//		System.out.println(person.toString());

		PersonExercise person = new PersonExercise();

		StudentExercise student1 = new StudentExercise();
		student1.setName("Student Nikko");
		student1.setPhoneNumber(123);
		student1.setEmail("test@student.com");
		student1.setCollege("CEU");
		student1.setClassName("Progamming");
//		System.out.println(student1.getName());
//		System.out.println(student1.getPhoneNumber());
		System.out.println(student1);

		EmployeeExercise employee = new EmployeeExercise();
		employee.setName("Employee Nikko");
		employee.setPhoneNumber(312);
		employee.setEmployeeGrade(8);
		employee.setTitle("Probationary");
		employee.setSalary(99999999);
		employee.setEmployer("Ascenture");
		employee.setEmail("test@employee.com");
//		System.out.println(employee.getName());
//		System.out.println(employee.getPhoneNumber());
		System.out.println(employee);
	}
}
