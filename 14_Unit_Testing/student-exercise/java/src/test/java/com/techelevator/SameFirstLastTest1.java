package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLastTest1 {
	
	SameFirstLast  firstLast = new SameFirstLast();

	@Test
	public void test_if_null_return_false() {
		int[] nums = null;
		assertFalse(firstLast.isItTheSame(nums));	
	} 
	
	@Test
	public void test_length_1_return_true() {
		int[] nums = {1};
		assertTrue(firstLast.isItTheSame(nums));	
	}
	
	@Test
	public void test_length_two_not_same_return_false() {
		int[] nums = {1,2};
		assertFalse(firstLast.isItTheSame(nums));	
	}
	
	@Test
	public void test_length_3_not_same_return_false() {
		int[] nums = {1,2,3};
		assertFalse(firstLast.isItTheSame(nums));	
	}
	
	@Test
	public void test_length_two_same_return_true() {
		int[] nums = {1,1};
		assertTrue(firstLast.isItTheSame(nums));	
	}
	
	@Test
	public void test_length_3_same_return_true() {
		int[] nums = {3,2,3};
		assertTrue(firstLast.isItTheSame(nums));	
	}

	@Test
	public void test_length_5_same_return_true() {
		int[] nums = {3,2,4,5,3};
		assertTrue(firstLast.isItTheSame(nums));	
	}
	
	@Test
	public void test_length_5_not_same_return_false() {
		int[] nums = {3,2,4,5,8};
		assertFalse(firstLast.isItTheSame(nums));	
	}
}
