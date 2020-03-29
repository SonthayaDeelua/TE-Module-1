package com.techelevator;

public class FruitTree {
	
	/* Data member are
	 * typeOfFruit - String
	 * piecesOfFruitLeft - int
	 * 
	 */
	
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit)
	{
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}

	public String getTypeOfFruit() 
	{
		return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft() 
	{
		return piecesOfFruitLeft;
	}
	
	//Crate method to pick the fruit
	
	public boolean pickFruit(int numberOfPiecesToRemove)
	{
		
		if(piecesOfFruitLeft >= numberOfPiecesToRemove)
		{
		piecesOfFruitLeft -= numberOfPiecesToRemove;
		return true;
		} 
		return false;
	
	}
}
	
	
	
	
