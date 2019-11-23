//made by rebecca Zhu 11/20
//purpose is for a subclass of Employee

package lab;

public class Nurse extends Employee{ //inheritance from superclass of Employee

	//constructor for base class
	public Nurse(String c, String n, int y, int s) {
		super(c, n, y, s); //passes the parameters into the base class (Employee)'s constructor
		giveVaccine(); //calls the method for nurse
		super.printEmployee(); //prints the employee using method from super class
	}
	
	//prints what the nurse does
	public void giveVaccine() {
		System.out.println("\nThe nurse gave you a vaccine.");
	}
}
