package com.techelevator.review;

import java.util.HashMap;
import java.util.Map;

public class AnotherHashMapDemo {

	public static void main(String[] args) {
		//create a map for country and area
		Map <String,Double> countries = new HashMap<>();
		countries.put("Monaco", 0.78);
		countries.put("Grenada", 133.0);
		countries.put("Malta", 122.0);
		countries.put("Andorra", 181.0);
		countries.put("Dominica", 290.0);
		
		for(Map.Entry <String,Double> entry : countries.entrySet()){
			if(entry.getValue()>= 100.00 && entry.getValue() <= 200) {
				//System.out.println(entry.getKey() + " " + entry.getValue());
				System.out.printf("%-30s   %6.2f\n", entry.getKey(), entry.getValue());
				// %-30s says left justify a string in 30 characters wide
				//%6.2f says right justify a double (float) in 6 characters wide with
				// 2 decimal places to the right of the decimal point
				//try to understand this one for better printing format
			}
		}
		System.out.println("\nAll countries:");
		for (String listing : countries.keySet()) {
			System.out.println(listing + "  " + countries.get(listing));
		}
		
		
	}
}
