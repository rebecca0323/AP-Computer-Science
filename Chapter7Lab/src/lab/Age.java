//Made by Rebecca Zhu 11/20
//purpose as a child class of the Person class

package lab;

public class Age extends Person{ //inheritance from the Person class
	//instance variable that represents the person's age
	private int theAge;
	
	//constructor for the age object
	public Age(String n, int num) {
		super(n); //calls the constructor from the parent class and passes the person's name
		theAge = num; //sets the instance variable based on the parameter
		printAge(); //calls method to print the specific part of a person
	}
	
	//method that prints the person's age
	public void printAge() {
		this.printPerson(); //calls method from the base class
		System.out.println("Age: " + theAge);
	}
}
