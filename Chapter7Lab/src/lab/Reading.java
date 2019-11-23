//made by rebecca zhu 11/20
//purpose is for the superclass for the reading materials

package lab;

public class Reading {
	//instance variables that all reading materials have
	private int pages;
	private String author;
	private String title;
	
	//constructor that sets the values as the parameters
	public Reading(int p, String a, String t) {
		pages = p;
		author = a;
		title = t;
	}
	
	//prints the reading materials
	public void printReading() {
		System.out.println("\n\"" + title + "\" by " + author + " (# of pages: " + pages + ")");
	}
}
