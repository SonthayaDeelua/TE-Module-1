package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonStartTest {
	
	NonStart cut1 = new NonStart();

	@Test
	public void test_if_one_String_is_empty_String() {
		String first = "";
		String second = "second";
		
		assertEquals("econd",cut1.getPartialString(first,second));		
	} 
	
	@Test
	public void test_if_second_String_is_empty_String() {
		String first = "first";
		String second = "";
		
		assertEquals("irst",cut1.getPartialString(first,second));		
	}
	
	@Test
	public void test_if_both_String_have_more_than_3() {
		String first = "first";
		String second = "second";
		
		assertEquals("irstecond",cut1.getPartialString(first,second));		
	}

}
