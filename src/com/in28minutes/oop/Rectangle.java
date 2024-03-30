package com.in28minutes.oop;

public class Rectangle {

	// states
	private int length;
	private int width;

	// constructors
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
//		return make + " " + radius + " " + color;

		// docs - https://www.geeksforgeeks.org/java-string-format-method-with-examples/
		return String.format("length is - %d, width is - %d area is - %d perimeter is - %d", length, width, area(),
				perimeter());
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
