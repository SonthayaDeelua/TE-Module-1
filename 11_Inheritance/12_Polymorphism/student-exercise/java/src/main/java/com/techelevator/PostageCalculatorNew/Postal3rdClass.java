package com.techelevator.PostageCalculatorNew;

public class Postal3rdClass implements DeliveryDriverNew {

	@Override
	public double getCalculateRate(int distance, double weight) {
		double rate = 0;
		if(weight <= 2.00) {
			rate = 0.0020*distance;
		}else if(weight <= 8.00) {
			rate = 0.0022*distance;
		}else if(weight <= 15.00) {
			rate = 0.0024 *distance;
		}else if(weight <= 48.00) {
			rate = 0.0150*distance;
		}else if(weight <= 128.00) {
			rate = 0.0160 *distance;
		}else if(weight > 128.00) {
			rate = 0.0170*distance;
		}
		return rate;
	}
	


	@Override
	public String getName() {
		
		return "Postal Service (3rd Class)";
	}

}
