//Made by Rebecca Zhu on 10/4/19
//purpose is to make a class for exercise 3 in the chapter 4 programming projects

package chapter4;

public class Die {
	//variables of the die object
	private int sides;
	private int rolledNumber;
	
	//constructor sets up a normal die with 6 sides
	public Die() {
		sides = 6;
		rolledNumber = (int) (Math.random()*6 +1); //determines the face value of die through casting the random function
	}
	
	//overloaded constructor that sets up a die with a specific amount of sides
	public Die(int s) {
		sides = s;
		rolledNumber = (int) (Math.random()*s + 1);
	}
	
	//returns a one line description of the die object
	public String toString() {
		return ("You rolled a " + rolledNumber + " on an " + sides + "-sided die");
	}
	
	//allows the rolledNumber variable to be accessed in other classes
	public int getRolledNumber() {
		return rolledNumber;
	}
	
	//sets a new rolled Number using the number of sides the die object has
	public void setRolledNumber() {
		rolledNumber = (int) (Math.random()*sides + 1);
	}
}
