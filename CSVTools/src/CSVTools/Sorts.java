package CSVTools;

import java.util.ArrayList;

public class Sorts {
	
	//sorts an array list
	public static void insertionSort (ArrayList<Entry> e) {
		for (int index = 1; index < e.size(); index++) { //loops through each entry in the array list
			Entry key = e.get(index); //uses a key and a temporary that allows entries to be swapped
			Entry temp;
			temp = key;
			int position = index; //sets position to index
		
			// shift larger values to the right
			while (position > 0 && e.get(position - 1).getNumber() > key.getNumber()) { //checks if number is bigger than entry number for the previous entry item
				e.set(position, e.get(position - 1)); //swaps the entries
				e.set(position - 1, temp);
				position--;
			}
			
			//redefines the key to whatever the new swapped item is
			key = e.get(position);
		}
	}
}
