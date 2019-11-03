//Made by Rebecca Zhu 11/1/19

package chapter6;

//********************************************************************
//CD.java       Author: Lewis/Loftus/Cocking
//
//Represents a compact disc.
//********************************************************************
import java.text.NumberFormat;

public class CD implements Comparable
{
	private String title, artist;
	private double cost;
	private int tracks;
	
	//-----------------------------------------------------------------
	//  Creates a new CD with the specified information.
	//-----------------------------------------------------------------
	public CD (String name, String singer, double price, int numTracks)
	{
	  title = name;
	  artist = singer;
	  cost = price;
	  tracks = numTracks;
	}
	//-----------------------------------------------------------------
	//  Returns a description of this CD.
	//-----------------------------------------------------------------
	public String toString()
	{
	  NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	  String description;
	
	  description = fmt.format(cost) + "\t" + tracks + "\t";
	  description += title + "\t" + artist;
	
	  return description;
	}
	
	//returns the title
	public String getTitle() {
		return title;
	}
	
	//returns the object
	public String getArtist() {
		return artist;
	}
	
	//compares the CD objects based on their title
	@Override
	public int compareTo(Object obj) {
		CD other = (CD) obj;
		int a = title.compareTo (other.getTitle()); //uses the String compareTo method 
		if(a == 0) //this means titles are equal, so it has to compare artist names
			a = artist.compareTo (other.getArtist());
		return a; //returns if object is greater or less than using an integer

	}
}
