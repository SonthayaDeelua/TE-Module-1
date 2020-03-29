package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {
	
	private int numberOfAxles;
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	

	@Override
	public double getCalculateToll(int distance) {
		// TODO Auto-generated method stub
		double toll = 0;
		if(numberOfAxles == 4) {
			toll = (double) distance * 0.040;
		}else 
			if (numberOfAxles == 6){
				toll = (double)distance * 0.045;
			}else
				if(numberOfAxles >= 8) {
					toll = (double)distance * 0.048;
				}
		
		return toll;
			
	}

	@Override
	public String getType() {
		if(numberOfAxles == 4) {
			return "Truck (4 axels)";
		}else 
			if(numberOfAxles == 6) {
				return "Truck (6 axels)";
			}
			else {
				return "Truck (8 axels)"; 
			}
	}

}
