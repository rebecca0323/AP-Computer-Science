//made by rebecca Zhu 11/20
//purpose is for a subclass of Employee

package lab;

public class Janitor extends Employee{ //inheritance from superclass of Employee

	//constructor for base class
	public Janitor(String c, String n, int y, int s) {
		super(c, n, y, s); //passes the parameters into the base class (Employee)'s constructor
		clean(); //calls method for the janitor
		super.printEmployee(); //prints the employee using method from super class
	}
	
	//prints what the janitor does
	public void clean() {
		System.out.println("\nThis person makes sure the hospital is clean");
	}

}
