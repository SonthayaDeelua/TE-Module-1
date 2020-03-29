package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CigarPartyTest {
	
	CigarParty ifHaveParty = new CigarParty();
	
	boolean isWeekend = true;

	@Test
	public void test_if_notWeekend_and_have_20_Cigars() {
		assertFalse(ifHaveParty.haveParty(20, !isWeekend));		
	}
	
	@Test
	public void test_if_notWeekend_and_have_50_Cigars() {
		assertTrue(ifHaveParty.haveParty(50, !isWeekend));
	}
	
	@Test
	public void test_if_notWeekend_and_have_70_Cigars() {
		assertFalse(ifHaveParty.haveParty(70, !isWeekend));
	}
	
	@Test
	public void test_if_Weekend_and_have_10_Cigars() {
		assertFalse(ifHaveParty.haveParty(10, isWeekend));
	}
	
	@Test
	public void test_if_Weekend_and_have_55_Cigars() {
		assertTrue(ifHaveParty.haveParty(55, isWeekend));
	}
	
	@Test
	public void test_if_Weekend_and_have_80_Cigars() {
		assertTrue(ifHaveParty.haveParty(80, isWeekend));
	}
}

 