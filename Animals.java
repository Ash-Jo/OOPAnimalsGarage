package com.qa.oopAnimalsGarage;

public class Animals {
	// 3 variables ///////////////////////////////////////////////////////////
	private String colour;
	private boolean lookingForFood;
	private int age;
	// 2 methods ////////////////////////////////////////////////////////////
	public void eat() {
		System.out.println("Chomp chomp ... *burp*");
	}

	public void move() {
		System.out.println("rustle rustle");
	}

	// Get-ters and Set-ters for the DataMembers ////////////////////////////
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isLookingForFood() {
		return lookingForFood;
	}

	public void setLookingForFood(boolean lookingForFood) {
		this.lookingForFood = lookingForFood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
