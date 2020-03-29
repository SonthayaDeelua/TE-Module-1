package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the file name to write to: ");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// handle the error from trying to open a PrintWriter object
			System.out.println("File cannot be writen to");
			e.printStackTrace();
			System.exit(0);
		
	}
		//ask the user to input
		System.out.println("Enter employee name:  ");
		String name = input.nextLine();
		System.out.println("Enter the number of worked: ");
		int hours = Integer.parseInt(input.nextLine());
		System.out.println("Enter rate of pay: ");
		double rate = Double.parseDouble(input.nextLine());
		double salary = hours * rate;
		
		//then write the file to down here
		
		writer.printf("%-30s  %6d  %8.2f  %8.2f", name,hours, rate, salary);
		
		
		
}	
}