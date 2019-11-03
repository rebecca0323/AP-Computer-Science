//Made by Rebecca Zhu on 10/4/19 
//purpose is to make the class needed for exercises 4.4 and 4.5 for chapter 4 lab

package chapter4;

public class PairOfDice {
	//variables for 4.4
	private Die die1; //represents the first die
	private Die die2; //second die
	private int boxcar; //keeps track of how many boxcars
	private int other; //keeps track of nonboxcars
	//variables for 4.5
	private String player; //user or computer for pig game
	private int roundScore; 
	private int totalScore;
	private String winner;
	private int faceValueSum;
	
	//constructor used in 4.4 that makes two standard 6 sided die
	public PairOfDice() {
		die1 = new Die(6);
		die2 = new Die(6);
		boxcar = 0;
		other = 0;
	}
	
	//overloaded constructor used in 4.5 
	public PairOfDice(String n) {
		die1 = new Die(6);
		die2 = new Die(6);
		roundScore = 0;
		totalScore = 0;
		player = n;
		winner = "";
		faceValueSum = 	die1.getRolledNumber() + die2.getRolledNumber(); //sets the face value to the sum of the numbers displayed on the dice
	}
	
	//exercise 4.4, rolls two dice 1000 times and tracks # of boxcars
	public void rolls() {
		for(int i = 0; i < 1000; i++) { //for loop rolls die 1000 times
			if(die1.getRolledNumber() == 6 && die2.getRolledNumber() == 6) //checks if both dice rolled 6's
				boxcar++;
			else 
				other++;
			rollAgain(); //sets new face values on the dice
		}
	}
	
	//returns the number of boxcar instances
	public int getBoxcar() {
		return boxcar;
	}
	
	//returns the number of other instances
	public int getOther() {
		return other;
	}
	
	//helper method so it's private, used to set new values on the two dice used in both exercise 4.5 and 4.6
	private void rollAgain() {
		die1.setRolledNumber();
		die2.setRolledNumber();
		faceValueSum = 	die1.getRolledNumber() + die2.getRolledNumber(); //used in exercise 5
	}
	
	//checks if either the computer or the user rolls a 1
	private void isOneRolled() {
		if (((die1.getRolledNumber() == 1) && (die2.getRolledNumber() != 1)) || ((die1.getRolledNumber() != 1) && (die2.getRolledNumber() == 1)))
			roundScore = 0; //sets round score to 0
		else if((die1.getRolledNumber() + die2.getRolledNumber()) == 2) {
			totalScore = 0;
			roundScore = 0; //sets round score and total score to 0
		}
		else
			roundScore += faceValueSum; //adds the values of dice
	}                 
	
	//method that parses what the user chooses to do
	public void userChoice(int c) {
		if(c == 0) { //if user wants to give up the dice
			totalScore += roundScore; //adds the round score to total score and sets round score to 0
			roundScore = 0;
			System.out.println("You have given up the dice. You have a total score of " + totalScore);
		}
		else { //this means user wants to keep rolling
			System.out.println("\nYou rolled a " + die1.getRolledNumber() + " and a " + die2.getRolledNumber());
			isOneRolled(); //checks to see if 1 is rolled
			System.out.println("Your round score: " + roundScore);
			if(roundScore == 0)
				System.out.println("Your total score: " + totalScore);
			else
				System.out.println("Your total score: " + (totalScore + roundScore));
			rollAgain(); //calls rollAgain method
		}
	}
	
	//method for computer choice
	public void computerChoice() {
		if(roundScore >= 20) { //checks if round score is 20 to give up the dice using same logic as user choice
			totalScore += roundScore;
			roundScore = 0;
			System.out.println("\nThe computer gives up a turn and has a total score of " + totalScore);
		}
		else { //continues rolling the dice
			System.out.println("\nThe computer rolled a " + die1.getRolledNumber() + " and a " + die2.getRolledNumber());
			isOneRolled(); // calls method to check if 1 is rolled
			System.out.println("The computer's round score: " + roundScore);
			if(roundScore == 0)
				System.out.println("The computer's total score: " + totalScore);
			else
				System.out.println("The computer's total score: " + (totalScore + roundScore)); //since round isn't over, has to add roundScore to total score
			rollAgain();
		}
	}
	
	//method that checks if user or computer has won and returns a boolean
	public boolean checkWinner() {
		if(totalScore >= 100 || (roundScore + totalScore) >= 100) {
			System.out.println(player + " has won with a total score of " + (totalScore + roundScore) + "\n");
			winner = player;
			return true;
		}
		else
			return false;
	}
	
	//gets who wins
	public String getWinner() {
		return winner;
	}
}