package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {
	
	FrontTimes multiple3 = new FrontTimes ();

	@Test
	public void test_if_zeroString_and_n2_return_zeroString() {
			assertEquals("", multiple3.generateString("",2));	
	}
	
	@Test
	public void test_if_2String_and_n0_return_zeroString() {
			assertEquals("", multiple3.generateString("ab",0));	
	}
	@Test
	public void test_if_3String_and_n0_return_zeroString() {
			assertEquals("", multiple3.generateString("abc",0));	
	}
		
	@Test
	public void test_if_moreThan3String_and_n0_return_zeroString() {
			assertEquals("", multiple3.generateString("abcd",0));	
	}
	
	@Test
	public void test_if_1String_and_n1_return_1String() {
			assertEquals("a", multiple3.generateString("a",1));	
	}
	
	@Test
	public void test_if_1String_and_n2_return_2String() {
			assertEquals("aa", multiple3.generateString("a",2));	
	}
	
	@Test
	public void test_if_2String_and_n1_return_1String() {
			assertEquals("ab", multiple3.generateString("ab",1));	
	}
	
	@Test
	public void test_if_2String_and_n2_return_2String() {
			assertEquals("abab", multiple3.generateString("ab",2));	
	}
	
	@Test
	public void test_if_3String_and_n1_return_1String() {
			assertEquals("abc", multiple3.generateString("abc",1));	
	}
	
	@Test
	public void test_if_3String_and_n2_return_2String() {
			assertEquals("abcabc", multiple3.generateString("abc",2));	
	}
	
	@Test
	public void test_if_4String_and_n1_return_1subString() {
			assertEquals("abc", multiple3.generateString("abcd",1));	
	}
	
	@Test
	public void test_if_4String_and_n2_return_2subString() {
			assertEquals("abcabc", multiple3.generateString("abcd",2));	
	}
	
	

}
