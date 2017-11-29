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
  	Collections.shuffle(deck);
    Collections.shuffle(deck);

    System.out.println();

  	//System.out.println("Top card = " + deck.get(0));

  	deal(4, "war", deck);
  
  }
  
  public static void deal(int numPlayers, String game, List<String> deck) {

    Collections.shuffle(deck);
    System.out.println();
    System.out.println("The game being played is " + game);

    List<String> hand = new ArrayList<String>();

    for(int i = 0; i < numPlayers; i++) {

    }
      
  }

  public static void war() {
  	
  	// 1. Deal deck 
  	// 2. Pop Top Cards 
  	// 3. Compare   
  	// 4. If Tie 
  	// 5. Else push both 
  	// 6. 
  }
}
  
  

