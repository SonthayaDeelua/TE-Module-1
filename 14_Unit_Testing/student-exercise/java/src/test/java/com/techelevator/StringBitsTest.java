package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {
	StringBits newString = new StringBits();

	@Test
	public void test_if_null_String_return_null() {
		String sample = ""; 
		assertEquals("", newString.getBits(sample));		
	}
	
	@Test
	public void test_if_String_1_return_1() {
		String sample = "a";
		assertEquals("a", newString.getBits(sample));		
	}

	@Test 
	public void test_if_String_2_return_1() {
		String sample = "ab";
		assertEquals("a", newString.getBits(sample));		
	}
	
	@Test
	public void test_if_String_3_return_13() {
		String sample = "abc";
		assertEquals("ac", newString.getBits(sample));		
	}
	
	@Test
	public void test_if_String_4_return_13() {
		String sample = "abcd";
		assertEquals("ac", newString.getBits(sample));		
	}
	
	@Test
	public void test_if_String_5_return_135() {
		String sample = "abcdf";
		assertEquals("acf", newString.getBits(sample));	
	}
}
