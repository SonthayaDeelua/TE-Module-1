package com.techelevator.playingcard_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// data members are always private
	private List<PlayingCard> listOfCards = new ArrayList<PlayingCard>();
	
	public Deck () {
		for (String suit : new String[] {"Spades", "Hearts", "Diamonds" , "Clubs"}) {
			for (char rank : new char[] {'A', '2' , '3','4', '5', '6', '7','8','9', 'T','J','Q','K'}) {
				// create a new object
				PlayingCard currentCard = new PlayingCard(suit,rank);
				//add to out List
				listOfCards.add(currentCard);
		}
	}

}
	//randomly shuffles a List!
	public void shuffle() {
		Collections.shuffle(listOfCards);
	}
	// deals a single PlayingCard
	public PlayingCard deal() {
		if (listOfCards.size() !=0) {
			return listOfCards.remove(0);
		} else {
			return null;
		}
		
	}
	public String toString() {
		return "Deck [" + listOfCards +  "]" ;
	}
}
