package com.TechelevatorHotelReservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelReservationTest {
	
	HotelReservation test = new HotelReservation ("Joe Morgan", 5);

	@Test
	public void test_if_no_useMinibar_should_return_34_99() {
		double totalUsing = test.actualTotalUsing( true, false);
		double ExpectedResult = 34.99;
		assertEquals(34.99, totalUsing, .00001);
		
	}
	
	@Test
	public void test_if_useMinibar_should_return_82_97() {
		double totalUsing = test.actualTotalUsing( true, true);
		double ExpectedResult = 82.97;
		assertEquals(34.99, totalUsing, .00001);
		
	}

}
