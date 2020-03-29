package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double finalValue,startValue;

		
		System.out.println("Please input the value ");
		String value = input.nextLine();
		startValue = Double.parseDouble(value);
		
		System.out.println("Type M if this is in Maters or Type F if in Feet");
		String measurement = input.nextLine();
		
		if((measurement.equals("M")) || (measurement.equals("m"))){
			
			finalValue = startValue*3.2808399;
			System.out.println(String.format("%.0f",startValue)+"M  is "+String.format("%.0f",finalValue)+"F");
			
		}else 
			
		if((measurement.equals("F")) || (measurement.equals("f"))) {
			
			finalValue = startValue*0.3048;
			System.out.println(String.format("%.0f",startValue)+"F  is "+String.format("%.0f",finalValue)+"M");
			
		}else
			
			System.out.println("Please input the valid value");	
		
		input.close();

	}
	
}


