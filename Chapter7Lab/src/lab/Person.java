//Made by Rebecca Zhu 11/20
//purpose as the parent class for the characteristics of a population

package lab;

public class Person {
	//instance variable that every person has
	private String name;
	
	//constructor that sets the name to the parameter
	public Person(String n) {
		name = n;
	}
	
	//prints the person's name
	public void printPerson() {
		System.out.println("\nName: " + name);
	}
}
