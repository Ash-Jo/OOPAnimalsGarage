package com.qa.oopAnimalsGarage;


public class Vehicle {
	
	private boolean hasWheeles;
	private String fuelType;
	private int noOfPassengers;
	
	public void purpose() {
		System.out.println("Transport");
	}
	
	// Get-ters and Set-ters

	public boolean isHasWheeles() {
		return hasWheeles;
	}

	public void setHasWheeles(boolean hasWheeles) {
		this.hasWheeles = hasWheeles;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
}
