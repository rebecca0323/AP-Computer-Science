//made by Rebecca Zhu 11/20
//purpose is to make the child classes for reading materials

package lab;

public class Book extends Reading{ //inheritance from the reading class
	//instance variables for book
	private int chapters;
	private String[] chapternames = new String[3];
	
	public Book(int p, String a, String t, int c) {
		super(p, a, t); //passes some parameters into the Reading class's constructor
		chapters = c; //sets chapter using the parameter
		chapternames[0] = "The beginning"; //defines each chapter
		chapternames[1] = "The middle";
		chapternames[2] = "The end";
		
		printBook(); //calls the print method for the book object
	}
	
	//method that prints the object
	public void printBook() {
		this.printReading(); //calls the printReading method from the parent class
		System.out.println("# of chapters: " + chapters);
		for(int i = 0; i < chapternames.length; i++) { //for loop that prints each section/chapter from the array
			System.out.println("Chapter " + (i+1) + " title: " + chapternames[i]);
		}
	}
	
}
