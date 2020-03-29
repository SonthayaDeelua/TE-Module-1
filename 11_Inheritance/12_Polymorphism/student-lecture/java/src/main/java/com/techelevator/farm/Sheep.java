package com.techelevator.farm;

public class Sheep extends FarmAnimal implements Singable {
	 
	public Sheep() {
		super("Sheep" , "baa");
		
	}
	@Override
	public String getSoundOnce() {
		return "baba";
	}
	@Override
	public String getSoundTwice() {
		return "baa baa";
	}
}
