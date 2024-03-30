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
		customer.setWorkAddress(homeAddress);
		System.out.println(customer);

	}
}
