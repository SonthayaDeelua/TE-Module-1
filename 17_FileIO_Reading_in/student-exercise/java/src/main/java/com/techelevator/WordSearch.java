package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class WordSearch {
	 
	public static void main(String[] args) throws FileNotFoundException {
		
		int lineNumber = 0; // define variable for line number
		
		File inputFile = getInputFileFromUser(); // call file from user input prepare to be used
		//alices_adventures_in_wonderland.txt
		Scanner fileScanner = new Scanner(inputFile); // put the called file in to variable 
		
		Scanner input = new Scanner (System.in);// Command line to ready to get the data
		System.out.println("What is the serach word are you looking for?"); //Ask user what the search word they want
		String word = input.nextLine(); // Converted that search word to be String
		
		System.out.println("should the search be case sensitive (Y/N) ?"); //Confirm if word is case sensitive
		String caseSense = input.nextLine(); // Assign Y/N into variable caseSense
		
		while(fileScanner.hasNextLine()) {// check all the line in file.
			String line = fileScanner.nextLine(); // give variable name for each line
			if(line.length() != 0) {//Not count blank line
			lineNumber = lineNumber + 1; // count line number	
		 	if(caseSense.contentEquals("y") || caseSense.contentEquals("Y")) { // Confirm if case sensitive
			 		if(line.contains(word)) {  // Check if line have searched word.	
			 			System.out.println(lineNumber + ")" + line); // print as per suggested from exercise		 			
			 		}
		 	}else if(caseSense.contentEquals("n") || caseSense.contentEquals("N")) { // Confirm if case sensitive
			 			String lowWord = word.toLowerCase();//Set all word to into lower case
			 			if(line.contains(lowWord)) { //Check if that line contain word which all converted to be lowWord
			 			System.out.println(lineNumber + ")" + line); // print as per suggested from exercise
			 			
			 		}
			 	}
			 			
			}
		}
		input.close();
		fileScanner.close();
		}
	
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
	
	
}		