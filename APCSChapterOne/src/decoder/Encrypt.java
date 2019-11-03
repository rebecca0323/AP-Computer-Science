//Made by Rebecca Zhu 9/10/19
//Made to encrypt and decode strings

package decoder;
//takes string boolean and integer

import java.util.Scanner;

public class Encrypt {
	//private variables that describe the objects created by constructor
	private String word;
	private boolean encrypt;
	private int offset;
	
	//constructor sets variables to what user inputs
	public Encrypt(){
		Scanner scan = new Scanner(System.in); //creates new scanner instance
		System.out.println("Welcome to the encrypter and decoder program.\nPlease enter the word you would like to encrypt");
		word = scan.nextLine(); //sets the private string as what user inputs
		System.out.println("Please enter the number you would like to change your string by.");
		offset = scan.nextInt(); //sets private int as what user inputs
		System.out.println("Please enter 1 if you would like to increase the Unicode key by the integer you entered or 2 if you would like to decrease the Unicode key by the integer you entered.");
		int function = scan.nextInt(); //cant directly take boolean from user so has to take in integer and set boolean as true or false based on integer
		if(function == 1) {
			encrypt = true;
		}
		else if(function == 2) {
			encrypt = false;
		}
		else {
			System.out.println("Invalid function.");
		}
	}
	
	//method that encrypts and decodes the word in the constructor
	public void crypt() {
		String encrypted = ""; //declares variable that will be the end resulting word
		int newvalue; //int represents new unicode value after incremented using offset
		for(int x = 0; x < word.length(); x++) { //runs through each letter in the string the user inputs
			int a = word.codePointAt(x); //converts each symbol/letter into unicode
			if(encrypt == true) { //using if statements to see if user wishes to add or subtract to string
				newvalue = a + offset;
			}
			else if(encrypt == false) {
				newvalue = a - offset;
			}
			else { //executes when user doesn't input a valid function
				System.out.println("Invalid function");
				newvalue = 0;
				return;
			}
			char c = (char) newvalue; //casts the integer into a character that is used to make the new string word
			encrypted += c; //adds the character to string
		}
		word = encrypted; //sets word as encrypted word
	}
	
	//method that prints the word variable of the object instance
	public void print() { 
		System.out.println(word);
	}
	
}
