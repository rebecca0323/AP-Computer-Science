//made by Rebecca Zhu 11/20
//purpose is to make the child classes for reading materials

package lab;

public class Magazine extends Reading { //inheritance from the reading class
	//instance variables for magazines
	private int ads;
	private String[] sections = new String[4];
	
	public Magazine(int p, String a, String t, int ad) {
		super(p, a, t); //passes some parameters into the Reading class's constructor
		ads = ad;
		sections[0] = "Economics"; //defines each section
		sections[1] = "Global News";
		sections[2] = "Celebrity News";
		sections[3] = "Science";
		
		printMagazine(); //calls the print method for the magazine object
	}

	//method that prints the object
	public void printMagazine() {
		this.printReading(); //calls the printReading method from the parent class
		System.out.println("# of advertisements: " + ads);
		for(int i = 0; i < sections.length; i++) { //for loop that prints each section/chapter from the array
			System.out.println("Section " + (i+1) + " title: " + sections[i]);
		}
	}
}
