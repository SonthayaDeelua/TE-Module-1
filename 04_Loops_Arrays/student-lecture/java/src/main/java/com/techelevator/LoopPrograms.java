package com.techelevator;

public class LoopPrograms {

	public static void main(String[] args) {
		/* 
		 * Use the nums array, calculate the average, find the smallest
		 * and the largest values.
		 */
		int[] nums = {5,7,12,1,24,3};
		int total = 0, smallest = nums[0], largest = nums[0];
		
		for (int x = 0; x < nums.length; ++x) {
			//accumulate the total of the array values
			total += nums[x];
			
			//find the smallest value
			if (nums[x] < smallest){
				smallest = nums[x];
			}
			if (nums[x] > largest) {
				largest = nums[x];
			}
		}
		// calculate the average
		double avg = (double) total / nums.length;
		// print the result
		System.out.println("Smallest :" + smallest);
		System.out.println("Largest :" + largest);
		System.out.println("Average :" + String.format("%.3f", avg));
		
		countByFivesLoop();
	}


	public static void countByFivesLoop() {
		
		System.out.println("\n\nPrinting by 5s from 10 to 100 inclusive");
		for (int x = 10; x <= 100; x+=5) {
			System.out.println(x);
		}
	
}
}
