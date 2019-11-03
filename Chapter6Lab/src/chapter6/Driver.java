package chapter6;

import java.util.Scanner;

public class Driver {
	
	static Scanner scan = new Scanner(System.in); //allows the Scanner object to be accessed in all methods
	static Account[] LLBank = new Account[30]; //for exercise 6
	
	public static void main(String[] args) {
		//calls the methods of each exercise
		exerciseOne();
		exerciseTwo();
		exerciseThree();
		exerciseFourFive();
		exerciseSix();
		exerciseSeven();
		exerciseEight();
		exerciseTen();
		exerciseEleven();
		exerciseTwelve();
	}

	//exercise 6.1 counts how many times user has entered a certain digit
	private static void exerciseOne() {
		System.out.println("Exercise One:");
		int[] numberLine = new int[51]; //creates a new array, each index represents the number being entered
		for(int i = 0; i < numberLine.length;i++) { //loops through the array and initializes each index to 0
			numberLine[i] = 0;
		}

		int another = 0; //value to keep adding numbers, otherwise quit
		while(another == 0) {
			System.out.println("Type in a number between 0-50");
			int x = scan.nextInt();
			if(x>=0 && x<=50) { //checks if number is in the range
				numberLine[x]++; //adds 1 to the index of the array
			}
			System.out.println("Type a zero to enter another value. Type any other int to quit");
			another = scan.nextInt();
		}

		//prints the array
		for(int i = 0; i < numberLine.length;i++) {
			if(numberLine[i] != 0) { //only prints indexes where number was entered
				System.out.println(i + " was entered " + numberLine[i] + " time(s).");
			}
		}
	}
	
	//exercise 6.2 is the same as 6.1 but the range is -25 to 25
	private static void exerciseTwo() {
		int[] numberLine = new int[51]; //creates a new array, each index represents the number being entered, still has 51 numbers
		for(int i = 0; i < numberLine.length;i++) { //loops through the array and initializes each index to 0
			numberLine[i] = 0;
		}
	
		int another = 0; //value to keep adding numbers, otherwise quit
		while(another == 0) {
			System.out.println("\nExercise 2");
			System.out.println("Type in a number between -25 and 25");
			int x = scan.nextInt();
			if(x>=-25 && x<=25) { //checks to see if the int entered is in the range
				numberLine[(x+25)]++; //has to add 25 to the index because technically the first index is 0, but the value user enters is -25
			}
			System.out.println("Type a zero to enter another value. Type any other int to quit");
			another = scan.nextInt();
		}
	
		//prints the nonzero number of times an integer was entered
		for(int i = 0; i < numberLine.length;i++) {
			if(numberLine[i] != 0) {
				System.out.println((i-25) + " was entered " + numberLine[i] + " time(s)."); //has to convert index back to the corresponding number by subtracting 25
			}
		}
	}
	
	//exercise 6.3 deals with sorting array in descending order
	private static void exerciseThree() {
		System.out.println("\nExercise Three");
		int[] array = {3,9,6,1,2}; //original unsorted array
		System.out.println("Original array:");
		for(int a = 0; a<array.length; a++) { //prints array
			System.out.print(array[a] + " ");
		}
		//sorts the array
		Sorts.insertionSort(array);
		System.out.println("\nSorted array:"); //prints the sorted array
		for(int a = 0; a<array.length; a++) {
			System.out.print(array[a] + " ");
		}
	
	}
	
	//exercise four and five deal with printing an asterisk for each number entered or for every 5 numbers entered
	public static void exerciseFourFive() {
		System.out.println("\n\nExercise Four and Five:");
		int[] numberLine = new int[10]; //each index of the array represents a group of ten
		for(int i = 0; i < numberLine.length;i++) { //initializes all indexes to 0
			numberLine[i] = 0;
		}
	
		int another = 0;
		while(another == 0) {
			Scanner in = new Scanner(System.in);
			System.out.println("Type in a number between 1 and 100");
			int x = in.nextInt();
			if(x>= 1 && x<=100) { //checks if number is valid
				numberLine[(x-1)/10]++; //converts the number to the proper index of the array because of integer casting and each index is a group of 10
			}
			System.out.println("Type a zero to enter another value. Type any other int to quit");
			another = in.nextInt();
		}
		
		//prints the array with proper amount of asterisks
		for(int i = 0; i < numberLine.length; i++) {
			System.out.print((i*10 + 1) + " - " + (i*10 + 10) + " | "); //prints the left side which is converts index into properly lower and upper bounds
			
			
			//for exercise four, printing one asterick per value
			/*
			for(int a = numberLine[i]; a > 0; a--) {
				System.out.print("*");
			}
			*/
			
			//prints the proper amount of asterisks for exercise 5
			for(int a = numberLine[i]/5; a > 0; a--) { //takes value and divides it by 5, not caring about the left over and prints an asterisk for every value
				System.out.print("*");
			}
			System.out.println(); //makes new line
		}
	}
	
	//exercise 6.6 deals with using an array to manage all account classes
	public static void exerciseSix() {
		System.out.println("\nExercise Six:");
		int accountNum = 0; //represents index of array for accounts
		while(true) {
			//menu for the user to choose to add an account, print the accounts, or add 3% interest to all accounts
			System.out.println("Enter 1 to add a new account. Enter 2 to print all accounts. Enter 3 to add 3% interest. Enter 0 to quit.");
			int choice = scan.nextInt();
			if(choice == 1) { //option to add account
				scan.nextLine();
				System.out.println("You are creating a new account. Please enter the name in which the account will be under.");
				String name = scan.nextLine();
				System.out.println("Thanks " + name + ". Please enter an integer that represents your account number.");
				int num = scan.nextInt();
				System.out.println("Enter an initial amount to your account.");
				double init = scan.nextDouble();
				Account acct1 = new Account(name, num, init); //instantiates new account using overloaded constructor that takes in two arguments, the first one as a string and the second as an int and sets the balance to 0
				LLBank[accountNum] = acct1; //LLBank array is static array declared at top of Driver
				accountNum++; //increments the index of th array so new account can be added without replacing old account
			}
			if(choice == 2) { //option to print all the accounts
				for(int i = 0; i < LLBank.length; i++) { //loops through array and prints out non null accounts
					if(LLBank[i] != null)
						System.out.println(LLBank[i]);
				}
			}
			if(choice == 3) { //option to add interest to all accounts
				for(int i = 0; i < LLBank.length; i++) { //loops through the array and adds interest to all accounts
					if(LLBank[i] != null) {
						LLBank[i].addInterest();
					}
				}
				System.out.println("3% interest added to all accounts");
			}
			if(choice == 0)
				break; //breaks from the while loop
		}
	}
	
	//exercise 6.7 deals with an array that stores Grade values
	public static void exerciseSeven() {
		System.out.println("\nExercise Seven:");
		//makes each Grade object 
		Grade A = new Grade("A", 95);
		Grade Aminus = new Grade("A-", 90);
		Grade Bplus = new Grade("B+", 87);
		Grade B = new Grade("B", 83);
		Grade Bminus = new Grade("B-", 80);
		Grade Cplus = new Grade("C+", 77);
		Grade C = new Grade("C", 73);
		Grade Cminus = new Grade("C-", 70);
		Grade Dplus = new Grade("D+", 67);
		Grade D = new Grade("D", 63);
		Grade Dminus = new Grade("D-", 60);
		Grade F = new Grade("F", 0);
		
		//puts grade objects in only one array
		Grade[] grades = {A, Aminus, Bplus, B, Bminus, Cplus, C, Cminus, Dplus, D, Dminus, F};
		
		//prints all the grade objects in the array
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
	}
	
	//exercise 6.8 deals with an array of playing cards
	public static void exerciseEight() {
		System.out.println("Exercise Eight:");
		DeckOfCards deck = new DeckOfCards(); //instantiates a new deck of cards object
		while(true) {
			//menu that gives users the options with what to do to the deck of cards
			System.out.println("Enter 1 to deal a card. Enter 2 to shuffle. Enter 3 to find out how many cards are left. Enter 0 to quit.");
			int choice = scan.nextInt();
			if(choice == 1)
				deck.printDeck(); //prints the next card
			if(choice == 2) {
				deck.shuffleDeck(); //shuffles the deck
				System.out.println("Deck has been shuffled.");
			}
			if(choice == 3)
				deck.cardsLeft(); //prints how many cards are left
			if(choice == 0)
				break; //breaks from the while loop
		}
	}
	
	//exercise 9 is a simpler version of exercise 10, but the methods in the Quiz class had to be edited for program 10 so exercise 9 has been commented out
	
	/*public static void exerciseNine() {
		Quiz theQuiz = new Quiz();
		
		theQuiz.addQuestion("How many months are in a year?\na. 12\nb. 10\nc. 11", "a");
		theQuiz.addQuestion("How many days are in a week?\na. 10\nb. 7\nc. 6", "b");
		theQuiz.addQuestion("How many days are in February in a leap year?\na. 30\nb. 29\nc. 28", "b");
		
		theQuiz.giveQuiz();
		
		System.out.println("Your score on the quiz was " + theQuiz.getRight());
	}*/
	
	//exercise 6.9 and 6.10 deal with a quiz that is an array of questions
	public static void exerciseTen() {
		System.out.println("\nExercise Ten:");
		Quiz theQuiz = new Quiz(); //instantiates the quiz object
		//adds questions to the quiz and the answer
		theQuiz.addQuestion("How many days are in a year? (not a leap year)\na. 365\nb. 29\nc. 28", "b", 1);
		theQuiz.addQuestion("How many months are in a year?\na. 12\nb. 10\nc. 11", "a" , 2);
		theQuiz.addQuestion("How many days are in a week?\na. 10\nb. 7\nc. 6", "b", 3);
		theQuiz.addQuestion("How many days are in February in a leap year?\na. 30\nb. 29\nc. 28", "b", 4);
		
		theQuiz.giveQuiz(); //runs the quiz
		//prints how many u get right
		System.out.println("Your score on the quiz was " + theQuiz.getRight());
	}
	
	//exercise 6.11 deals with sorting CDs by title
	public static void exerciseEleven() {
		System.out.println("\nExercise 11:");
		CDCollection music = new CDCollection (); //instantiates new CDCollection object
		//adds CD to the CD collection
		music.addCD("By the Way", "Red Hot Chili Peppers", 14.95, 10);
		music.addCD("Come On Over", "Shania Twain", 14.95, 16);
	    music.addCD("Soundtrack", "The Producers", 17.95, 33);
	    music.addCD("Play", "Jennifer Lopez", 13.90, 11);
	    //prints the sorted CD collection
	    System.out.println(music);
	    //adds more CDs
	    music.addCD ("Double Live", "Garth Brooks", 19.99, 26);
	    music.addCD ("Greatest Hits", "Stone Temple Pilots", 15.95, 13);
	    System.out.println (music); //sorts the CD collection with the added CDs
	}
	
	//exercise 6.12 deals with sorting phone numbers by the contact's last name
	public static void exerciseTwelve() {
		System.out.println("\nExercise 12:");
		Contact[] friends = new Contact[7]; //creates array of Contact objects
		//adds the Contact objects to the respective indexes
		friends[0] = new Contact("Barika", "Favaken", "610-555-7384");
		friends[1] = new Contact("Lorenz", "Lowski", "215-555-3827");
		friends[2] = new Contact("Ely", "Kassakian", "733-555-2969");
		friends[3] = new Contact("Galen", "Powers", "663-555-3984");
		friends[4] = new Contact("Laura", "Getz", "464-555-3489");
		friends[5] = new Contact("Ching", "Lee", "322-555-2284");
		friends[6] = new Contact("Susan", "Getz", "243-555-2837");
		//sorts the array of Contact objects
		Sorts.selectionSort(friends);
		for(int i = 0; i < friends.length; i++) //prints all the friend objects that are sorted
			System.out.println(friends[i]);
	}
	
}