package com.techelevator.PostageCalculatorNew;

public class Postal2ndClass implements DeliveryDriverNew {

	@Override
	public double getCalculateRate(int distance, double weight) {
		double rate = 0;
		if(weight <= 2.00) {
			rate = 0.0035*distance;
		}else if(weight <= 8.00) {
			rate = 0.0040*distance;
		}else if(weight <= 15.00) {
			rate =  0.0047*distance;
		}else if(weight <= 48.00) {
			rate =  0.0195*distance;
		}else if(weight <= 128.00) {
			rate = 0.0450 *distance;
		}else if(weight > 128.00) {
			rate = 0.0500*distance;
		}
		return rate;
	}
	


	@Override
	public String getName() {
		
		return "Postal Service (2nd Class)";
	}

}