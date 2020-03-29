package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReTakeExerciseTest {

	private ReTakeExercise exercises = new ReTakeExercise();

	/*
	 sleepIn(false, false) → true
	 sleepIn(true, false) → false
	 sleepIn(false, true) → true
	 */
	@Test
	public void checkIfSleep() {
		assertEquals("sleepIn(false, false)", true, exercises.sleepIn(false, false));
		assertEquals("sleepIn(true, false)", false, exercises.sleepIn(true, false));
		assertEquals("sleepIn(false, true)", true, exercises.sleepIn(false, true));
		assertEquals("sleepIn(true, true)", true, exercises.sleepIn(true, true));
	}
	
	@Test
	public void monkeyTrouble() {
		assertEquals("Input: monkeyTrouble(true, true)", true, exercises.monkeyTrouble(true, true));
		assertEquals("Input: monkeyTrouble(false, false)", true, exercises.monkeyTrouble(false, false));
		assertEquals("Input: monkeyTrouble(true, false)", false, exercises.monkeyTrouble(true, false));
		assertEquals("Input: monkeyTrouble(false, true)", false, exercises.monkeyTrouble(false, true));
	}
	
	@Test
	public void sumDouble() {
		assertEquals("Input: sumDouble(1, 2)", 3, exercises.sumDouble(1, 2));
		assertEquals("Input: sumDouble(3, 2)", 5, exercises.sumDouble(3, 2));
		assertEquals("Input: sumDouble(2, 2)", 8, exercises.sumDouble(2, 2));
		assertEquals("Input: sumDouble(2, 2)", -1, exercises.sumDouble(-1, 0));
		assertEquals("Input: sumDouble(2, 2)", 12, exercises.sumDouble(3, 3));
		assertEquals("Input: sumDouble(2, 2)", 0, exercises.sumDouble(0, 0));
		assertEquals("Input: sumDouble(2, 2)", 1, exercises.sumDouble(0, 1));
		assertEquals("Input: sumDouble(2, 2)", 7, exercises.sumDouble(3, 4));
	}
	
	/*
	 inOrderEqual(2, 5, 11, false) → true
	 inOrderEqual(5, 7, 6, false) → false
	 inOrderEqual(5, 5, 7, true) → true
	 */
	@Test
	public void inOrderEqual() {
		assertEquals("Input: inOrderEqual(2, 5, 11, false)", true, exercises.inOrderEqual(2, 5, 11, false));
		assertEquals("Input: inOrderEqual(5, 7, 6, false)", false, exercises.inOrderEqual(5, 7, 6, false));
		assertEquals("Input: inOrderEqual(5, 5, 7, true)", true, exercises.inOrderEqual(5, 5, 7, true));
		assertEquals("Input: inOrderEqual(5, 7, 6, true)", false, exercises.inOrderEqual(5, 7, 6, true));
		assertEquals("Input: inOrderEqual(5, 5, 5, true)", true, exercises.inOrderEqual(5, 5, 5, true));
		assertEquals("Input: inOrderEqual(1, 5, 5, true)", true, exercises.inOrderEqual(1, 5, 5, true));
		assertEquals("Input: inOrderEqual(6, 5, 5, true)", false, exercises.inOrderEqual(6, 5, 5, true));
	}
	
	/*
	 loneSum(1, 2, 3) → 6
	 loneSum(3, 2, 3) → 2
	 loneSum(3, 3, 3) → 0
	 */
	@Test
	public void loneSum() {
		assertEquals("Input: loneSum(1, 2, 3)", 6, exercises.loneSum(1, 2, 3));
		assertEquals("Input: loneSum(3, 2, 3)", 2, exercises.loneSum(3, 2, 3));
		assertEquals("Input: loneSum(3, 3, 3)", 0, exercises.loneSum(3, 3, 3));
		assertEquals("Input: loneSum(0, 1, 1)", 0, exercises.loneSum(0, 1, 1));
		assertEquals("Input: loneSum(3, 1, 1)", 3, exercises.loneSum(3, 1, 1));
		assertEquals("Input: loneSum(1, 1, 5)", 5, exercises.loneSum(1, 1, 5));
	}
	
	/*
	 luckySum(1, 2, 3) → 6
	 luckySum(1, 2, 13) → 3
	 luckySum(1, 13, 3) → 1
	 luckySum(13, 1, 3) → 3
	 luckySum(13, 13, 3) → 0
	 */
	@Test
	public void luckySum() {
		assertEquals("Input: luckySum(1, 2, 3)", 6, exercises.luckySum(1, 2, 3));
		assertEquals("Input: luckySum(1, 2, 13)", 3, exercises.luckySum(1, 2, 13));
		assertEquals("Input: luckySum(1, 13, 3)", 1, exercises.luckySum(1, 13, 3));
		assertEquals("Input: luckySum(13, 1, 3)", 3, exercises.luckySum(13, 1, 3));
		assertEquals("Input: luckySum(13, 13, 3)", 0, exercises.luckySum(13, 13, 3));
		assertEquals("Input: luckySum(13, 13, 13)", 0, exercises.luckySum(13, 13, 13));
	}


	

}
