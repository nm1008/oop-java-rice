package com.in28minutes.oop;

public class Fan {
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed;

	// constructor
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		System.out.println("test");
	}

	@Override // if method Fan() [parent class] this will be the output as well
	public String toString() {
//		return make + " " + radius + " " + color;

		// docs - https://www.geeksforgeeks.org/java-string-format-method-with-examples/
		return String.format("make- %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
	}

	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5); // converting int to byte (typecasting) for method arguments
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);// converting int to byte (typecasting) for method arguments
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

}
