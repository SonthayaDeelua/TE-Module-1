package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLastTest {
	
	SameFirstLast  firstLastSame = new SameFirstLast();

	@Test
	public void test_if_null_return_false() {
		int[] test = {};
		boolean result = false;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}
	
	@Test
	public void test_if_length_1_return_true() {
		int[] test = {1};
		boolean result = true;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}
	
	@Test
	public void test_if_length_2_and_same_value_return_true() {
		int[] test = {1,1};
		boolean result = true;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}
	
	@Test
	public void test_if_length_2_and_different_value_return_false() {
		int[] test = {1,2};
		boolean result = false;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}

	@Test
	public void test_if_length_3_and_same_value_return_true() {
		int[] test = {1,5,1};
		boolean result = true;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}
	
	@Test
	public void test_if_length_3_and_different_value_return_false() {
		int[] test = {1,2,3};
		boolean result = false;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}
	
	@Test
	public void test_if_all_same_value_return_true() {
		int[] test = {3,3,3,3};
		boolean result = true;
		assertEquals(result,firstLastSame.isItTheSame(test));
	}

}   
 