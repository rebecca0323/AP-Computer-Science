//Made by Rebecca Zhu 1/16
//Driver for the Chapter 8 labs

package lab;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		exerciseOne();
		exerciseTwo();
		exerciseThree();
		exerciseFour();
		exerciseSix();
		exerciseSeven();
		exerciseEight();
		exerciseNine();
		exerciseTen();
	}
	
	//exercise 1 deals with recursive methods to detect a palindrome
	public static void exerciseOne() {
		System.out.println("Exercise 1:");
		String str, another = "y";
	    Scanner scan = new Scanner (System.in);
	    while (another.equalsIgnoreCase("y")) // allows y or Y
	    {
	       System.out.println ("Enter a potential palindrome:");
	       str = scan.nextLine();
	       if(PalindromeDetect.palindrome(str) == true) //uses the palindrome method from the PalindromeDetect class
	    	   System.out.println("Valid palindrome");
	       else
	    	   System.out.println("Not a palindrome");
	       
	       System.out.print ("Test another palindrome (y/n)? ");
	       another = scan.nextLine();
	    }
	}
	
	//exercise 2 deals with finding the greatest common divisor of two numbers
	public static void exerciseTwo() {
		System.out.println("\nExercise 2:");
		String another = "y";
		int num1, num2;
		Scanner scan = new Scanner (System.in);
	    while (another.equalsIgnoreCase("y")) // allows y or Y
	    {
	       System.out.println ("Enter a first integer:");
	       num1 = scan.nextInt();
	       System.out.println ("Enter a second integer:");
	       num2 = scan.nextInt();
	       scan.nextLine();
	       //runs gcd method from DivisorCalc class
	       System.out.println("The gcd of " + num1 + " and " + num2 + " is " + DivisorCalc.gcd(num1, num2));
	       
	       System.out.print ("Find another factor (y/n)? ");
	       another = scan.nextLine();
	    }
	}
	
	//exercise 3 deals with solving the Maze
	public static void exerciseThree() {
		System.out.println("\nExercise 3:");
		Maze labyrinth = new Maze();
		  
			//original maze
	      System.out.println (labyrinth);

	      //uses the traverse method for the Maze class
	      if (labyrinth.traverse (0, 0))
	         System.out.println ("The maze was successfully solved!");
	      else
	         System.out.println ("There is no possible path.");

	      //prints complete/incomplete maze
	      System.out.println (labyrinth);
	}
	
	//exercise 4 deals with a 3D maze
	public static void exerciseFour() {
		System.out.println("\nExercise 4:");
		ThreeDMaze labyrinth = new ThreeDMaze();
		   
		//original maze
	      System.out.println (labyrinth);

	    //uses the traverse method for the ThreeDMaze class
	      if (labyrinth.traverse (0, 0, 0))
	         System.out.println ("The maze was successfully solved!");
	      else
	         System.out.println ("There is no possible path.");

	      //prints complete/incomplete maze
	      System.out.println (labyrinth);
	}
	
	//exercise 6 deals with nonattacking queens problem
	public static void exerciseSix() {
		System.out.println("\nExercise 6:");
		Queens board = new Queens(); //instantiates the chess board object
		System.out.println(board); //prints it out
	}
	
	//exercise 7 deals with creating blurbs
	public static void exerciseSeven() {
		System.out.println("\nExercise 7:");
		Language blurb = new Language();
		blurb.runExerSeven();
	}
	
	//exercise 8 deals with checking if a blurb is valid
	public static void exerciseEight() {
		System.out.println("\nExercise 8:");
		Language b = new Language();
		Scanner scan = new Scanner(System.in);
		String str, another = "y";
		
		while (another.equalsIgnoreCase("y")) // allows y or Y
	    {
	       System.out.println ("Enter a potential blurb:");
	       str = scan.nextLine();
	       b.testBlurb(str); //uses the testBlurb method in the Language class
	       
	       System.out.print ("Test another blurb (y/n)? ");
	       another = scan.nextLine();
	    }
		
	}
	
	//exercise 9 deals with the Pascal's Triangle
	public static void exerciseNine() {
		System.out.println("\nExercise 9:");
		System.out.println("Enter a number that represents the n'th line in the Pascal's Triangle to print:");
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		PascalsTriangle ninth = new PascalsTriangle(user); //instantiates a PascalTriangle object that takes in the user's # as parameter
	}
	
	//exercise 10 deals with recursive sorting
	public static void exerciseTen() {
		System.out.println("\nExercise 10:");
		double[] prices = new double[] {9.83, 3.20, 4.50, 6.31, 15.67, 1.23};
		
		//prints original prices array
		System.out.println("Original prices:");
		for(int i = 0; i < prices.length; i++) {
			System.out.print(prices[i] + " ");
		}
		System.out.println("\n\nSorted prices:");
		
		//sorts the prices and prints them
		RecursiveSorts.quickSort(prices);
	}
}
