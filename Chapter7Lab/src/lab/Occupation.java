//Made by Rebecca Zhu 11/20
//purpose as a child class of the Person class

package lab;

public class Occupation extends Person{ //inheritance from the Person class
	//instance variable that only occupation has, not every person has
	private String occu;
	
	//constructor for the occupation object
	public Occupation(String n, String o) {
		super(n); //calls the constructor from the parent class and passes the person's name
		occu = o; //sets the instance variable based on the parameter
		
		printOcc(); //calls method to print the specific part of a person
	}
	
	//method that prints the person's occupation
	public void printOcc() {
		this.printPerson(); //calls method from the base class
		System.out.println("Occupation: " + occu);
	}
}
