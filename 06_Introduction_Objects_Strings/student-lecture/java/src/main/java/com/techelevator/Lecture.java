package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");


		String greeting = "Hello, World!";
		String longerGreeting = greeting + " Hello World!";
		System.out.println(longerGreeting);
		
		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String name = "Robert Norman Ross";
		
		int nameLength = name.length();
		System.out.println(nameLength);
		
		char testLetter = name.charAt(3);
		System.out.println(testLetter);
		
		int position = name.indexOf("or");
		System.out.println(position);
		
		int position2 = name.indexOf("r");
		System.out.println(position2);
		
		String middleName = name.substring(7,13);
		System.out.println(middleName);
		
		String lastName = name.substring(14);
		System.out.println(lastName);
		
		String carelessString = "Drinking Tea ";
		String carefulString = carelessString.trim();
		
		System.out.println(carelessString.length());
		System.out.println(carefulString.length());
		
		String shoutingString = "THIS IS THE NORMAL SOUND OF MY VOICE;";
		String quiteString = shoutingString.toLowerCase();
		System.out.println(quiteString);
		
		String lowerCasePart = shoutingString.substring(1).toLowerCase();
		String upperCasePart = shoutingString.substring(0,1);
		System.out.println(upperCasePart + lowerCasePart);
		 
		String tireString = "I am tired";
		String energeticString = tireString.replace("tired","super");
		System.out.println(energeticString);
		
		
		
		
		
		
		
		
		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
		char[] helloArray = new char[] {'H','e', 'l','l','o'};
		String hello1 = new String(helloArray);
		System.out.println(hello1);
		
		String hello2 = new String("Hello");
		System.out.println(hello2);
		
		if (hello1 == hello2)
		{
			System.out.println("they are equal");
		}
		else {
			System.out.println("they are not equal");
			
			
		}
		
		if (hello1.equals(hello2)) {
			System.out.println("they are equal");
		}
		else {
			System.out.println("they are not equal");
				
		}
		
		
		String hello3 = hello1;
		
		if(hello1 == hello3) {
			System.out.println("they are equal");
		}
		else {
			System.out.println("they are not equal");						
		}
		
		hello3 = "goodbye";
		System.out.println(hello1);
		
		
		
		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
	

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */

		
		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

	}
}
