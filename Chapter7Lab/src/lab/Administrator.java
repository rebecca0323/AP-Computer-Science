//made by rebecca Zhu 11/20
//purpose is for a subclass of Employee

package lab;

public class Administrator extends Employee{ //inheritance from superclass of Employee

	//constructor for base class
	public Administrator(String c, String n, int y, int s) {
		super(c, n, y, s); //passes the parameters into the base class (Employee)'s constructor
		admin(); //calls the function for the administrator
		super.printEmployee(); //prints the employee using method from super class
	}
	
	//method that describes what admin does
	public void admin() {
		System.out.println("\nShe ensures the hospital is working properly.");
	}

}
