//Made By Rebecca Zhu on 10/4/19
//Purpose is for chapter 4 labs

package chapter4;

//allows me to use the Scanner object for user's input
import java.util.Scanner;

public class Driver {
	
	//instantiates scanner object, is static so I don't have to redeclare it in every method that needs user's input
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//calls the individual methods for each exercise in the main method
		exerciseOneAndTwo();
		exerciseThree();
		exerciseFour();
		exerciseFive();
		exerciseSix();
		exerciseSeven();
		exerciseEight();
	}
	
	//creates some bank accounts and request various services for exercise 4.1 and 4.2
	public static void exerciseOneAndTwo() {
		//instantiates two new account objects
		Account acct1 = new Account("Rebecca", 72354, 102.56);
		Account acct2 = new Account("Mr. Spero", 69713, 40.00);
		//prints the accounts out so the user can see the before and after of the account so they know the value did transfer
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println("What amount would you like to withdraw from Rebecca's account and deposit into Mr. Spero's account");
		double deposit = scan.nextDouble();
		acct1.transfer(deposit, acct2); //calls transfer method from the Account class with the acct1 object
		
		//prints the new accounts after the transfer
		System.out.println(acct1);
		System.out.println(acct2);
		
		scan.nextLine(); //needs to reset scanner
		System.out.println("You are creating a new account. Please enter the name in which the account will be under.");
		String name = scan.nextLine();
		System.out.println("Thanks " + name + ". Please enter an integer that represents your account number.");
		int num = scan.nextInt();
		Account acct3 = new Account(name, num); //instantiates new account using overloaded constructor that takes in two arguments, the first one as a string and the second as an int and sets the balance to 0
		System.out.println(acct3); //prints the account using the toString method in the Account class
	}
	
	//exercise 4.3 deals with rolling a die
	public static void exerciseThree() {
		System.out.println("How many sides would you like on the die?");
		int sides = scan.nextInt();
		Die dice = new Die(sides); //instantiates new Die object using a constructor that takes 1 parameter: the # of sides of the die
		System.out.println(dice); //uses the toString
	}
	
	//exercise 4.4 deals with determining how many times 2 sixes are rolled in 1000 rolls
	public static void exerciseFour() {
		PairOfDice dice = new PairOfDice(); //instantiates new pair of dice object
		dice.rolls(); //invokes rolls method from pairofdice class
		//prints out the amount of boxcars rolled through getter
		System.out.println("Out of 1000 rolls, number of boxcars rolled: " + dice.getBoxcar() + "\nNumber of other combinations: " + dice.getOther()); 
	}
	
	//exercise 4.5 deals with the game pig
	public static void exerciseFive() {
		System.out.println("\nWelcome to the game of PIG. You are playing against the comptuer. To play, two dice are rolled randomly and the sum of the face values is computed."
				+ "\nWhoever reaches 100 points first wins. If you roll a 1, then you lose the points for the round and the dice goes to the other player."
				+ "\nIf you roll two 1's then you lose all your points and start at 0 again.");
		PairOfDice user = new PairOfDice("User"); //instantiates new pair of dice object that represents the two dice that the user has
		PairOfDice computer = new PairOfDice("Computer"); //instantiates new pair of dice object that represents the two dice the computer has
		
		while(user.getWinner().equals("") || computer.getWinner().equals("")) { //keeps looping until a winner is found
			System.out.println("\nEnter 1 to roll or 0 to turn over the dice and end the round for you.");
			int choice = scan.nextInt();
			if(choice == 1 || choice == 0) //checks if choice is valid
				user.userChoice(choice); //invokes userChoice method in pairofdice class
			else
				System.out.println("Invalid choice.");
			if(user.checkWinner() == true) //checks if the user has won 
				break; //exits the while loop
			computer.computerChoice(); //invokes computer Choice method in pairofdice class
			if(computer.checkWinner() == true) //checks if computer has won
				break; //breaks the while loop
		}
	}
	
	//exercise 4.6 deals with printing 20 cards
	public static void exerciseSix() {
		for(int i = 0; i < 20; i++) { //for loop that prints a card per line
			Card card = new Card(); //instantiates new card object
			System.out.println((i + 1) + ". " + card);
		}
	}
	
	//exercise 4.7 deals with mathematical manipulation of fractions using the rational class
	public static void exerciseSeven() {
		System.out.println("\nIn this program, you will be able to add, subtract, multiply, or divide two fractions.");
		while(true) { //allows the user to keep adding/subtracting/multiplying/division fractions
			System.out.println("\nEnter 0 to quit and any other integer to continue:");
			int exit = scan.nextInt();
			if(exit == 0) { //exits the while loop
				break;
			}
			//gets user inputs for the fractions
			System.out.println("Enter an integer that represents the numerator of the first fraction.");
			int numa = scan.nextInt();
			System.out.println("Enter an integer that represents the denominator of the first fraction.");
			int denoma = scan.nextInt();
			System.out.println("Enter an integer that represents the numerator of the second fraction.");
			int numb = scan.nextInt();
			System.out.println("Enter an integer that represents the denominator of the second fraction.");
			int denomb = scan.nextInt();
			// creates the fraction objects
			Rational fraction1 = new Rational(numa, denoma);
			Rational fraction2 = new Rational(numb, denomb);
			System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division");
			int next = scan.nextInt();
			if(next == 1) //determines what the user wants to do with the fractions
				System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
			else if(next == 2)
				System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtract(fraction2));
			else if(next == 3)
				System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiply(fraction2));
			else if(next == 4)
				System.out.println("(" + fraction1 + ") / (" + fraction2 + ") = " + fraction1.divide(fraction2));
			else
				System.out.println("Invalid input.");
		}
		scan.nextLine(); //resets what has been scanned
	}
	
	//exercise 4.9 deals with creating student objects from the student and address classes
	public static void exerciseEight() {
		//gets the user's first and last name
		System.out.println("Please enter your first name:");
		String first = scan.nextLine();
		System.out.println("Please enter your last name:");
		String last = scan.nextLine();
		
		//gets the inputs to build the house address object
		System.out.println("Please enter your home street address:");
		String homeStreet = scan.nextLine();
		System.out.println("Please enter your home town:");
		String homeTown = scan.nextLine();
		System.out.println("Please enter your home state:");
		String homeSt = scan.nextLine();
		System.out.println("Please enter your home zip code:");
		int homeZip = scan.nextInt();
		scan.nextLine(); //resets the scanner
		Address home = new Address(homeStreet, homeTown, homeSt, homeZip); //instantiates the home address object
		
		//gets the inputs to build the school address object
		System.out.println("Please enter your school street address:");
		String schStreet = scan.nextLine();
		System.out.println("Please enter your school town:");
		String schTown = scan.nextLine();
		System.out.println("Please enter your school state:");
		String schSt = scan.nextLine();
		System.out.println("Please enter your school zip code:");
		int schZip = scan.nextInt();
		scan.nextLine(); // resets the input in the scanner
		Address school = new Address(schStreet, schTown, schSt, schZip); //instantiates the school address object
		
		//takes the inputs for the test scores
		System.out.println("Please enter your test score for the first test:");
		int score1 = scan.nextInt();
		System.out.println("Please enter your test score for the second test:");
		int score2 = scan.nextInt();
		System.out.println("Please enter your test score for the third test:");
		int score3 = scan.nextInt();
		scan.nextLine(); // resets the input for the scanner
		Student me = new Student(first, last, home, school, score1, score2, score3); //creates the student object
		
		//lets user check one of their test scores
		System.out.println("Okay. We have created your student object. Let's say you want to check one of your test scores. \nWhich test score would you like to see? (Enter 1, 2, or 3)");
		int testScore = scan.nextInt();
		if(me.getTestScore(testScore) == 0)
			System.out.println("Invalid test score #");
		else
			System.out.println("Your test score for test " + testScore + " is " + me.getTestScore(testScore));
		scan.nextLine(); //resets the scanner
		
		//asks for inputs to instantiate new object for overloaded constructor that doesn't take test scores
		System.out.println("\nNow, let's create a student object for your sibling who lives in the same house and goes to the same school as you."
				+ "\nWhat is your sibling's first name?");
		String sibFirst = scan.nextLine();
		System.out.println("What is your sibling's last name?");
		String sibLast = scan.nextLine();
		Student sibling = new Student(sibFirst, sibLast, home, school);
		
		//prints sibling's object with test scores = 0 so they can see that the set test score methods later on
		System.out.println("\nLet's print your sibling's object so far:");
		System.out.println(sibling);
		
		//allows users to set the test scores
		System.out.println("\nWe can see that your sibling's test scores are automatically set to 0. Let's change those test scores.\nEnter your sibling's test score for the first test:");
		sibling.setTestScore(1, scan.nextInt());
		System.out.println("Please enter your sibling's test score for the second test:");
		sibling.setTestScore(2, scan.nextInt());
		System.out.println("Please enter your sibling's test score for the third test:");
		sibling.setTestScore(3, scan.nextInt());
		
		//runs the average methods
		sibling.average();
		me.average();
		
		//prints both objects
		System.out.println("\nWe have finished creating our two student objects. Let's print them both out:");
		System.out.println(me);
		System.out.println(sibling);
	}
}