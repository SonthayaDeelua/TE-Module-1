package com.techelevator.shoppingcart;

public class ShoppingCart {

	/* Data members are..
	 * totalNumberOfItems - int      
| 	 * totalAmountOwed - double 

	*/
	
	private int 	totalNumberOfItems;
	private double  totalAmountOwed;
	
	
	public ShoppingCart() 
	{
		this.totalNumberOfItems  = 0; // Set default to be 0
		this.totalAmountOwed 	= 0; // Set default to be 0
	}


	public int getTotalNumberOfItems() 
	{
		return totalNumberOfItems;
	}

	public double getTotalAmountOwed() 
	{
		return totalAmountOwed;
	}

	//Create 3 methods as requested
	
	public double getAveragePricePerItem() 
	{
		double averagePrice = 0.00;
		if(totalNumberOfItems > 0)
		{
			averagePrice = totalAmountOwed/totalNumberOfItems;
		}
		return averagePrice;
		
	}

	public void addItems(int numberOfItems, double pricePerItem)
	
	{
		totalNumberOfItems = totalNumberOfItems + numberOfItems;
		totalAmountOwed	 = totalAmountOwed + (numberOfItems * pricePerItem);
	
	}
	
	public void empty()
	{
			totalNumberOfItems  = 0; 
		    totalAmountOwed 	= 0.00;
	}

		
	
}
