package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {
	
	DateFashion catchTable = new DateFashion();

	@Test
	public void test_if_you_1_and_date_2() {
		
		assertEquals(0,catchTable.getATable(1,2));	
	}
	
	@Test
	public void test_if_you_2_and_date_5() {
		
		assertEquals(0,catchTable.getATable(2,5));	
	}
	
	@Test
	public void test_if_you_6_and_date_5() {
		
		assertEquals(1,catchTable.getATable(6,5));	
	}

	@Test
	public void test_if_you_5_and_date_8() {
		
		assertEquals(2,catchTable.getATable(5,8));	
	}

	@Test
	public void test_if_you_8_and_date_9() {
		 
		assertEquals(2,catchTable.getATable(8,9));	
	}
	
	@Test
	public void test_if_you_9_and_date_5() {
		
		assertEquals(2,catchTable.getATable(9,5));	
	}
	
	@Test
	public void test_if_you_5_and_date_2() {
		
		assertEquals(0,catchTable.getATable(5,2));	
	}
}
