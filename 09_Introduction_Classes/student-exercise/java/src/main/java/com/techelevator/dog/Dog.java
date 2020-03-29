package com.techelevator.dog;

public class Dog {

	/* Data member
	 * isSleeping - boolean
	 */
	
	private boolean isSleeping;
	
	public Dog() {
		this.isSleeping = false; // Set dog are awake by default.
		
	}

	public boolean isSleeping() { // Create getter
		return isSleeping;
	}

	
	
	public String makeSound()  // Create makeSound method
		{
			if(isSleeping == true) 
			{
			return "Zzzzz...";
			} 
			return ("Woof!");
			
		}
	
		public void sleep()  // Create sleep method 
		{
			isSleeping = true;
		}
		
		
		public void wakeUp() // create wakeup method
		{
			isSleeping = false;
		}
	
}
