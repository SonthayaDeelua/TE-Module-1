package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WorldCountTest {
	
	WordCount  count = new WordCount();
	
	
	
	@Test
	public void test_if_null_should_return_null() {
		String [] test = null;
//		Map<String,Integer> result = new HashMap<String,Integer>();
		assertEquals(null,count.getCount(test));
	}

	@Test
	public void test_if_all_1_should_return_1() {
		String [] test = {"ab","bc","cd"};
		Map<String,Integer> result = new HashMap<String,Integer>();
		result.put("ab",1);
		result.put("bc",1);
		result.put("cd",1);		
		assertEquals(result, count.getCount(test));
	}
	
	@Test
	public void test_if_repeat_varies_shoud_return_varies() {
		String [] test = {"ab","bc","ab","bc","bc","a","abc"};
		Map<String,Integer> result = new HashMap<String,Integer>();
		result.put("ab",2);
		result.put("bc",3);
		result.put("a",1);	
		result.put("abc",1);
		assertEquals(result, count.getCount(test));
	}
 
}
