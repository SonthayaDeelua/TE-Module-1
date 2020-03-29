package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {
	
	Lucky13 lucky31 = new Lucky13();
	
	@Test
	public void test_if_no_1_and_no_3_true() {		
		int[] even = {2,4,6};		 
		assertTrue(lucky31.getLucky(even));		
	}
	
	@Test
	public void test_if_1_in_array_false() {		
		int[] even = {1,4,6};		
		assertFalse(lucky31.getLucky(even));	
	}
	
	@Test
	public void test_if_3_in_array_false() {		
		int[] even = {3,4,6};		
		assertFalse(lucky31.getLucky(even));	
	}
	
	@Test
	public void test_if_1_and_3_in_array_false() {		
		int[] even = {1,3,6};		
		assertFalse(lucky31.getLucky(even));	
	}
	
}
