package com.techelevator.TollBoothCalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;



public class TollCalculator {
	
	public static void main(String [] args) {
		List <Vehicle> tollCalculator = new ArrayList <Vehicle>();
		Car car1 = new Car (false);
		Car car2 = new Car (true);
		Truck truck1 = new Truck(4);
		Truck truck2 = new Truck(6);
		Truck truck3 = new Truck(8);
		Tank  tank	 = new Tank();
		
		tollCalculator.add(car1);
		tollCalculator.add(car2);
		tollCalculator.add(tank);
		tollCalculator.add(truck1);
		tollCalculator.add(truck2);
		tollCalculator.add(truck3);
		
		int totalDistance = 0;
		double totalTollFee = 0;
		DecimalFormat df = new DecimalFormat("#,###.##"); // way to set up last 2 digit
		df.setMinimumFractionDigits(2);
				
		System.out.println("Vehicle\t\t\tDistance Traveled\t\tToll $");
		System.out.println("==============================================================================");
		
		for (Vehicle v: tollCalculator) {
			int random = (int)(Math.random()*230)+ 10;
			totalDistance += random;
			totalTollFee  += v.getCalculateToll(random);
			System.out.printf("%-18s     %8d                         $%.2f\n", v.getType(), random, v.getCalculateToll(random));
		}
			System.out.println("");
			System.out.println("Total Miles Traveled:   " + totalDistance);
			System.out.println("Total Tollbooth Revenue:  $" + df.format(totalTollFee));
			System.out.println("==============================================================================");
		
		
		}
}
