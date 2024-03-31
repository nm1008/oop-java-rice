package com.in28minutes.oop;

public class Recipe1Abstract extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get Utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dishes");

	}

	@Override
	void cleanUp() {
		System.out.println("Clean up the utensils");

	}

}
