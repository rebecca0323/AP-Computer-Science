package outfit;

import java.util.Scanner;

public class Errors {
	//main method to run exercises 2.1-2.16, each exercise has its own method
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); //creates new scanner instance
			
			exerciseOne(); //calls method for exercise one
			
			System.out.println("Please enter 3 INTEGERS, one by one with an enter after each one");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			exerciseTwo(a, b, c); //uses integers the user inputs as arguments for method for exercise 2
			
			/*System.out.println("Please enter 3 FLOATING POINT NUMBERS, one by one with an enter after each one");
			float d = scan.nextFloat();
			float e = scan.nextFloat();
			exerciseThree(d, e); //uses floats the user inputs as arguments for method for exercise 3
			
			System.out.println("Please enter a DOUBLE that represents the temperature in Farenheit");
			double f = scan.nextDouble();
			exerciseFour(f); //uses double the user inputs as argument for method for exercise four
			
			System.out.println("Please enter a FLOATING POINT NUMBER that represents the number of miles");
			d = scan.nextFloat(); //redefines the previous floating point number
			exerciseFive(d); //uses the float the user inputs as parameter to turn miles into kilometers
			
			System.out.println("Please enter 3 INTEGERS with the first number representing the # of hours, second # representing # of minutes, and last # representing seconds, each with an enter after each one");
			a = scan.nextInt(); //redefines previous floating point numbers
			b = scan.nextInt();
			c = scan.nextInt();
			exerciseSix(a, b, c); //passes in hours, minutes, and seconds in that order to find the total amount in seconds using these parameters
			
			System.out.println("Please enter an INTEGER that represents the number of seconds.");
			a = scan.nextInt();
			exerciseSeven(a); //uses the user's input in seconds to determine minutes and hours
			scan.nextLine(); //used to clear scanner so it can scan next line without using same integer as before
			
			System.out.println("Please enter two coordinates as (x,y) with an enter in between them");
			String g = scan.nextLine(); // uses two coordinates as strings because of way they are entered
			String h = scan.nextLine();
			exerciseEight(g, h); //passes in the two coordinates to find the distance formula
			
			System.out.println("Please enter an INTEGER as the radius of a sphere.");
			a = scan.nextInt(); //redefines integer a
			exerciseNine(a); //passes a as parameter as radius of sphere to find volume and surface area
			
			System.out.println("Please enter 3 FLOATING POINT NUMBERS, one by one with an enter after each number that represents the side lengths of a triangle.");
			d = scan.nextFloat(); //redefines variable
			e = scan.nextFloat();
			float i = scan.nextFloat(); //creates new variable
			exerciseTen(d, e, i); //uses floating numbers as parameters for exerciseTen method
			
			System.out.println("Please enter a FLOATING POINT NUMBER that represents the gallons of gas for a trip");
			d = scan.nextFloat(); //redefines variable
			System.out.println("Please enter a FLOATING POINT NUMBER that represents your odometer reading at the beginning of the trip");
			e = scan.nextFloat(); //odometer reading can go into the decimal points
			System.out.println("Please enter a FLOATING POINT NUMBER that represents your odometer reading at the end of the trip");
			i = scan.nextFloat();
			exerciseEleven(d, e, i); //passes in these arguments in particular order so method knows what variable does what
			
			System.out.println("Please enter an INTEGER that represents how many quarters are in your jar.");
			a = scan.nextInt(); //redefines a variable
			System.out.println("Please enter an INTEGER that represents how many dimes are in your jar.");
			b = scan.nextInt();
			System.out.println("Please enter an INTEGER that represents how many nickels are in your jar.");
			c = scan.nextInt();
			System.out.println("Please enter an INTEGER that represents how many pennies are in your jar.");
			int j = scan.nextInt(); //declares a new variable
			exerciseTwelve(a, b, c, j); //passes four parameters
		
			System.out.println("Random number generators: ");
			exerciseThirteen();*/
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
		
		//2.3 exercise deals with floats, which is a primitive data type
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
			System.out.println(a + "miles = " + km);
		}
		
		//2.6 exercise deals with three parameters and conversion factors to find time in seconds
		public static void exerciseSix(int a, int b, int c) {
			final int CONVERSION_FACTOR = 60;
			int seconds = a*CONVERSION_FACTOR*CONVERSION_FACTOR + b*CONVERSION_FACTOR + c;
			System.out.println(seconds);
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
			System.out.println(distance);
		}
		
		//2.9 exercise involves multiple cases of casting in order to produce a result with 4 decimals
		public static void exerciseNine(int r) {
			float volume = (float) ((int)((4 * Math.PI * Math.pow(r,3) * 10000))/3)/10000; //first takes the real decimal answer for volume and multiplies it by 10,000 and then casts to integer so other decimals will be truncated when divided by 10000
			float surfaceArea = (float) ((int)(4 * Math.PI * Math.pow(r,2) * 10000))/10000;
			System.out.println("Volume: " + volume + "\nSurface Area: " + surfaceArea);
		}
		
		//2.10 exercise involves math formula to find area of a triangle
		public static void exerciseTen(float a, float b, float c) {
			if((a + b) > c && (b + c) > a && (a + c) > b) { //if statement sees if inputed lengths can make a real triangle
				float s = (a + b + c)/2; //semi-perimeter that is used to calculate area
				float area = (float) ((int) ((Math.sqrt(s*(s-a)*(s-b)*(s-c))*1000)))/1000; //has to cast to integer and then back to float to get the 3 decimals by multiplying by 1000, then dividing by 1000 after casting to integer
				System.out.println("The area of a triangle with lengths " + a + ", "+ b + ", " + c +" is "+ area);
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
			System.out.println("Total amount of money you have in your jar in USD:\t$" + total + "\nQuarters:\t" + q + "\nDimes:\t\t" + d + "\nNickels:\t" + n + "\nPennies:\t" + p);
		}
		
		//2.13 exercise
		public static void exerciseThirteen() {
			int zerotonine = (int)(Math.random()*10);
			int onetoten = (int)(Math.random()*10 + 1);
			int twentytothirtyfour = (int)(Math.random()*20 + 20);
			int ntentonine = (int)(Math.random()*20 - 9);
			double randomdouble = Math.random();
			int onetosix = (int)(Math.random()*6 + 1);
			System.out.println("From 0 to 9: " + zerotonine + "\nFrom 1 to 10: " + onetoten + "\nFrom 20 to 34: " + twentytothirtyfour + "\nFrom -10 to 9: " + ntentonine + "\nA random double [between 0-1]: " + randomdouble + "\nFrom 1 to 6: " + onetosix);
		}
	}

