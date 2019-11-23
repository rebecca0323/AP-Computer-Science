//made by rebecca zhu 11/20
//purpose as the base class for the derived occupations

package lab;

public class Employee {
	//instance variables that every employee has, no matter the position/occupation
	private String career;
	private String name;
	private int yearsWorked;
	private int salary;
	
	//base class constructor
	public Employee(String c, String n, int y, int s) {
		career = c;
		name = n;
		yearsWorked = y;
		salary = s;
	}
	
	//prints the employee's info
	public void printEmployee() {
		System.out.println(name + ": " + career + ", " + yearsWorked + " years worked, $" + salary);
	}
	
}
