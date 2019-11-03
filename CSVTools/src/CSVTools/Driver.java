package CSVTools;

import java.util.Scanner;

class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int choice = 1;
		while(choice != 0) {
			//allows players to choose either making a new entry or sorting the entries
			System.out.println("Enter 1 to make a new entry. Enter 2 to sort the entries. Enter 0 to quit.");
			choice = scan.nextInt();
			if(choice == 1)
				CSVWriter.csvWrite("text.csv"); //writes the entry
			if(choice == 2) {
				scan.nextLine();
				CSVReader.csvRead("text.csv"); //reads the entries
				CSVReader.printArray(); //makes new CSV file with sorted entries
				
			}
		}
	
	}


}