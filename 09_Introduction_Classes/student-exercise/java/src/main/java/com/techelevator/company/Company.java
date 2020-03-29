package com.techelevator.company;

public class Company {

	/*
	* Data member are :
	* name - String
	* numberOfEmployee - int
	* revenue - double
	* expense - double
	* */
	
	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	//create default constructor
	
	public Company() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	//create 2 methods as requested
	public String getCompanySize() {
		if(numberOfEmployees <= 50) {
			return "small";
		}else if (numberOfEmployees <= 250) {
			return "medium";
		}
		return "large";
		
		
	}
		public double getProfit() {
			return (revenue - expenses);
		}
	
}

