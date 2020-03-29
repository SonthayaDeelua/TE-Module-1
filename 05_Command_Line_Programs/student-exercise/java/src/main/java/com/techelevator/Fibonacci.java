package com.techelevator;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);				
		System.out.println("Please enter the Fibonacci number");
		String fiboNumber = input.nextLine();
		int number = Integer.parseInt(fiboNumber);

		int  t1 = 0, t2 = 1;
        
        System.out.println("Fibonacci upto " + number + " is");
        
        
        while (t1 <= number) {
        
            System.out.print(t1 + " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            
        }
        
        input.close();
    }
}