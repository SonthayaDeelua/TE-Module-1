package com.techelevator.PostageCalculatorNew;

public class Postal1stClass implements DeliveryDriverNew {

	@Override
	public double getCalculateRate(int distance, double weight) {
		
		double rate = 0;
		if(weight <= 2.00) {
			rate = 0.035*distance;
		}else if(weight <= 8.00) {
			rate = 0.040*distance;
		}else if(weight <= 15.00) {
			rate = 0.047*distance;
		}else if(weight <= 48.00) {
			rate = 0.195*distance;
		}else if(weight <= 128.00) {
			rate = 0.450*distance;
		}else if(weight > 128.00) {
			rate = 0.500*distance;
		}
		return rate;
	}

	@Override
	public String getName() {
	
		return "Postal Service (1st Class)";
	}

}