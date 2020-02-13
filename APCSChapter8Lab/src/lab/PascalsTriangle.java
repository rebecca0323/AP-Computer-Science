//Made by Rebecca Zhu 1/16
//Prints out certain rows in Pascal's Triangle

package lab;

public class PascalsTriangle {
	private int numOfRows; //how many rows the output should produce
	private int counter; //counts until it reaches the numOfRows
	
	//Constructor for the PascalsTriangle objects that takes in the user's integer input
	public PascalsTriangle(int i) {
		numOfRows = i; //what the user inputs
		counter = 1;
		
		//runs the makeRows method and passes in the first row of the Pascal's triangle
		makeRows(new int[] {1});
		
	}
	
	//makes the next rows in the Pascal's Triangle
	public void makeRows(int[] prevRow) {
		int[] nThRow = new int[1]; //place holder for now
		if(counter <= numOfRows) {
			if(counter == 1) { //counter represents the current row to make
				nThRow = new int[]{1};
				System.out.println(nThRow[counter - 1]); //prints the first row
			}
			else {
				//since line 2 has 2 numbers and line 3 has 3 numbers
				// counter can be used to determine the size of the new int array
				nThRow = new int[counter]; 
				for(int i = 0; i < nThRow.length; i++) { //loops through the new int array
					if(i == 0 || i == nThRow.length-1) {
						nThRow[i] = 1; //makes the first and last number in the array as 1
						System.out.print(nThRow[i] + " "); //prints it out
					}
					else {
						//uses the previous row that's passed in as a parameter and adds the two values
						nThRow[i] = prevRow[i] + prevRow[i-1];
						System.out.print(nThRow[i] + " "); //prints it out
					}
				}
				System.out.println(); //new line for each row
			}
			counter++; //increments counter
			makeRows(nThRow); //recursive, passes the nThRow to become the next row's PrevRow
		}
		
	}
}
