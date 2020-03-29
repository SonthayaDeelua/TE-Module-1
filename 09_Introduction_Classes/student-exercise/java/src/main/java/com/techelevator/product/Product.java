package com.techelevator.product;

public class Product {

	/* Data members 
	 * name - String
	 * price - double
	 * weightInOunces - double         
	 */
	
	private String name;
	private double price;
	private double weightInOunces;
	
	//create default constructor
	
	public Product() {
		
			
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	
}
