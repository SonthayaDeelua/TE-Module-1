package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture{
	
	public static void main(String[] args) throws IOException {
		//java.io.File class give us access to File information and directory path info.
		//we can use methods to inspect and modify file system objects.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the path of a file or directory: ");
		String path = input.nextLine();
		//use the path from user input to create a new File object
		
		File file = new File(path);
		
		// Some methods we can use
		//**********FYI**************
		//** The file class does not need to try/catch or throw
		//It only gives external information about the file
		if (file.exists()) {
			System.out.println("File information : ");
			System.out.println("\tName: " + file.getName());
			System.out.println("\tAbsolute path: " + file.getAbsolutePath());
			System.out.println("\tSize: " + file.length());
			
			if(file.isDirectory()) {
				System.out.println("\ttype: directory");
				System.out.println("\ttype: file");
			} 
			if (file.isFile()) {
				System.out.println("\ttype: file"); 
			}
		} else {
			System.out.println("File does not exist");
		}
		
		//We can also crate a new directory
				System.out.println();
				System.out.println("Enter the name of a directory");
				String pathName = input.nextLine();
				
				File newDirectory = new File(pathName);
				
				if(newDirectory.exists()) {// let's just make sure directory doesn't already exists
					System.out.println("Sorry, direcctory already exists");
					System.out.println(0);
					
				}else { // make a new directory
					if(newDirectory.mkdir()) {
						System.out.println("New directory created at " + newDirectory.getAbsolutePath());		
					} else {
						System.out.println("Could not create the directory");
						System.exit(0);
					}
					
				}
		
		System.out.println();
		System.out.println("Let's create a new file");
		System.out.println("Enter a name for a file:");
		String fileName = input.nextLine();
		File newFile = new File (newDirectory,fileName);// pass in the directory name as first value
		
		newFile.createNewFile();
		
		System.out.println("\tName: " + file.getName());
		System.out.println("\tAbsolute path: " + file.getAbsolutePath());
		System.out.println("\tSize: " + file.length());
		
		/* write some stuff to a file*/
		System.out.println();
		System.out.println("Writing to a file");
		System.out.println("Enter some text to be writen to the file: ");
		String message = input.nextLine();
		
		PrintWriter writer = new PrintWriter(newFile); // this throws an IOException as well
		writer.println(message);
		writer.close();
		
		System.out.println("\tName: " + file.getName());
		System.out.println("\tAbsolute path: " + file.getAbsolutePath());
		System.out.println("\tSize: " + file.length());
		
		
				
	}
}