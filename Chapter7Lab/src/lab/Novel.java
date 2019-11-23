//made by Rebecca Zhu 11/20
//purpose is to make the child classes for reading materials

package lab;

public class Novel extends Reading{ //inheritance from the reading class
	//instance variables for novel
	private int chapters;
	private String[] chapternames = new String[5];

	public Novel(int p, String a, String t, int c) {
		super(p, a, t); //passes some parameters into the Reading class's constructor
		chapters = c;
		chapternames[0] = "The beginning"; //defines each chapter
		chapternames[1] = "Nonsweaty season";
		chapternames[2] = "Hot season";
		chapternames[3] = "FBGDs";
		chapternames[4] = "Happily ever after";
		
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
