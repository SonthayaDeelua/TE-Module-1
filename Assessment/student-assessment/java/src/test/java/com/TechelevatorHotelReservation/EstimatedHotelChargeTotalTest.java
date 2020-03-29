package com.TechelevatorHotelReservation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techelevator.FlowerShopOrder;

public class EstimatedHotelChargeTotalTest {
	
	HotelReservation test = new HotelReservation ("Joe Morgan", 5);

	@Test
	public void test_Sonthaya_for_2night_return_119_98() {
		HotelReservation newBooking = new HotelReservation("Sonthaya", 2);
		double total = 0;
		total = total + newBooking.getEstimatedTotal();
		double expected = 119.98;
		assertEquals(expected, total, .00001);
	}
	
	@Test
	public void test_Sonthaya_for_0night_return_0() {
		HotelReservation newBooking = new HotelReservation("Sonthaya", 0);
		double total = 0;
		total = total + newBooking.getEstimatedTotal();
		double expected = 0;
		assertEquals(expected, total, .00001);
	}
	
	@Test
	public void test_Sonthaya_for_10night_return_599_90() {
		HotelReservation newBooking = new HotelReservation("Sonthaya", 10);
		double total = 0;
		total = total + newBooking.getEstimatedTotal();
		double expected = 599.90;
		assertEquals(expected, total, .00001);
	}


}
