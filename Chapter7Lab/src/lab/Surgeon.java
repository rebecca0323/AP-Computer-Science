//made by rebecca Zhu 11/20
//purpose is for a subclass of Employee

package lab;

public class Surgeon extends Employee{ //inheritance from superclass of Employee
	
	//constructor for base class
	public Surgeon(String c, String n, int y, int s) {
		super(c, n, y, s); //passes the parameters into the base class (Employee)'s constructor
		performSurgery(); //calls the method for surgeon
		super.printEmployee(); //prints the employee using method from super class
	}
	
	//prints what the surgeon has done
	public void performSurgery() {
		System.out.println("\nLeg surgery completed.");
	}

}
