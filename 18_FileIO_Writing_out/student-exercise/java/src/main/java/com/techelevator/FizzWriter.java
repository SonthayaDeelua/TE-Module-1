package com.techelevator;

		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.PrintWriter;

		public class FizzWriter {

		public static void main(String[] args) {

		    String fileName = "FizzBuzz.txt";
		    File newFile = new File(fileName);
		    PrintWriter writer = null;

		    try {
		        writer = new PrintWriter(newFile);

		    } catch (FileNotFoundException e) {
		        System.out.println("File cannot be written to - exiting program");
		        e.printStackTrace();
		        System.exit(0);
		    }

		    for (int i = 1; i < 301; i++) {

		        String result = "";

		        if (i % 5 == 0 && i % 3 == 0 || String.valueOf(i).contains("5") && String.valueOf(i).contains("3")) {
		            result = "FizzBuzz";
		        } else if (i % 3 == 0 || String.valueOf(i).contains("3")) {
		            result = "Fizz";
		        } else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
		            result = "Buzz";
		        } else {
		            result = i + "";
		        }
		        writer.println(result);
		        
		    }
		    System.out.println("FizzBuzz.txt has been created.");
		    writer.close();

		}
		

	}


