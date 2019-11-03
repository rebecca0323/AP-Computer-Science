//Made by Rebecca Zhu 11/1/19

package chapter6;

//********************************************************************
//CDCollection.java       Author: Lewis/Loftus/Cocking
//
//Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.Arrays;

public class CDCollection
{
	private CD[] collection;
	private int count;
	private double totalCost;
	
	//-----------------------------------------------------------------
	//  Creates an initially empty collection.
	//-----------------------------------------------------------------
	public CDCollection ()
	{
	  collection = new CD[100];
	  count = 0;
	  totalCost = 0.0;
	}
	
	//-----------------------------------------------------------------
	//  Adds a CD to the collection, increasing the size of the
	//  collection if necessary.
	//-----------------------------------------------------------------
	public void addCD (String title, String artist, double cost,
	                  int tracks)
	
	{
	  if (count == collection.length)
	     increaseSize();
	
	  collection[count] = new CD (title, artist, cost, tracks);
	  totalCost += cost;
	  count++;
	}
	//-----------------------------------------------------------------
	//  Returns a report describing the CD collection.
	//-----------------------------------------------------------------
	public String toString()
	{
		sortArray();
	  NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	  String report = "******************************************\n";
	  report += "My CD Collection\n\n";
	
	  report += "Number of CDs: " + count + "\n";
	  report += "Total cost: " + fmt.format(totalCost) + "\n";
	  report += "Average cost: " + fmt.format(totalCost/count);
	
	  report += "\n\nCD List:\n\n";
	
	
	  for (int cd = 0; cd < count; cd++)
	     report += collection[cd].toString() + "\n";
	
	  return report;
	}
	//-----------------------------------------------------------------
	//  Doubles the size of the collection by creating a larger array
	//  and copying the existing collection into it.
	//-----------------------------------------------------------------
	private void increaseSize ()
	{
	  CD[] temp = new CD[collection.length * 2];
	
	  for (int cd = 0; cd < collection.length; cd++)
	     temp[cd] = collection[cd];
	
	  collection = temp;
	}
	
	//sorts the array
	private void sortArray() {
		int count = 0; //counts how many indexes are needed for new array because the current array has null values
		for(int i = 0; i < collection.length;i++) { //loops through the cd collection and checks how many cds are in the array
			if(collection[i] != null) 
				count++;
		}
		CD[] nonulls = Arrays.copyOf(collection, count); //makes a new array with the same cd objects but without any null placeholders
		Comparable[] cdtocompare = (Comparable[]) nonulls; //casts into comparable array
		Sorts.insertionSort(nonulls); //sorts the comparable array
		collection = (CD[]) cdtocompare; //casts the sorted comparable array back to the collection array to be printed
	}
}
