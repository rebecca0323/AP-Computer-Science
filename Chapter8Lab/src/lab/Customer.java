//Made by Rebecca Zhu 12/19/19
//customer objects for exercise 5

package lab;

public class Customer {
	private String name; //instance variable that represents the person's name
	
	//constructor for the customer object
	public Customer(String name) {
		this.name = name;
	}
	
	//returns the name
	public String toString() {
		return name;
	}
}
