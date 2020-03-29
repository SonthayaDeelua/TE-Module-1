package com.techelevator.PostageCalculatorNew;

public class SPUNextDay implements DeliveryDriverNew {

	@Override
	public double getCalculateRate(int distance, double weight) {
		double rate = (weight*0.075/16)*distance;
		return rate;
	}

	@Override
	public String getName() {
		return "SPU (Next Day)";
	}

}
