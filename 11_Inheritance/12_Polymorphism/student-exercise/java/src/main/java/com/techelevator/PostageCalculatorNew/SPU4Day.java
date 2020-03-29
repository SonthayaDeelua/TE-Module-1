package com.techelevator.PostageCalculatorNew;

public class SPU4Day implements DeliveryDriverNew {

	@Override
	public double getCalculateRate(int distance, double weight) {
		double rate = (weight * 0.0050/16) * distance;
		return rate;
	}

	@Override
	public String getName() {

		return "SPU (4-Day Ground)";
	}

}
