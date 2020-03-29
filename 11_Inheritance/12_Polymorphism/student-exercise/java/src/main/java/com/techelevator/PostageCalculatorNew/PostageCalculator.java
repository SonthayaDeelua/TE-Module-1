package com.techelevator.PostageCalculatorNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PostageCalculator {
	public static void main(String [] args) {
		List <DeliveryDriverNew> deliveryOption = new ArrayList<DeliveryDriverNew>();
		Postal1stClass option1 = new Postal1stClass();
		Postal2ndClass option2 = new Postal2ndClass();
		Postal3rdClass option3 = new Postal3rdClass();
		FexEd		   option4 = new FexEd();
		SPUNextDay	   option5 = new SPUNextDay();
		SPU2Day        option6 = new SPU2Day();
		SPU4Day		   option7 = new SPU4Day();
		
		deliveryOption.add(option1);
		deliveryOption.add(option2);
		deliveryOption.add(option3);
		deliveryOption.add(option4);
		deliveryOption.add(option5);
		deliveryOption.add(option6);
		deliveryOption.add(option7);
		
		double weight;
		String unit = "";
		int distance;
		Scanner input = new Scanner(System.in);
		System.out.println("Please entre the weight of the package :");
		weight = Double.parseDouble(input.nextLine());
		System.out.println("Please type (P) for Pounds or type (O) for Ounces");
		while (!unit.equals("P") && !unit.equals("p") && !unit.equals("O") && !unit.equals("o")) {
		unit = input.nextLine();
		if(unit.equals("P") || unit.equals("p")) {
			weight = weight*16;
			}else if(unit.equals("O") || unit.equals("o")) {
				weight = weight + 0;
				}else {
					System.out.println("Please type (P) for Pounds or type (O) for Ounces");
						continue;
				}
		}
		System.out.println("What distance will it be traveling?");
		distance = Integer.parseInt(input.nextLine());
		System.out.println("");
		
		System.out.println("Delivery Method\t\t\t$ Cost");
		System.out.println("==============================================");
		for(DeliveryDriverNew d : deliveryOption) {
			if(d == option1 || d== option2 || d==option3) {				
			System.out.printf("%-20s   \t$%.2f\n", d.getName(),d.getCalculateRate(distance,weight));
			} else {
			System.out.printf("%-20s   \t\t$%.2f\n", d.getName(),d.getCalculateRate(distance,weight));
			input.close();
		}		

	}
}
}



