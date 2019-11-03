package chapter2;

//Made by Rebecca Zhu on 9/11/19
//Purpose of this is to code the chapter 2 programming projects

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
import java.text.DecimalFormat;

public class ExerciseChapter2 {

	//main method to run exercises 2.1-2.16, each exercise has its own method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //creates new scanner instance
		
		exerciseOne(); //calls method for exercise one
		
		System.out.println("\nPlease enter 3 INTEGERS, one by one with an enter after each one");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		exerciseTwo(a, b, c); //uses integers the user inputs as arguments for method for exercise 2
		
		System.out.println("\nPlease enter 2 FLOATING POINT NUMBERS, one by one with an enter after each one");
		scan.nextLine();
		float d = scan.nextFloat();
		float e = scan.nextFloat();
		exerciseThree(d, e); //uses floats the user inputs as arguments for method for exercise 3
		
		System.out.println("\nPlease enter a DOUBLE that represents the temperature in Farenheit");
		double f = scan.nextDouble();
		exerciseFour(f); //uses double the user inputs as argument for method for exercise four
		
		System.out.println("\nPlease enter a FLOATING POINT NUMBER that represents the number of miles");
		d = scan.nextFloat(); //redefines the previous floating point number
		exerciseFive(d); //uses the float the user inputs as parameter to turn miles into kilometers
		
		System.out.println("\nPlease enter 3 INTEGERS with the first number representing the # of hours, second # representing # of minutes, and last # representing seconds, each with an enter after each one");
		a = scan.nextInt(); //redefines previous floating point numbers
		b = scan.nextInt();
		c = scan.nextInt();
		exerciseSix(a, b, c); //passes in hours, minutes, and seconds in that order to find the total amount in seconds using these parameters
		
		System.out.println("\nPlease enter an INTEGER that represents the number of seconds.");
		a = scan.nextInt();
		exerciseSeven(a); //uses the user's input in seconds to determine minutes and hours
		scan.nextLine(); //used to clear scanner so it can scan next line without using same integer as before
		
		System.out.println("\nPlease enter two coordinates as (x,y) with an enter in between them");
		String g = scan.nextLine(); // uses two coordinates as strings because of way they are entered
		String h = scan.nextLine();
		exerciseEight(g, h); //passes in the two coordinates to find the distance formula
		
		System.out.println("\nPlease enter an INTEGER as the radius of a sphere.");
		a = scan.nextInt(); //redefines integer a
		exerciseNine(a); //passes a as parameter as radius of sphere to find volume and surface area
		
		System.out.println("\nPlease enter 3 FLOATING POINT NUMBERS, one by one with an enter after each number that represents the side lengths of a triangle.");
		d = scan.nextFloat(); //redefines variable
		e = scan.nextFloat();
		float i = scan.nextFloat(); //creates new variable
		exerciseTen(d, e, i); //uses floating numbers as parameters for exerciseTen method
		
		System.out.println("\nPlease enter a FLOATING POINT NUMBER that represents the gallons of gas for a trip");
		d = scan.nextFloat(); //redefines variable
		System.out.println("Please enter a FLOATING POINT NUMBER that represents your odometer reading at the beginning of the trip");
		e = scan.nextFloat(); //odometer reading can go into the decimal points
		System.out.println("Please enter a FLOATING POINT NUMBER that represents your odometer reading at the end of the trip");
		i = scan.nextFloat();
		exerciseEleven(d, e, i); //passes in these arguments in particular order so method knows what variable does what
		
		System.out.println("\nPlease enter an INTEGER that represents how many quarters are in your jar.");
		a = scan.nextInt(); //redefines a variable
		System.out.println("Please enter an INTEGER that represents how many dimes are in your jar.");
		b = scan.nextInt();
		System.out.println("Please enter an INTEGER that represents how many nickels are in your jar.");
		c = scan.nextInt();
		System.out.println("Please enter an INTEGER that represents how many pennies are in your jar.");
		int j = scan.nextInt(); //declares a new variable
		exerciseTwelve(a, b, c, j); //passes four parameters
		
		System.out.println("\nRandom number generators: "); //doesn't take any user inputs
		exerciseThirteen(); //calls method for exercise 13
		
		exerciseFourteen(); //calls method for exercise 14
	}
	
	//2.1 exercise uses escape sequence \" to print a quote
	public static void exerciseOne() {
		System.out.println("A quote by Abraham Lincoln:");
		System.out.println("\"Whatever you are, be a good one.\"");
	}
	
	//2.2 exercise uses PEMDAS and 3 integer parameters
	public static void exerciseTwo(int a, int b, int c) {
		double d =  (double) (a + b + c)/3; //casts answer into double because average will not always be an integer
		System.out.println("Average: " + d);
	}
	
	//2.3 exercise deals with floats, which is a primitive data type and shows operations can be done on them
	public static void exerciseThree(float a, float b) {
		float sum = a + b;
		float difference = b - a;
		float product = a*b;
		System.out.println("Sum: " + sum +"\nDifference: " + difference + "\nProduct: " + product);
	}
	
	//2.4 exercise deals with final variables that can't be changed and also formula for converting Farenheit to Celsius
	public static void exerciseFour(double a) {
		final int BASE = 32; 
		final double CONVERSION_FACTOR = 5.0/9.0;
		double celsiusTemp = CONVERSION_FACTOR*(a - BASE); //conversion using user's input Farenheit temperature
		System.out.println("Celsius Temperature: " + celsiusTemp);
	}
	
	//2.5 exercise deals with casting float value into double
	public static void exerciseFive(float a) {
		final double CONVERSION_FACTOR = 1.60935;
		double km = a*CONVERSION_FACTOR;
		System.out.println(a + " miles = " + km + " km");
	}
	
	//2.6 exercise deals with three parameters and conversion factors to find time in seconds
	public static void exerciseSix(int a, int b, int c) {
		final int CONVERSION_FACTOR = 60;
		int seconds = a*CONVERSION_FACTOR*CONVERSION_FACTOR + b*CONVERSION_FACTOR + c;
		System.out.println(a + " hours + " + b + " minutes + " + c + " seconds = " + seconds + " seconds");
	}
	
	//2.7 exercise deals with remainders and quotients to reverse the exercise 2.6
	public static void exerciseSeven(int a) {
		final int CONVERSION_FACTOR_HOURS_TO_SECONDS = 3600; //conversion factors, as revealed by name and final = can't be changed
		final int CONVERSION_MINUTES_TO_SECONDS = 60;
		int hours = a/CONVERSION_FACTOR_HOURS_TO_SECONDS; //quotient
		int minutes = (a % CONVERSION_FACTOR_HOURS_TO_SECONDS)/CONVERSION_MINUTES_TO_SECONDS; //remainder divided by quotient
		int seconds = (a % CONVERSION_FACTOR_HOURS_TO_SECONDS)%CONVERSION_MINUTES_TO_SECONDS; //remainder
		System.out.println("Hours: " + hours +"\nMinutes: " + minutes + "\nSeconds: " + seconds);
	}
	
	//2.8 exercise deals with finding the distance between two points
	public static void exerciseEight(String a, String b) {
		String aNoParentheses = a.replace("(", "").replace(")", ""); //gets rid of the parentheses so the string can be split
		String bNoParentheses = b.replace("(", "").replace(")", "");
		int x1 = Integer.parseInt(aNoParentheses.split(",")[0]); //parses the first integer, as denoted by the 0th index of the array from string entered and split the string at the comma
		int y1 = Integer.parseInt(aNoParentheses.split(",")[1]); //parses the first integer, as denoted by the first index of the array from string entered and split the string at the comma
		int x2 = Integer.parseInt(bNoParentheses.split(",")[0]); //saves the integer being parsed as the x and y coordinates
		int y2 = Integer.parseInt(bNoParentheses.split(",")[1]);
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); //distance formula using Math.sqrt and Math.pow methods for square root ad powers respectively
		System.out.println("The distance between the two coordinates is: " + distance);
	}
	
	//2.9 exercise involves the DecimalFormat class in order to round answers to 4 decimals
	public static void exerciseNine(int r) {
		double volume = (4 * Math.PI * Math.pow(r,3))/3; //formula for volume of sphere
		double surfaceArea = 4 * Math.PI * Math.pow(r,2); //formula for surface area of sphere
		DecimalFormat fmt = new DecimalFormat("0.####"); //rounds the output to four decimal places
		System.out.println("Volume: " + fmt.format(volume) + "\nSurface Area: " + fmt.format(surfaceArea)); //calls the format method within the DecimalForat class
	}
	
	//2.10 exercise involves math formula to find area of a triangle
	public static void exerciseTen(float a, float b, float c) {
		if((a + b) > c && (b + c) > a && (a + c) > b) { //if statement sees if inputed lengths can make a real triangle
			float s = (a + b + c)/2; //semi-perimeter that is used to calculate area
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //heron's formula using methods from Math class
			DecimalFormat fmt = new DecimalFormat("0.###"); //rounds the output to three decimal places
			System.out.println("The area of a triangle with lengths " + a + ", "+ b + ", " + c +" is "+ fmt.format(area)); //uses decimal format to round area to 3 decimals
		}
		else { //prints message saying lengths given do not form triangle
			System.out.println("Inputed lengths do not form a triangle due to triangle inequality.");
		}
	}
	
	//2.11 exercise uses word problems to turn into math equations to use 
	public static void exerciseEleven(float g, float b, float e) {
		float mpg = (e-b)/g; //formula for mpg
		if(mpg > 0) { //checks if mpg is valid
			System.out.println("Your mpg of gas for a trip is " + mpg);
		}
		else if(mpg == 0) { // beginning and end of odometer readings are same
			System.out.println("You did not drive anywhere!");
		}
		else { //beginning odometer reading is greater than ending odometer reading
			System.out.println("You can't drive negative distance!");
		}
	}
	
	//2.12 exercise deals with casting and currency formatter
	public static void exerciseTwelve(int q, int d, int n, int p) {
		float total = (float) ((q * 0.25) + (d * .1) + (n * .05) + (p * .01)); //casts integer * decimal into a float
		NumberFormat money = NumberFormat.getCurrencyInstance(); //numberFormat method
		System.out.println("Total amount of money you have in your jar: " + money.format(total) + "\nQuarters:\t" + q + "\nDimes:\t\t" + d + "\nNickels:\t" + n + "\nPennies:\t" + p);
	}
	
	//2.13 exercise uses casting and also random method from Math class
	public static void exerciseThirteen() {
		int zerotonine = (int)(Math.random()*10); //since math.random returns a double between 0 and 1, you have to multiply by 10 to get it to be from 0 to 9 then cast to integer
		int onetoten = (int)(Math.random()*10 + 1); //same as before but add 1 to include 10 and not include 0
		int twentytothirtyfour = (int)(Math.random()*15 + 20); //multiply by 15 to make it from 0-15 then add 20 to make it 20-35 not including 35
		int ntentonine = (int)(Math.random()*20 - 9); //subtract 9 because you want to start at -10
		double randomdouble = Math.random(); //math.random already returns a double so no manipulation is necessary
		int onetosix = (int)(Math.random()*6 + 1);
		System.out.println("From 0 to 9: " + zerotonine + "\nFrom 1 to 10: " + onetoten + "\nFrom 20 to 34: " + twentytothirtyfour + "\nFrom -10 to 9: " + ntentonine + "\nA random double [between 0-1]: " + randomdouble + "\nFrom 1 to 6: " + onetosix);
	}
	
	//2.14 exercise deals with random number with restrictions
	public static void exerciseFourteen() {
		Random generator = new Random();
		int one = generator.nextInt(6) + 2; //starting phone number is between 2-7 because US numbers don't start with 0 or 1
		int two = generator.nextInt(8); //second digit is between 0-7
		int three = generator.nextInt(8); //third digit also between 0-7, doing first three digits separately is more efficient than having loops to see if excluded number is there
		int middle = generator.nextInt(643) + 100; //middle three has to be from 100-742
		int last = generator.nextInt(9000)+1000; //last has to be from 1000-9999
		System.out.println("\nThe random phone number is: " +one + two + three + "-" + middle + "-" + last); //prints the phone number
	}
}

