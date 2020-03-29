package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxEnd3Test {
	
	MaxEnd3 newMax = new MaxEnd3();
	
	@Test
	public void test_if_first_is_max_return_first() {
		int[] start = {5,2,1};
		int[] result = {5,5,5};
		
		assertArrayEquals(result, newMax.makeArray(start));		
	}
	
	@Test
	public void test_if_last_is_max_return_last() { 
		int[] start = {5,2,7};
		int[] result = {7,7,7};
		
		assertArrayEquals(result, newMax.makeArray(start));		
	}
	
	@Test
	public void test_if_first_and_last_same_value_return_value() {
		int[] start = {5,2,5};
		int[] result = {5,5,5};
		
		assertArrayEquals(result, newMax.makeArray(start));		
	}

}
 