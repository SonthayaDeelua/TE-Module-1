package com.techelevator.person;

public class Person {

	/*
	* Data member are :
	* firstName - String
	* lastName - String
	* age - int
	* expense - double
	* 
	*/
	
	private String firstName;
	private String lastName;
	private int age;
	
	//create default constructor
	
	public Person() {
		
			
		}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//create 2 methods as requested
		public String getFullName() {
			
			return firstName + " " + lastName;
						
			}
		
			public boolean isAdult() {
				
				if(age>= 18) {
					return true;
				}
				return false;
			}
		
	
	
}
