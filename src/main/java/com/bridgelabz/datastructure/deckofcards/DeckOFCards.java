package com.bridgelabz.datastructure.deckofcards;

/**
 * Deck Of Cards!
 *
 */
public class DeckOfCards {
	private String suits;
	private String ranks;
public static void main(String[] args) {
	System.out.println("Welcome to deck of cards");
	DeckOfCards cards=new DeckOfCards();
	cards.initialGame();
}
// initialGame method for Setup the initial game with deck of cards and make sure we have unique cards
public void initialGame() {
	int[] numOfCards = new int[52];
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Initialize cards
    for (int i = 0; i < numOfCards.length; i++) {
    	numOfCards[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < numOfCards.length; i++) {
      int index = (int)(Math.random() * numOfCards.length);
      int temp = numOfCards[i];
      numOfCards[i] = numOfCards[index];
      numOfCards[index] = temp;
    }

    // Display the all the cards
    for (int i = 0; i < 52; i++) {
      String suit = suits[numOfCards[i] / 13];
      String rank = ranks[numOfCards[i] % 13];
      System.out.println( rank + " of " + suit);
}
}
}
