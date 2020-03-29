package com.techelevator.TollBoothCalculator;

public interface Vehicle {
	//interfaces do not attribute(data member)
	public double getCalculateToll(int distance); // abstract method-implementer will provide body
	public String getType(); // abstract method - implementer will provide body
	
}
