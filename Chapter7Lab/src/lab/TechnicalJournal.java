//made by Rebecca Zhu 11/20
//purpose is to make the child classes for reading materials

package lab;

public class TechnicalJournal extends Reading{ //inheritance from the reading class
	//instance variables for the technical journals
	private String[] sections = new String[3];
	
	public TechnicalJournal(int p, String a, String t) {
		super(p, a, t); //passes some parameters into the Reading class's constructor
		sections[0] = "Background"; //defines each section
		sections[1] = "Research";
		sections[2] = "Conclusion";
		printTechnicalJournal(); //calls the print method for the technical journal object
	}

	//method that prints the object
	public void printTechnicalJournal() {
		this.printReading(); //calls the printReading method from the parent class
		for(int i = 0; i < sections.length; i++) { //for loop that prints each section/chapter
			System.out.println("Section " + (i+1) + " title: " + sections[i]);
		}
	}
}
