//Made by Rebecca Zhu 9/6/19
//Program made as Driver for my Fall Project

package outfit;

import java.util.Scanner;

public class Driver {
	
	static Theme[] fits;
	
	public static void main(String[] args) {
		
		String input;
		int start = 0;
		Boolean run = true;
		
		// array of Theme objects
		fits = new Theme[3];
		fits[0] = new Theme("Sweater", "Plaid skirt", "Beanie", "White Ankle Heel Boots");
		fits[1] = new Theme("Plaid shirt", "Jean skirt", "No hat", "Combat Boots");
		fits[2] = new Theme("White Sweater", "Denim Jeans", "No hat, but scarf", "Sneakers");
		
		Scanner scan = new Scanner(System.in);
		
		//main method that runs while run = true
		do{
			if(start == 0) {
				System.out.println("Welcome to the Fall Theme program, where you can see what type of Fall clothes would suit you the best");
			start++;
			}
			
			System.out.println("\nAnswer the following questions to see what type of Fall girl you are");
			System.out.println("Please press enter to contine");
			input = scan.nextLine();
			parser(questionOne(), questionTwo(), questionThree());
		
			System.out.println("Press enter to close the program.");
			input = scan.nextLine();
			run = false;
		}while (run == true);
		scan.close();
	}
	
	//question 1
	public static int questionOne() {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("\nA. What type of school game would you like to go watch?");
		System.out.println("\n1. Football\n2. Soccer\n3. Golf");
		input = scan.nextInt();
		return input;
	}
	
	public static int questionTwo() {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("\nB. What is your favorite fall festivity?");
		System.out.println("\n1. apple picking\n2. looking at foliage\n3. pumpkin carving");
		input = scan.nextInt();
		return input;
	}
	
	public static int questionThree() {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("\nC. What is your favorite leaf color");
		System.out.println("\n1. red\n2. green\n3. yellow");
		input = scan.nextInt();
		return input;
	}
	
	// method tries to see what the result is based on what the user inputs
	public static void parser(int a, int b, int c) {
		int d = (a + b + c)/3;
		
		System.out.println("Congrats, this is your go-to fall outfit");
		
		if (d <= 1.667) {
			printFit(0);
		}
		else if(d <= 2.333) {
			printFit(1);
		}
		else {
			printFit(2);
		}
	}
	
	//prints the outfit object
	public static void printFit(int a) {
		System.out.println("\n" + fits[a].getShirt() + "\n" + fits[a].getBottoms() + "\n" + fits[a].getHats() + "\n" + fits[a].getShoes());
	}
	
}
