//Made by Rebecca Zhu 11/1/19

package chapter6;

public class Sorts {
	//********************************************************************
	//Sorts.java       Author: Lewis/Loftus/Cocking
	//
	//Demonstrates the selection sort and insertion sort algorithms,
	//as well as a generic object sort.
	//********************************************************************
	//-----------------------------------------------------------------
	// Sorts the specified array of integers using the selection
	// sort algorithm.
	//-----------------------------------------------------------------
	public static void selectionSort (int[] numbers)
	{
	int max, temp;
	
	for (int index = 0; index < numbers.length-1; index++)
	{
	max = index;
	for (int scan = index+1; scan < numbers.length; scan++)
	if (numbers[scan] > numbers[max]) //
	max = scan;
	
	     // Swap the values
	temp = numbers[max];
	numbers[max] = numbers[index];
	numbers[index] = temp;
	}
	}
	
	//selection sort for an array for exercise 12
	public static void selectionSort (Comparable[] objects) {
		int min; //tracker so this will be written in ascending order
		Comparable temp; //comparable temporary object that allows for swapping
	
		for (int index = 0; index < objects.length-1; index++) { //loops through each index of the array
			min = index; //sets the minimum to the index which works because the array is sorted in ascending order so indexes to the left will always be less
			for (int scan = index+1; scan < objects.length; scan++) { //checks the rest of the array elements to the right of the index
				if (objects[scan].compareTo(objects[min]) < 0) //if its less than 0 then its less than the compared to object
					min = scan; //the minimum is now the lowest scanned
			}
		
			// Swap the values
			temp = objects[min];
			objects[min] = objects[index];
			objects[index] = temp;
		}
	}
	
	//-----------------------------------------------------------------
	//  Sorts the specified array of integers using the insertion
	//  sort algorithm.
	//-----------------------------------------------------------------
	public static void insertionSort (int[] numbers)
	{
	for (int index = 1; index < numbers.length; index++)
	{
	int key = numbers[index];
	int position = index;
	
	// shift larger values to the right
	while (position > 0 && numbers[position-1] < key)
	{
	numbers[position] = numbers[position-1];
	position--;
	}
	
	numbers[position] = key;
	}
	}
	
	//-----------------------------------------------------------------
	//  Sorts the specified array of objects using the insertion
	//  sort algorithm.
	//-----------------------------------------------------------------
	public static void insertionSort (Comparable[] objects)
	{
	for (int index = 1; index < objects.length; index++) //loops through the array
	{
	Comparable key = objects[index]; //makes a key for swapping
	int position = index;
	
	// shift larger values to the right
	while (position > 0 && objects[position-1].compareTo(key) > 0)
	{
	objects[position] = objects[position-1];
	position--;
	}
	
	objects[position] = key;//adds the key to a position
	}
	}
}

