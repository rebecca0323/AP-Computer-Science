//Made by Rebecca Zhu 11/1/19

package chapter6;

public class DeckOfCards {
	private Card[] deck = new Card[52]; //creates deck of cards
	
	//constructor that makes the cards
	public DeckOfCards() {
		for(int i = 0; i < deck.length; i++) {
			deck[i] = new Card(); //instantiates a new card object per index of the deck array
		}
	}
	
	//method that shuffles the Deck by randomly swapping cards
	public void shuffleDeck() {
		for(int i = 0; i < deck.length; i++) { //loops through the whole deck
			Card key = deck[i]; //has a key
			int a = (int) Math.random()*deck.length; //random number generator
			Card temp = deck[a]; //creates a temporary card
			deck[i] = temp; //swaps the cards
			deck[a] = key;
		}
	}
	
	//method that prints the next card in the deck
	public void printDeck() {
		for(int i = 0; i < deck.length; i++) {
			if(deck[i] != null) { //checks if there is a card at a given index
				System.out.println(deck[i]); //prints the card
				deck[i] = null; //sets the index of the array to null so that it won't be printed next time
				break;
			}
		}
	}
	
	//method that prints how many cards are left over
	public void cardsLeft() {
		int count = 0; //tracker
		for(int i = 0; i < deck.length; i++) {
			if(deck[i] != null) //if the index of the array isn't null, then there is a card
				count++; //increments the tracker
		}
		System.out.println("You have " + count + " cards left in the deck.");
	}
}
