package com.techelevator.farm;

public class Cat extends FarmAnimal {

	public Cat() {
		super("Cat", "meow");
	}
	
//we changed getSound to be final in the parent 
//therefore it CANNOT be overriden
//	public String getSound() {
//		return sound;
//	}

}
