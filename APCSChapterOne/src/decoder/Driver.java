//Made by Rebecca Zhu 9/16/19
//Driver that runs the encrypt/decrypt program

package decoder;

import java.util.Scanner;

public class Driver {
	
	//boolean variable that allows program to run while it is set to true
	static Boolean running = true;
	
	//main method
	public static void main(String[] args) {
		while(running == true) { //while loop that runs while running = true and user doesn't want to exit
			welcome(); //calls welcome method
		}
	}
	
	//welcome method that gets peoples' inputs
	public static void welcome() {
		Scanner scan = new Scanner(System.in);
		Encrypt userInput = new Encrypt(); //method uses the constructor to instantiate a new object
		userInput.crypt(); //calls crypt method from Encrypt class
		userInput.print(); //calls print method from Encrypt class
		System.out.println("Enter 1 to run again or 2 to exit"); //checks if user wants to encrypt/decrypt again
		int input = scan.nextInt();
		if(input == 1) {
			running = true;
		}
		else { //exits the program
			System.out.println("Thanks for using the encrypter");
			running = false;
		}
	}
}
