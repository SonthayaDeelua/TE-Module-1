package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);				
		System.out.println("Pls enter series of decimal number");
		String decStr = input.nextLine();
		String[] decArray = decStr.split(" ");

		        for (int x=0;x<decArray.length;x++) {
		            
		            int number = Integer.parseInt(decArray[x]);
		            System.out.print(number);
		            
		            int i=0;
		    		int binary[] = new int[100];
		    		String binNumber = "";
		    				        
		            while(number!=0){		
		            binary[i] = number%2;
		            number = number/2;
		            i++;
		        	}
		            
		            for (int j=i-1;j>=0;j--) {
		                
		                binNumber = binNumber + binary[j];
		                                        	            	
		            }
		        		         
		            System.out.println(" in binary is "+binNumber);	        
		        } 
		        
		        input.close();
		}
}
