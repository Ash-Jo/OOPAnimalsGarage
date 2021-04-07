package com.qa.oopAnimalsGarage;

public class Reptiles extends Animals{
	// 3 Variables /////////////////////////////////////////////////
	private boolean hasScales;
	private boolean coldBlood;
	private int noOfLegs;
	
	// 2 methods /////////////////////////////////////////////////
	public Reptiles(int noOfLegs, boolean hasScales, boolean coldBlood) {
		this.noOfLegs = noOfLegs;
		this.hasScales = true;
		this.coldBlood = true;
	}
	
	public void layEggs() {
		System.out.println("Omelette");
	}

}
