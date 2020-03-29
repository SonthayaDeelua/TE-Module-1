package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List <String> animals = new ArrayList<>(); // declares an ArrayList called animals
		animals.add("Bats");
		animals.add("Cats");
		animals.add("Elephants");
		animals.add("Dogs");
		animals.add("Frogs");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for (int i =0; i < animals.size(); i++) { //ArrayList uses.size() to return the length or size
			System.out.println(animals.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		animals.add("Dogs");
		
		for (int i =0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		animals.add(2,"Rat");
		for (int i =0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		
		

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		animals.remove("Rat");
		
		for (int i =0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		
		
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		if (animals.contains("Dogs")) {
			System.out.println("What a great list!");
		}
		
		boolean containsRats = animals.contains("Rats");
		System.out.println("Rats in list : " + containsRats);
		
		int index = animals.indexOf("Frogs");
		System.out.println("Frogs are in the " +  index + " position");
		
		index = animals.indexOf("Dogs");
		System.out.println("Dogs are in the " +  index + " position");// return -1 cause It could not find.

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String [] animalsArray = animals.toArray(new String[animals.size()]);
		
		for (int i =0; i < animalsArray.length ; i++) {
			System.out.println(animalsArray[i]);
		}
		
		
		

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		Integer employees = new Integer (25); // this () - called the constructor 
											  // "wrap" the primitive integer
												// into an object.

		Integer piecesOfCake = new Integer ("24"); // this constructor takes a 
												   //String and convert it to 
												   //Integer
		

		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		for (String animal : animals) {// for each String a in ArrayList animals
			
		System.out.println(animal);
		
		}
		
		List  <Integer> ages = new ArrayList<>(Arrays.asList(23,34,45,24,52,28));
		
		for (Integer age : ages) {
			System.out.println(age);
		}

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		Queue <String> thingsToDo = new LinkedList<>();
		
		thingsToDo.offer("Read the book");
		thingsToDo.offer("Look over lecture notes");
		thingsToDo.offer("Look over lecture code");
		thingsToDo.offer("work on exercises");
		
		/////////////////////
		// PROCESSING ITEMS IN A QUEUE, First in First Out, In Line.
		/////////////////////
		
		//to remove and print each item
		
		while (thingsToDo.size() > 0) {
			String job = thingsToDo.poll(); // or remove
			System.out.println("Next item: " + job);
			
		}

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();
		//Last in First out
		
		Stack <String> editStack = new Stack<>();
		
		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		
		editStack.push("Remove typo on line 148");
		editStack.push("Bold words ITEMS on line 150");
		
		////////////////////
		// POPPING THE STACK
		////////////////////
		while (editStack.size() > 0) {
			String edit = editStack.pop();// remove items in LIFO
			System.out.println("Previous edit : " + edit);
		}

	}
}
