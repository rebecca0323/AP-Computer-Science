//Made by Rebecca Zhu 11/1/19

package chapter6;

//needs this class so we can use one array to represent the grade instead of two arrays
public class Grade {
	//instance variables that represent the grade
	private String letter;
	private int value;
	
	//constructor that takes in the letter and value for a grade
	public Grade(String letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	//setter for the value
	public void setValue(int value) {
		this.value = value;
	}
	
	//getter for the value
	public int getValue() {
		return value;
	}
	
	//setter for the letter
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	//getter for the letter
	public String getLetter() {
		return letter;
	}
	
	//what happens when the grade is being printed
	public String toString() {
		return (letter + "\t" + value);
	}
}
