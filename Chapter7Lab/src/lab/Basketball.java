//Made by Rebecca Zhu 11/20
//purpose is as subclass of parent class sport

package lab;

public class Basketball extends Sport{
	//instance variables that are specific to the basketball class
	private static String[] s = new String[] {"Jason", "Rebecca", "Anna"};
	private int fouls;
	private boolean fouledOut;
	private String rival;
	private int ptsPerPlayer;
	private double freethrowprob;
	private int freethrows;
	
	//constructor for the basketball class
	public Basketball(String n, String r, int a, int f, int free) {
		super(n, r, s, a); //passes parameters to make the sport object from parent class
		fouls = f; //sets instance variables to the parameters given
		if(fouls > 4)
			fouledOut = true;
		else
			fouledOut = false;
		rival = "North";
		ptsPerPlayer = a/5;
		freethrowprob = 0.8;
		freethrows = free;
		
		printBasketball(); //prints the specific sport
	}
	
	//method that prints the sport
	public void printBasketball() {
		this.printSport(); //calls method from base class
		System.out.println("Points per player: " + ptsPerPlayer); //prints the instance variables of the specific sport
		System.out.println("Free Throw Probability: " + freethrowprob);
		System.out.println("Average # of free throws made per game: " + freethrows);
		System.out.println("Average number of fouls: " + fouls);
		System.out.println("Fouled Out Yet? " + fouledOutYet());
		System.out.println("Rival: " + rival);
	}
	
	//method that returns whether a player has fouled out yet
	public String fouledOutYet() {
		if(fouledOut == true)
			return "Yes";
		else
			return "No";
	}
}
