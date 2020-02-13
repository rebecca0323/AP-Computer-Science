//Made By Rebecca Zhu 1/16
//Similar to Maze.java but is a 3d maze

package lab;

public class ThreeDMaze {
		private final int TRIED = 3;
		private final int PATH = 7;
		//my hardcoded 3d maze
		private int[][][] grid = { {{1,1,1,0,1,1,0,0,0,1,1,1,1},
               {1,0,1,1,1,0,1,1,1,1,0,0,1},
               {0,0,0,0,1,0,1,0,1,0,1,0,0},
               {1,1,1,0,1,1,1,0,1,0,1,1,1},
               {1,0,1,0,0,0,0,1,1,1,0,0,1},
               {1,1,1,1,1,1,1,1,1,1,1,1,1} }, 
				
				{{1,1,1,0,1,1,0,0,0,1,1,1,1},
                   {1,0,1,1,1,0,1,1,1,1,0,0,1},
                   {0,0,0,0,1,0,1,0,1,0,1,0,0},
                   {1,1,1,0,1,1,1,0,1,0,1,1,1},
                   {1,0,1,0,0,0,0,1,1,1,0,0,1},
                   {1,1,1,1,1,1,1,1,1,1,1,1,1} }};
		//-----------------------------------------------------------------
		   //  Tries to recursively follow the maze. Inserts special
		   //  characters for locations that have been tried and that
		   //  eventually become part of the solution.
		   //-----------------------------------------------------------------
		   public boolean traverse (int row, int column, int zaxis)
		   {
		      boolean done = false;

		      if (valid (row, column, zaxis))
		      {
		         grid[row][column][zaxis] = TRIED; // this cell has been tried

		         if (row == grid.length-1 && column == grid[0].length-1 && zaxis == grid[0][0].length-1) {
		        	 done = true; // the maze is solved
		         }
		         else
		         {
		            done = traverse (row+1, column, zaxis);     // down
		            if (!done)
		               done = traverse (row, column+1, zaxis);  // right
		            if (!done)
		               done = traverse (row-1, column, zaxis);  // up
		            if (!done)
		               done = traverse (row, column-1, zaxis);  // left
		            if (!done)
		            	done = traverse (row, column, zaxis+1); // in in z axis
		            if (!done)
		            	done = traverse (row, column, zaxis-1); //out in z axis
		         }

		         if (done) {  // this location is part of the final path
		            grid[row][column][zaxis] = PATH;
		         }
		         }

		         return done;
		   }

		   //-----------------------------------------------------------------
		   //  Determines if a specific location is valid.
		   //-----------------------------------------------------------------
		   private boolean valid (int row, int column, int zaxis)
		   {
		      boolean result = false;

		      //  check if cell is in the bounds of the matrix
		      if (row >= 0 && row < grid.length &&
		          column >= 0 && column < grid[row].length && zaxis >= 0 && zaxis < grid[row][column].length)

		         //  check if cell is not blocked and not previously tried
		         if (grid[row][column][zaxis] == 1)
		            result = true;

		      return result;
		   }

		   //-----------------------------------------------------------------
		   //  Returns the maze as a string.
		   //-----------------------------------------------------------------
		   public String toString ()
		   {
		      String result = "\n";

		      for (int row=0; row < grid.length; row++)
		      {
		         for (int column=0; column < grid[row].length; column++) {
		        	 for(int z = 0; z < grid[row][column].length; z++) {
		        		 result += grid[row][column][z] + "";
		        	 }
		        	 result += "\n";
		         }
		         result += "\n";
		      }

		      return result;
		   }
}
