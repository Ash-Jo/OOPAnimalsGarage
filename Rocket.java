package com.qa.oopAnimalsGarage;

public class Rocket extends Vehicle{
	
	private boolean inService;
	private String primaryUse;
	
	
	public Rocket(String primaryUse, boolean inService) {
		this.primaryUse = primaryUse;
		this.inService = true;
	
	}
}
