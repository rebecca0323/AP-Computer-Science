// Made by Rebecca Zhu on 9/27/19
// Chapter 3 programming projects

//package that lets all the classes use the public methods
package chapter3;

import java.util.Scanner; //needed for the Scanner object for user input
import java.text.DecimalFormat; //needed to format average correctly in exercise 1
import java.util.Random; //needed to come up with a random integer for exercise 10

public class Chapter3Exercises {

	public static void main(String[] args) {
		//calls each method that represents a programming project
		exerciseOne();
		exerciseTwo();
		exerciseThree();
		exerciseFour();
		exerciseFive();
		exerciseSix();
		exerciseSeven();
		exerciseEight();
		exerciseNine();
		exerciseTen();
		exerciseEleven();
		exerciseTwelve();
		exerciseThirteen();
		exerciseFourteen();
		exerciseFifteen();
	}
	
	//purpose of exercise 1 is to prevent runtime error when you try to calculate average when count is 0
	public static void exerciseOne() {
		int sum = 0, value, count = 0;
		double average;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter an integer (0 to quit): ");
			value = scan.nextInt();
			count++; //increments count
			sum += value;
			System.out.println("The sum so far is " + sum);
			if(value == 0) {
				break; //breaks the while loop when user decides to stop
			}
		}
		System.out.println("\nNumber of values entered: " + count);
		average = (double) sum/count; //casts the sum as a double so the average will be accurate
		DecimalFormat fmt = new DecimalFormat("0.###"); //decimal formating 
		if(count == 1) {
			System.out.println("The average is undefined"); //technically this means the first user input is 0 so you can't divide by 0
		}
		else {
			System.out.println("The average of the numbers is " + fmt.format(average));
		}
	}
	
	//purpose for exercise 2 is to check if year is a leap year
	public static void exerciseTwo() {
		Scanner scan = new Scanner(System.in); //instantiates new scanner object
		System.out.println("\nPlease enter a year after 1852:");
		int year = scan.nextInt();
		if (year > 1582) { //checks if year is after 1582, executes only if this is true
			if(year % 4 == 0) { //nested if statements to check each condition for leap year
				if((year % 100 == 0) && (year % 400 != 0)) //if year is divisible by 100 but not 400, check using the modulo operator
					System.out.println(year + " is not a leap year");
				else //these don't need brackets because the statement is only 1 line
					System.out.println(year + " is a leap year");
			}
			else
				System.out.println(year + " is a leap year");
		}
		else
			System.out.println("Not a valid leap year. Leap years were not used before 1582!");
	}
	
	//purpose for exercise 3 is to have a while loop so it keeps asking user for year until user decides to quit
	public static void exerciseThree() {
		Scanner scan = new Scanner(System.in);
		while(true) { //always true unless break
			System.out.println("Enter 1 to continue or 0 to quit"); //gives user option to quit or continue
			int sentinel = scan.nextInt();
			if(sentinel == 0)
				break; //exits the while loop
			else if(sentinel == 1)
				exerciseTwo(); //calls exercise 2 method
			else
				System.out.println("Not a valid input"); //if user doesn't input 0 or 1, then loops again and asks user to input something again
		}
	}
	
	//purpose for exercise 4 is to print the sum of all the even integers between 2 and the user's input
	public static void exerciseFour() {
		Scanner scan = new Scanner(System.in);
		int user, sum = 0; 
		while(true) { // allows users to enter another integer if first integer isn't valid
			System.out.println("Enter an integer greater than or equal to 2:");
			user = scan.nextInt();
			if(user >= 2) {
				for(int i = 0; i <= user/2; i++) { //has to divide user input by 2 because we are trying to find the sum of all the even numbers, which is every other number
					sum += 2*i; //multiply by 2 because its all the even numbers
					//the logic is that user/2 finds how many even numbers are between 2 and the integer entered, and summing them with *2 while incrementing i allows consecutive even numbers to be added
				}
				System.out.println("The sume of all the even numbers between 2 and " + user + " inclusive is: " + sum); //prints the sum
				break; //exits the while loop and the method
			}
			else { //goes with the first if statement
				System.out.println("Not a valid input. Enter a new input");
			}
		}
	}
	
	//purpose for exercise 5 is to take a string and print each character on a different line
	public static void exerciseFive() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease enter a string so that this program can print a character per line:");
		String user = scan.nextLine();
		for(int i = 0; i < user.length(); i++) { //loops through each character in the string using a for loop until it is at the string length
			System.out.println(user.charAt(i)); //uses the String class's method charAt to find the character at the i'th index of the string
		}
	}
	
	//purpose for exercise 6 is to determine the composition of an integer entered
	public static void exerciseSix() {
		int user, place, odd = 0, even = 0, zero = 0; //initializes the # of odd, even, and zero digits in the number as 0, which allows them to be incremented later on
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease enter a integer so the number of odd, even, and 0 digits can be determined:");
		user = scan.nextInt();
		if(user == 0)//if user input is 0, then we don't need to loop through all the digits
			zero++; //increments number of 0 so that it is 1 and skips over while loop to print the number of 0's as 1.
		while(user > 0) {
			place = user % 10; //finds the unit digit
			if(place == 0)//increments the number of 0 if the last digit is 0
				zero++;
			else if(place % 2 == 1) //this means it has a remainder of 1 when divided by 2, so it is odd
				odd++;
			else //only 1 choice left which is even digit
				even++;
			//not part of the if-else statements and will always run
			user = user/10; //arithmetic cast to an integer by dividing by 10 and cutting off the decimal afterwards so it focuses on the next digit to the left and repeats this until no digits left
		}
		System.out.println("The number of odd digits is: " + odd + "\nThe number of even digits is: " + even + "\nThe number of zeros is: " + zero);
	}
	
	//purpose of exercise 7 is to print a multiplication table, can be done with nested for loops
	public static void exerciseSeven() {
		System.out.println("\nMultiplication table: \n");
		for(int i = 1; i < 13; i++) { //represents the rows and there are 12 rows
			for(int j = 1; j < 13; j++) { //represents the columns and there are 12 columns
				System.out.print(i*j + " "); //the value of row*column, which is the cell and spaced apart
			}
			System.out.println(); //enters after each row
		}
	}
	
	//purpose of exercise 8 is to make count++ before the print statement
	public static void exerciseEight() {
		System.out.println();
		final int LIMIT = 5; //final cannot be changed in the method
		int count = 0; //sets count as 0, so that when incremented it is the same as before
		while(count < LIMIT) {
			count++;
			System.out.println(count);
		}
		System.out.println("Done");
	}
	
	//purpose of exercise 9 is to print the bottles of beer song depending on how many verses user wants
	public static void exerciseNine() {
		int bottles = 100; //number of bottles in the beginning
		Scanner scan = new Scanner(System.in);
		System.out.println("\nHow many verses of \"One Hundred Bottles of Beer\" would you like to play?");
		for(int i = scan.nextInt(); i > 0; i--) { //loops so that there are i number of verses
			if(i > 100) { //only 100 bottles, cannot have over 100 verses
				System.out.println("Your input is higher than the number of bottles of beer!");
				break; //exits the for loop
			}
			//prints the verse, needs (bottle - 1) bottles in the end because a bottle has been knocked
			System.out.println(bottles + " bottles of beer on the wall\n" + bottles + " bottles of beer\nIf one of those bottles should happen to fall\n" + (bottles - 1) + " bottles of beer on the wall");
			bottles--; //decrements bottle each time so the right number of bottles are printed
		}
	}
	
	//purpose of exercise 10 is to guess a number 
	public static void exerciseTen() {
		final int MAX = 100;
		int answer, guess;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random(); //uses Random number constructor from Random class
		answer = generator.nextInt(MAX) + 1; //answer will be a number between 1 and 100
		System.out.println("\nI'm thinking of a number between 1 and " + MAX + ". Guess what it is or enter 0 to quit"); //asks user to guess the number
		do { //do while loop allows guess to be null in the beginning, whereas while loop will need guess to be a certain value
			guess = scan.nextInt();
			if(guess == 0) { //sentinel value of 0 that exits code
				System.out.println("You have exited the program. Thank you for trying to guess the number. It was " + answer + ".");
				break; //exits the do while loop and then the method
			} //needs the quotes because two lines must be executed as the statement and not just 1 line
			else if(guess > answer) //this means the answer is too high
				System.out.println("That is not correct, sorry. Your answer is too high. Guess again or enter 0 to quit");
			else if(guess < answer) //this means answer is too low
				System.out.println("That is not correct, sorry. Your answer is too low. Guess again or enter 0 to quit.");
			else //if it's not too high or too low, then answer is guessed correctly
				System.out.println("That is correct! You guessed " + guess + " and the number I am thinking of is also " + answer);
		} while (answer != guess);
	}
	
	//purpose for exercise 11 is to create a more lenient palindrome tester that allows spaces and punctuations to be ignored, also is not case sensitive
	public static void exerciseEleven() {
		String str, another = "y", newString = "";
		char newChar; //is the new character that will be added to the new string
		int left = 0, right;
		Scanner scan = new Scanner (System.in);
		while(another.equalsIgnoreCase("y")) { //when the user wants to run again by entering a y
			System.out.println("\nEnter a potential palindrome:");
			str = scan.nextLine();
			for(int i = 0; i < str.length(); i++) { //loops through each character in the string
				if(Character.isLetterOrDigit(str.charAt(i))){ //determines if the char in the i'th index is a letter or digit
					newChar = Character.toLowerCase(str.charAt(i)); //allows for differences in upper and lower case to be ignore
					newString += newChar; //concatenates the character to the string, even though string is immutable
				}
			}
			right = newString.length() - 1; //the last letter, as to subtract 1 because indexes start at 0 so everything is shifted down 1
			while (newString.charAt(left) == newString.charAt(right) && left < right) { //checks to see if they're equal and on both sides of the middle letter
				left++; //increments left
				right--; //decrements right, kind of like moving towards the center letter to check again
			}
			if(left < right) //if right is greater than left, then not all the letters/digits are the same, as if they were the same, then left and right would be closer together and left would be greater than right or equal to right
				System.out.println("That string is NOT a palindrome.");
			else
				System.out.println("That string IS a palindrome.");
			System.out.println("Test another palindrome (y/n)?"); //not part of the if-else statement block
			another = scan.nextLine(); //checks if user wants to run again
		}
	}
	
	//purpose of exercise 12 is to print different patterns of spaces and asterisks
	public static void exerciseTwelve() {
		int numStar, numSpace; //not defined yet because it changes for each of the four diamonds
		System.out.println("\nPart a:\n");
		numStar = 10; //there are 10 asterisks in the first line 
		for(int i = 0; i < 10; i++) { //loops through and prints each row, there are 10 rows, so i < 10 when starting at 0
			for(int j = 0; j < numStar; j++) //prints the number of asterisks in each row
				System.out.print("*");
			numStar--; //decrements the number of asterisks to be printed in the next row
			System.out.println(); //starts new line
		}
		
		//part b picture
		System.out.println("\nPart b:\n");
		numStar = 1; //first line has 1 asterisk
		numSpace = 9; //first line has 9 spaces
		for(int i = 0; i < 10; i++) { //loops through and prints each row, there are 10 rows once again, so i < 10 when starting at 0
			for(int j = 0; j < numSpace; j++) //prints the spaces first because they are on the left of the asterisks
				System.out.print(" ");
			for(int h = 0; h < numStar; h++) //prints the asterisks on the same line as the spaces
				System.out.print("*");
			numSpace--; //decrements the spaces for the next line
			numStar++; //increments the number of asterisks for the next row
			System.out.println(); //starts new line after printing the whole row
		}
		
		//part c picture
		System.out.println("\nPart c:\n");
		numStar = 10; //first line has 10 asterisks
		numSpace = 0; //first line has 0 spaces
		for(int i = 0; i < 10; i++) { //loops through and prints each row, there are 10 rows once again, so i < 10 when starting at 0
			for(int j = 0; j < numSpace; j++) //spaces printed before the asterisks because they're on the left of the asterisks
				System.out.print(" "); //uses print instead of println so they will be printed on the same line
			for(int h = 0; h < numStar; h++) //then prints asterisks after the spaces
				System.out.print("*");
			numSpace++; //increases number of spaces
			numStar--; //while decreasing number of asterisks
			System.out.println(); //starts new line
		}
		
		//part d picture
		System.out.println("\nPart d:\n");
		//used to draw the top 5 rows
		numStar = 1; //1 star in the middle
		numSpace = 4; //four spaces in the top row
		for(int i = 0; i < 5; i++) { //loops through and prints each row, but there are only 5 rows in the top part, so i < 5 when starting at 0
			for(int j = 0; j < numSpace; j++) //prints the spaces to the left of the asterisks
				System.out.print(" ");
			for(int h = 0; h < numStar; h++) //prints the asterisks
				System.out.print("*"); //no need to print spaces to the right of asterisks because they are not visible to user
			numSpace -= 1; //number of spaces decreases by 1 per line
			numStar += 2; //number of asterisks increase by 2 per line
			System.out.println(); //starts new line
		}
		//used to draw bottom 5 rows
		numStar = 9; //9 stars in the 6th row
		numSpace = 0; // no spaces in the 6th row
		for(int i = 0; i < 5; i++) { //loops through all 5 of the bottom rows to print the asterisks and space combos
			for(int j = 0; j < numSpace; j++)
				System.out.print(" ");
			for(int h = 0; h < numStar; h++)
				System.out.print("*");
			numSpace += 1; //adds spaces now to form diamond shape
			numStar -= 2; //decreases the asterisks per line
			System.out.println();
		}
	}
	
	//purpose for exercise 13 is to count how many vowels, consonants, spaces, and punctuation marks in a string using many cases
	public static void exerciseThirteen() {
		int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0, space = 0, consonant = 0, punctuation = 0; //defining all the variables and setting them to 0 allow them to be incremented later on
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease enter a string that can contain vowels, consonants, spaces, and punctuation marks:");
		str = scan.nextLine();
		str = str.toLowerCase(); //allows each character to be compared while ignoring the case
		for(int i = 0; i < str.length(); i++) { // for loop runs through each character in the all lowercase string, starts at 0 because of the way indexes work
			if(str.charAt(i) == 'a') //checks to see if there a letter a in the i'th index of the string
				acount++; //if there is then increments the number of letters 'a' counted in the string
			else if(str.charAt(i) == 'e') //checks to see if there a letter e in the i'th index of the string
				ecount++;
			else if(str.charAt(i) == 'i') //checks to see if there a letter i in the i'th index of the string
				icount++;
			else if(str.charAt(i) == 'o') //checks to see if there a letter o in the i'th index of the string
				ocount++;
			else if(str.charAt(i) == 'u') //checks to see if there a letter u in the i'th index of the string
				ucount++;
			else if(str.charAt(i) == ' ') //checks to see if there is a space in the i'th index of the string
				space++;
			else if(Character.isLetter(str.charAt(i))) //checks to see if the remaining letters are still consonants due to the fact that this statement won't run if the character has already been determined to be a vowel
				consonant++;
		}
		//assumes everything else in the string is a punctuation mark and can be found by taking the number of characters in the string and subtracting the other types
		punctuation = str.length() - (acount + ecount + icount + ocount + ucount + space + consonant);
		System.out.println("The number of a's in your string is: " + acount + "\nThe number of e's in your string is: " + ecount + "\nThe number of i's in your string is: " 
				+ icount + "\nThe number of o's in your string is: " + ocount + "\nThe number of u's in your string is: " + ucount + "\nThe number of spaces in your string is: " + space 
				+ "\nThe number of consonants in your string is: " + consonant +  "\nThe number of punctuation marks in your string is: " + punctuation);
	}
	
	//purpose of exercise 14 is to play rock paper scissors with the computer
	public static void exerciseFourteen() {
		Scanner scan = new Scanner(System.in);
		String computerValue, userValue; //allows numbers for comparisons but needs the actual choice to be printed later on denoted as computerValue or userValue
		int userwin = 0, userloss = 0, usertie = 0; //counters for the wins, ties, and losses for the computer
		while(true) { //always is true unless from the break statement
			int computer = (int) (Math.random() * 3 + 1); //random number that follows same procedure as user, 1 for rock, 2 for paper, and 3 for scissors, has to be cast to integer since Math.random() returns a double between 0 and 1
			System.out.println("\nPlease enter 1 for rock, 2 for paper, and 3 for scissors, or 0 to quit:");
			int user = scan.nextInt();
			if(user == 0) { //this means user wants to quit the program
				System.out.println("User wins: " + userwin + "\nUser losses: " + userloss + "\nUser ties: " + usertie);
				break; //exits the while loop
			}
			if(computer == 1) //sets the computerValue as the String associated with the number
				computerValue = "rock";
			else if (computer == 2)
				computerValue = "paper";
			else
				computerValue = "scissors";
			if(user == 1) //sets the userValue as the String associated with the number
				userValue = "rock";
			else if (user == 2)
				userValue = "paper";
			else
				userValue = "scissors";
			System.out.println("You chose " + userValue + "\nComputer chose " + computerValue); //prints what you chose and what computer chose
			if(computer == user) { //checks for a tie first
				System.out.println("You tied with the computer");
				usertie++; //increments the number of ties
			}
			else if((computer == 2 && user == 1) || (computer == 3 && user == 2) || (computer == 1 && user == 3)) { //checks the conditions for the computer to win
				System.out.println("The computer won. Better luck next time.");
				userloss++; //increments the number of losses
			}
			else { //if computer didn't win and didn't tie, then user must've won
				System.out.println("Congratulations! You won!");
				userwin++; //increments the number of wins and runs statement in while loop again
			}
		}
	}
	
	//purpose for exercise 15 is to determine the composition of 3 random digits
	public static void exerciseFifteen() {
		Scanner scan = new Scanner(System.in); //instantiates new scanner object
		int sentinel = 1; // changes to 0 when user wants to quit
		while(sentinel != 0) { //program keeps running if user doens't input 0
			int a = (int) (Math.random() * 10); //first random integer between 0 and 9
			int b = (int) (Math.random() * 10); //second random integer between 0 and 9
			int c = (int) (Math.random() * 10); //third random integer between 0 and 9
			System.out.println("\nSlot machine results: " + a + b + c); //prints the results, since there's string in front, a + b + c will not result in the mathematical sum of them
			if(a == b && b == c) //checks if all 3 are equal by transitive property in math
				System.out.println("All three results are the same");
			else if((a == b && c != a) || (a == c && b != a) || (b == c && a != b)) //checks all three cases where 2 are same and third is different using or statements
				System.out.println("Two of the three numbers are the same");
			else //assumes that if not all 3 and not 2 are the same, then they are all different
				System.out.println("All numbers are different!");
			System.out.println("Enter 1 to continue or 0 to quit"); //prompts users to run again or quit
			if(scan.nextInt() == 0)
				sentinel = 0; //sets sentinel value as 0 and exits the while loop
		}
	}
}
