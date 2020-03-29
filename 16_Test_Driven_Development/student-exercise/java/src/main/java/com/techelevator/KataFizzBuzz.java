package com.techelevator;

public class KataFizzBuzz {
	
	String result = "";

	public String fizzBuzz(int number) {
		
		String numberString = Integer.toString(number);
		
		if(number >=1 && number <= 100) {
			if((number%3==0 && number%5==0) || (numberString.contains("3") && numberString.contains("5"))){
				result = result + "FizzBuzz";
			}else if(number%5==0 || (numberString.contains("5"))) {
				result = result + "Buzz";
			}else if(number%3==0 || (numberString.contains("3"))){
				result = result + "Fizz";
			}else {
				result = numberString;
			}
		}
		return result;
		
	}
}