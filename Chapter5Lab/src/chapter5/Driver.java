//Made by Rebecca Zhu 10/11/19
//purpose is for the lab exercises in chapter 5

package chapter5;

//import the Scanner class for user input
import java.util.Scanner;

public class Driver {
	
	//instantiates the Scanner object and makes it static so it can be used in all the methods
	static Scanner scan = new Scanner(System.in);
	
	//calls all the methods for the exercises
	public static void main(String[] args) {
		exerciseOne();
		exerciseTwo();
		exerciseThree();
		exerciseSix();
		exerciseSeven();
	}
	
	//exercise 1 is the Pig Latin exercise
	public static void exerciseOne() {
		String sentence, result, another = "y";
		while(another.equalsIgnoreCase("y")) { //keeps running as long as the user chooses yes
			System.out.println();
			System.out.println("Enter a sentence (no punctuation):");
			sentence = scan.nextLine();
			
			System.out.println();

			result = PigLatinTranslator.translate(sentence); //since method is now static, we call it through the class and not an object itself
			System.out.println("That sentence in Pig Latin is:");
			System.out.println(result);
			
			System.out.println();
			System.out.print("Translate another sentence (y/n)? ");;
			another = scan.nextLine();
		}
	}
	
	//exercise two is to implement the interface comparables to compare fractions
	public static void exerciseTwo() {
		System.out.println("Please enter a numerator for the first fraction: ");
		int a = scan.nextInt();
		System.out.println("Please enter a denominator for the second fraction: ");
		int b = scan.nextInt();
		System.out.println("Please enter a numerator for the second fraction: ");
		int c = scan.nextInt();
		System.out.println("Please enter a denominator for the second fraction: ");
		int d = scan.nextInt();
		scan.nextLine();
		//instantiates the rational objects
		Rational fraction1 = new Rational(a, b);
		Rational fraction2 = new Rational(c, d);
		//calls the compareTo method from the comparable interface on the fraction1 object
		if(fraction1.compareTo(fraction2) == 1) {
			System.out.println("The fractions are not the same");
		}
		else
			System.out.println("The fractions are basically the same");
	}
	
	//exercise 3-5 make tasks and also the priorities and complexities of their tasks
	public static void exerciseThree() {
		System.out.println("Please enter the name of a task:");
		String a = scan.nextLine();
		System.out.println("Please enter the priority of the task:");
		int b = scan.nextInt();
		System.out.println("Please enter the complexity of the task:");
		int c = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter the name of a second task:");
		String d = scan.nextLine();
		System.out.println("Please enter the priority of the second task:");
		int e = scan.nextInt();
		System.out.println("Please enter the complexity of the task:");
		int f = scan.nextInt();
		//instantiates the task objects that take in the name of the task, priority of the task, and the complexity of the task
		Task task1 = new Task(a, b, c);
		Task task2 = new Task(d, e, f);
		if(task1.compareTo(task2) == 1) { //calls the compareTo method and compares the objects' priority
			System.out.println("You believe task 1 (" + task1.getTaskName() + ") is of greater importance.");
		}
		else if(task1.compareTo(task2) == -1) {
			System.out.println("You believe task 2 (" + task2.getTaskName() + ") is of greater importance.");
		}
		else
			System.out.println("You believe task 1 and 2 are of the same importance");
	}
	
	//exercise 6 uses the lockable coin object
	public static void exerciseSix() {
		Coin coin = new Coin(); //instantiates a new coin object
		System.out.println("Your coin has flipped " + coin); //shows the user the first face of the coin so they know whether it changes or not
		System.out.println("Enter an integer to set the key for the coin and to lock the coin: ");
		int a = scan.nextInt();
		coin.setKey(a); //sets up a lock for the coin object using the setKey method from the coin class
		coin.lock(a); //locks the coin using the key
		System.out.println("Okay, now we have locked your coin. Enter a wrong key to see that the flipped method and print coin method does not run: ");
		int b = scan.nextInt();
		coin.unlock(b); //coin will remain locked if user enters the wrong key
		coin.flip(); //flip will not run if the user enters a wrong key
		System.out.println("Your coin is " + coin); //won't print anything because toString method won't run when coin is locked
		System.out.println("Now enter your key to see that the coin unlocks and flips.");
		int c = scan.nextInt();
		coin.unlock(c); //unlocks coin if user enters the right key
		coin.flip(); //will run if the coin is unlocked
		System.out.println("Your coin is " + coin); //will print the new face of the coin
	}
	
	//exercise 7 uses a lockable account
	public static void exerciseSeven() {
		Account acct1 = new Account("Rebecca", 72354, 102.56); //instantiates a new account object
		System.out.println(acct1);
		System.out.println("Enter a key for your account and to lock your account");
		int a = scan.nextInt(); 
		acct1.setKey(a); //sets up a key for the account
		acct1.lock(a); //locks account
		System.out.println("Okay, now your account is locked. Enter a wrong key to see what happens if we try to print your account while locked.");
		int b = scan.nextInt();
		acct1.unlock(b); //account will remain locked if user enters the wrong key
		System.out.println(acct1); //nothing will print because toString method won't run when account is locked
		System.out.println("Now enter your key to unlock the account and to print your account.");
		int c = scan.nextInt();
		acct1.unlock(c); //unlocks the account
		System.out.println(acct1); //prints the account if unlocked
	}
}
