package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	
	KataFizzBuzz  convertString = new KataFizzBuzz();
	
	@Test
	public void test_if_fizz_Buzz_1_return_1() {
		int x = 1;
		String string = "1";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
	@Test
	public void test_if_fizz_Buzz_5_return_Buzz() {
		int x = 5;
		String string = "Buzz";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
	
	@Test
	public void test_if_fizz_Buzz_3_return_Fizz() {
		int x = 3;
		String string = "Fizz";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
	@Test
	public void test_if_fizz_Buzz_15_return_FizzBuzz() {
		int x = 15;
		String string = "FizzBuzz";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
	
	@Test
	public void test_if_fizz_Buzz_86_return_string86() {
		int x = 86;
		String string = "86";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
	@Test
	public void test_if_fizz_Buzz_110_return_empty() {
		int x = 110;
		String string = "";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}

	@Test
	public void test_if_number_divisible_by_3_or_contain_3_convert_Fizz() {
		int x = 37;
		String string = "Fizz";
		assertEquals(string, convertString.fizzBuzz(x));				
	}
//	If the number is divisible by 5, OR contains a 5, convert the number to the string, "Buzz".
	@Test
	public void test_if_number_divisible_by_5_or_contain_5_convert_Buzz() {
		int x = 51;
		String string = "Buzz";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
//	If the number is divisible by 3 AND 5, OR contains a 3 AND 5, convert the number to the string, "FizzBuzz"
	@Test
	public void test_if_number_divisible_by_3and5_or_contain_35_return_FizzBuzz() {
		int x = 53;
		String string = "FizzBuzz";
		assertEquals(string, convertString.fizzBuzz(x));		
		
	}
}
