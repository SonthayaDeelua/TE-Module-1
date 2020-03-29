package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {

	private boolean hasTrailer;
	
	public Car (boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}
	
	@Override
	public double getCalculateToll(int distance) {
		// TODO Auto-generated method stub
		double toll = 0;
		if(!hasTrailer) {
			
			toll = (double)distance * 0.020;			
		}else {
			toll = (double)distance * 0.020;	
			toll = toll + 1;
		}
		return toll;
	}

	@Override
	public String getType() {
		if(hasTrailer == false) {
		return "Car";
	} else {
		return "Car (with trailer)";
	}

}
}
