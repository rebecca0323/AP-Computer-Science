//Made by Rebecca Zhu 1/16
//for the nonattacking queens problem in chess

package lab;

public class Queens {
	private boolean solved;
	private int[][] grid = new int[8][8];
	
	public Queens() {
		//sets the grid to be all 0's
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				grid[i][j] = 0;
			}
		}
		
		//boolean checks if mazed is solved
		solved = traverse(0);
		
	}
	
	//checks if a spot is valid
	public boolean valid(int row, int col) { 
        int x, y; 
  
        //check if the leftmost row is valid
        for(x = 0; x < col; x++) {
            if(grid[row][x] == 1) { //there already is a queen
                return false; 
            }
        }
  
        //diagonal to the northeast
        for(x = row, y = col; x >= 0 && y >= 0; x--, y--) {
            if(grid[x][y] == 1) { //already a queen
                return false; 
            }
        }
  
        //diagonal to the southwest
        for(x = row, y = col; y >= 0 && x < 8; x++, y--) {
            if(grid[x][y] == 1) {  //already a queen
                return false; 
            }
        }
  
        return true; 
    } 
	
	//tries to place one's in available spots
	public boolean traverse(int col) { 
		//if all queens are placed
		if(col >= 8) {
			return true; 
		}

		//keep column constant and try to place a queen in any row
		for(int i = 0; i < 8; i++) { 
			//check if it's valid
			if(valid(i, col)) { //if it returns true then place queen there
				grid[i][col] = 1; 

				if (traverse(col + 1) == true) {//recursion for the rest of the chess board
					return true; 
				}
				// if no solutions then remove queen from this spot and try again
				grid[i][col] = 0; 
			} 
		} 

		//if board has no solutions
		return false; 
	} 
	   
	//returns the map as a String
	public String toString ()
	  	{
		String result = "\n";
		if(solved == true) {//board is solved
			result += "Solved it!\n"; 
			for (int row=0; row < grid.length; row++)
		      {
		         for (int column=0; column < grid[row].length; column++)
		            result += grid[row][column] + " "; //adds the value of each index of the array
		         result += "\n"; //separates every row with a new line
		      }
		}
		else { //board is unsolvable
			result = "Not valid";
		}

	      return result;
	   }
	
}
