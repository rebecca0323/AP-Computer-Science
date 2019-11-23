//made by Rebecca Zhu 11/20
//purpose is to make the child classes for reading materials

package lab;

public class Textbook extends Reading { //inheritance from the reading class
	//instance variables for the textbooks
	private String subject;
	
	public Textbook(int p, String a, String t, String s) {
		super(p, a, t); //passes some parameters into the Reading class's constructor
		subject = s;
		
		printTextbook(); //calls the print method for the textbook object
	}

	//method that prints the object
	public void printTextbook() {
		this.printReading(); //calls the printReading method from the parent class
		System.out.println("Subject of the textbook: " + subject);
	}
}
