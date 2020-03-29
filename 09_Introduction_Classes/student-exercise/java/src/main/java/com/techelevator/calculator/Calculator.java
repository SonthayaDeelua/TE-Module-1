package com.techelevator.calculator;

public class Calculator {

	//Data member are
	//result - int
	//
	
	
	private int result;
	
	public Calculator()
	{
		this.result = 0;		
	}
		
	public int getResult() 
	{
		return result;
	}
	
	 //add(int addend)| int| Adds `addend` to `result` and returns the current value of `result 
		
	public int add(int addend)
	{
		result = result + addend;
		return result;
	}
	 //getResult() | int | Returns the current value of `result`.  
	 // already created above.
	
	
	 //multiply(int multiplier)| int | Multiplies current result by `multiplier` 
	//and returns the current value of `result`.  
	
	public int multiply(int multiplier)
	{
		result = result*multiplier;
		return result;
	}
	
	 //power(int exponent)| int | Raises `result` to power of `exponent`. 
	//Negative exponents should use the absolute value. Returns the current value of `result` |
	public int power(int exponent)
	
	{
		if(exponent <0)
		{
			exponent = Math.abs(exponent);
		}
		
		result = (int) Math.pow(result,exponent);
		return result;
	}
	
	 //reset()| void| Resets `result` to 0.  
	
	public void reset()
	{
		result = 0;
	}
	
	
	 //subtract(int subtrahend)| int| Subtracts `subtrahend` from the current value
	//of `result` and returns the current value of `result`.                            

	public int subtract(int substrahend)
	
	{
		result = result - substrahend;
		return result;
	}
}
