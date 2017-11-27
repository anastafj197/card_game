// Frank Anastasia 
// Card Deck

import java.io.*;
import java.util.*;

public class Cards {

  public static void main (String [] args) {

  	String[] ranks = {"2","3","4","5","6","7","8","9",
  	                  "10","Jack","Queen","King","Ace"};

  	String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

  	List<String> deck = new ArrayList<String>();

  	// Build a sorted deck of cards 
  	for (String rank : ranks) {
  	  for (String suit : suits) {
  	  	deck.add(rank + " of " + suit);
  	  }
  	}

  	// Shuffle all the items in the list
  	collections.shuffle(deck);

  	System.out.println("Top card is the " + deck.get(0));
  
  }

}
