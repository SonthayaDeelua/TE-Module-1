package com.techelevator.PostageCalculatorNew;

public class FexEd implements DeliveryDriverNew {

	
	

	@Override
	public double getCalculateRate(int distance, double weight) {
		double fedExRate = 20.00;
		if(distance > 500) {
			fedExRate = fedExRate + 5.00;
		} else if(weight > 48) {
			fedExRate = fedExRate + 3.00;
			
		}
		  return fedExRate;
	}

	@Override
	public String getName() {
		return "FexEd";
	}
}


