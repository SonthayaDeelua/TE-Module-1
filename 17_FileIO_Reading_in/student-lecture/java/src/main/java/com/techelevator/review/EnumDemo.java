package com.techelevator.review;

import java.util.Scanner;

public class EnumDemo {
	public enum Directions {
		NORTH,SOUTH,EAST,WEST;
	}
	
	// if (dir == Directions.NORTH){
	//System.out.println("Heading North");
	//} -- can use a SWITCH statement
		
	
	public static void main(String[] args) {
		Directions dir = Directions.NORTH;
		if(dir == Directions.NORTH) {
			System.out.println("Heading North");
		}else if (dir == Directions.SOUTH) {
			System.out.println("Heading South");
		}else if (dir == Directions.EAST) {
			System.out.println("Heading East");
		} else {
			System.out.println("Heading West");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a direction:");
		String compassDir = input.nextLine();
		Directions[] dirArray = Directions.values();
		for (Directions d : dirArray) {
			if(d.toString().equals(compassDir.toUpperCase())){
				System.out.println("Found");
				
			}
		}
		
		
	}

}
