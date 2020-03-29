package com.techelevator.PostageCalculatorNew;

public class SPU2Day implements DeliveryDriverNew {

	@Override
	public double getCalculateRate(int distance, double weight) {
		double rate = (weight * 0.050/16) * distance;
		return rate;
	}

	@Override
	public String getName() {
		return "SPU (2-Day Business)";
	}

}
