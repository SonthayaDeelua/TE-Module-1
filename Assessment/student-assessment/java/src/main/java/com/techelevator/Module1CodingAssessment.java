package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {

		FlowerShopOrder Order = new FlowerShopOrder("bouquet", 5);

		File inputFile = new File(".\\data-files\\FlowerInput.csv");
		Scanner fileScanner = new Scanner(inputFile);
		
		double subTotal = 0.00;
		while (fileScanner.hasNextLine()) {
			String[] inputArray = fileScanner.nextLine().split(",");
			String selectedBouguet = inputArray[0];
			int numOfRose = Integer.parseInt(inputArray[1]);

			FlowerShopOrder newOrder = new FlowerShopOrder(selectedBouguet, numOfRose);
			subTotal = subTotal + newOrder.getSubtotal();
		}

		System.out.println("Total is : $" + String.format("%.2f", subTotal));

	} 

}
