//Made by Rebecca Zhu on 10/5/19
//purpose is to make a new class for exercise 8

package chapter4;

public class Address {
	private String streetAddress, city, state;
	private int zipCode;
	
	//set up Address object with specified data
	public Address(String street, String town, String st, int zip) {
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	
	//returns the address object as a string
	public String toString() {
		String result;
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode + "\n";
		return result;
	}
}
