//Made by Rebecca Zhu 11/20
//purpose as a child class of the Person class

package lab;

public class Nationality extends Person{ //inheritance from the Person class
	//instance variable that represents the person's nationality
	private String nation;
	
	//constructor for the nationality object
	public Nationality(String n, String l) {
		super(n); //calls the constructor from the parent class and passes the person's name
		nation = l; //sets the instance variable based on the parameter
		printNationality(); //calls method to print the specific part of a person
	}
	
	//method that prints the person's nationality
	public void printNationality() {
		this.printPerson(); //calls method from the base class
		System.out.println("Nationality: " + nation);
	}

}
