//Made by Rebecca Zhu 11/20
//purpose as a child class of the Person class

package lab;

public class Income extends Person{ //inheritance from the Person class
	//instance variable that represents the person's income
	private int inco;
	
	//constructor for the income object
	public Income(String n, int i) {
		super(n); //calls the constructor from the parent class and passes the person's name
		inco = i; //sets the instance variable based on the parameter
		printInc(); //calls method to print the specific part of a person
	}
	
	//method that prints the person's income
	public void printInc() {
		this.printPerson(); //calls method from the base class
		System.out.println("Income: $" + inco);
	}
}
