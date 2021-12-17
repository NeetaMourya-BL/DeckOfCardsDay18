package com.bridgelabz.datastructure.deckofcards;
/**
 * Deck Of Cards!
 *
 */
public class DeckOfCards {
	private String suits;
	private String ranks;
	private static final int numOfPlayer = 4;
    private static final int numOfCardByPlayer = 9;
	private static final int deckOfCard = 0;
	int[][] numOfCards = new int[4][9];
   public static void main(String[] args) {
	int[] numOfCards = new int[52];
	
	    // you loop as much as the number of players
	    // your increment step is the number of cards to deal by player
	    // your end condition is the number of cards you have to
	    // deal for all player
	System.out.println("Welcome to deck of cards");
	DeckOfCards cards=new DeckOfCards();
	cards.initialGame();
	cards.printCard();
}
// initialGame method for Setup the initial game with deck of cards and make sure we have unique cards
public void initialGame() {
	 int playerNumber = 1;
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    // initialize deck
    int n = suits.length * ranks.length;
    String[] deck = new String[n];
    for (int i = 0; i < ranks.length; i++) {
        for (int j = 0; j < suits.length; j++) {
            deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
        }
    }
    // shuffle
    for (int i = 0; i < n; i++) {
        int r = i + (int) (Math.random() * (n-i));
        String temp = deck[r];
        deck[r] = deck[i];
        deck[i] = temp;
    }
    for (int i = 0; i < numOfPlayer * numOfCardByPlayer; i = i + numOfCardByPlayer) {
        System.out.println("player " + playerNumber + ", cards =");
        // you loop as much as the number of cards to deal by player
        // your start from the last dealed card 
        // your increment step is 1 as you want to deal card by card from the deck
        // your end condition is the number of cards to deal by player
        for (int j = i; j < i+numOfCardByPlayer; j++) {
            System.out.println(deck[j]);
        }
        playerNumber++;
}
}
public void printCard() {
    for(int i = 0; i<numOfPlayer; i++)
        for(int j = 0; j<numOfCardByPlayer; j++)
        	numOfCards[i][j] = 0;

    for(int i = 0; i<numOfPlayer; i++)
    {
        for(int j = 0; j<numOfCardByPlayer; j++)
        {
            System.out.print(numOfCards[i][j]);
        }
        System.out.println();
    }
}
}