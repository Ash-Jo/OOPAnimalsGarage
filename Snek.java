package com.qa.oopAnimalsGarage;

public class Snek extends Reptiles{
	
	private String species;
	
	
	public Snek(int noOfLegs, boolean hasScales, boolean coldBlood, String species) {
		super(noOfLegs, hasScales, coldBlood);
		this.species = species;
	}
}