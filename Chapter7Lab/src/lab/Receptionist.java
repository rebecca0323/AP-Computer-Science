//made by rebecca Zhu 11/20
//purpose is for a subclass of Employee

package lab;

public class Receptionist extends Employee{ //inheritance from superclass of Employee

	//constructor for base class
	public Receptionist(String c, String n, int y, int s) {
		super(c, n, y, s); //passes the parameters into the base class (Employee)'s constructor
		recept(); //calls the method for receptionist
		super.printEmployee(); //prints the employee using method from super class
	}
	
	//prints what the receptionist does
	public void recept() {
		System.out.println("\nThis person answers the phone.");
	}

}
