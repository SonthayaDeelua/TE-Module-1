package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double finalTemp,startTemp;

		
		System.out.println("Please Input Temparature");
		String temp = input.nextLine();
		startTemp = Double.parseDouble(temp);
		
		System.out.println("Type C if in Celsious or Type F if in Fahrenheit");
		String tempType = input.nextLine();
		
		if((tempType.equals("C")) || (tempType.equals("c"))){
			
			finalTemp = (startTemp*1.8) + 32;
			System.out.println(String.format("%.0f",startTemp)+"C  is "+String.format("%.0f",finalTemp)+"F");
			
		}else 
			
		if((tempType.equals("F")) || (tempType.equals("f"))) {
			
			finalTemp = (startTemp - 32) / 1.8;	
			System.out.println(String.format("%.0f",startTemp)+"F  is "+String.format("%.0f",finalTemp)+"C");
			
		}else
			
			System.out.println("Please input the valid temperature");	
		
		input.close();

	}
	
}

