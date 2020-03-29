package com.TechelevatorHotelReservation;

public class HotelReservation {
	private String name;
	private int numberOfNights;
	private double estimatedTotal;

	public HotelReservation(String name, int numberOfNights) {

		this.name = name;
		this.numberOfNights = numberOfNights;
		this.estimatedTotal = 59.99 * numberOfNights;

	}

	public double getEstimatedTotal() {
		return estimatedTotal;
	}

	public double actualTotalUsing(boolean maidRequired, boolean useMinibar) {

		double actualSpend = 0;

		if (maidRequired) {
			if (useMinibar) {
				actualSpend = 12.99 + (34.99 * 2);
			} else {
				actualSpend = 34.99;
			}
		}

		return actualSpend;
	}

	@Override
	public String toString() {
		return "RESERVATION - " + name + " - " + estimatedTotal;
	}

}
