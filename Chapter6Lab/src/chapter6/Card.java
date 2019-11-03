//made by Rebecca Zhu on 10/5/19
// purpose is to make the card class for exercise 4.6

package chapter6;

public class Card {
	//variables for the card object
	private final int GENERATE_SUIT;
	private String suit;
	private int faceValue;
	
	public Card() { //constructor that sets the card suit and card #
		GENERATE_SUIT = (int) (Math.random()*4); //makes a random number that will be used to set the suit
		if(GENERATE_SUIT == 0) { //if statements to set the suit depending on the random number
			suit = "Hearts";
		}
		else if(GENERATE_SUIT == 1) {
			suit = "Diamonds";
		}
		else if(GENERATE_SUIT == 2) {
			suit = "Spades";
		}
		else
			suit = "Clubs";
		faceValue = (int) (Math.random()*13 + 1); //random # generator to determine face value of the card and casts to an integer
	}
	
	//method that allows the card object to be printed
	public String toString() {
		return ("Number " + faceValue + " of " + suit);
	}
}
