package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AnimalGroupNameTest {
	AnimalGroupName animals = new AnimalGroupName();
	
	@Test
	public void test_if_giraffe_return_Tower() {
		assertEquals("Tower",animals.getHerd("giraffe"));	
	} 
	
	@Test
	public void test_if_Giraffe_return_Tower() {
		assertEquals("Tower", animals.getHerd("Giraffe"));
	}
	
	@Test
	public void test_if_blank_return_unknown() {
		assertEquals("unknown", animals.getHerd(""));
	}
	
	@Test 
	public void test_if_Duck_return_unknow() {
		assertEquals("unknown" , animals.getHerd("Duck"));
	}
	
	@Test
	public void test_if_crocodile_return_Float() {
		assertEquals("Float", animals.getHerd("crocodile"));
	}
	
		 
}

