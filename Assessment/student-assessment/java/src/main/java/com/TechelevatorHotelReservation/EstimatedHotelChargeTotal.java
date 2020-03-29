package com.TechelevatorHotelReservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EstimatedHotelChargeTotal {

	public static void main(String[] args) throws FileNotFoundException {

		HotelReservation newReservation = new HotelReservation("Joe Morgan", 1);
		System.out.println(newReservation);
		System.out.println("minibar & maid serviece " + newReservation.actualTotalUsing(true, true));

		File inputFile = new File(".\\data-files\\HotelInput.csv");
		System.out.println("file is read");
		Scanner fileScanner = new Scanner(inputFile);

		double subTotal = 0.00;
		while (fileScanner.hasNextLine()) {
			String[] inputArray = fileScanner.nextLine().split(",");
			String guestName = inputArray[0];
			int nightReserved = Integer.parseInt(inputArray[1].trim());

			HotelReservation newGuest = new HotelReservation(guestName, nightReserved);
			subTotal = subTotal + newGuest.getEstimatedTotal();
		}

		System.out.println("Estimated Total is : $" + String.format("%.2f", subTotal));

	}

}
