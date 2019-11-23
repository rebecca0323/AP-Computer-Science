//made by rebecca Zhu 11/20
//purpose is for a subclass of Employee

package lab;

public class Doctor extends Employee{ //inheritance from superclass of Employee

	//constructor for base class
	public Doctor(String c, String n, int y, int s) {
		super(c, n, y, s); //passes the parameters into the base class (Employee)'s constructor
		diagnose(); //calls method for doctor
		super.printEmployee(); //prints the employee using method from super class
	}
	
	//prints what the doctor does
	public void diagnose() {
		System.out.println("\nThe doctor says you are not sick.");
	}

}
