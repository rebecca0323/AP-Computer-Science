//Made By Rebecca Zhu 1/16
//recursion sorting using the middle value as the pivot

package lab;

public class RecursiveSorts
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using quick sort.
   //-----------------------------------------------------------------
   public static void quickSort (double[] numbers)
   {
      doQuickSort(numbers, 0, numbers.length - 1);
      
      for(int i = 0; i < numbers.length; i++) {
		  System.out.print(numbers[i] + " ");
	  }
	  System.out.println();
      
   }

   //-----------------------------------------------------------------
   //  Recursively sorts the portion of the given array beginning
   //  at start and ending at end.
   //-----------------------------------------------------------------
   private static void doQuickSort (double[] numbers, int start, int end)
   {
      if (start < end)
      {
         int middle = partition(numbers, start, end);
         doQuickSort(numbers, start, middle);
         doQuickSort(numbers, middle + 1, end);
       }
   }

   //-----------------------------------------------------------------
   //  Partitions the array such that each value in [start, middle]
   //  is less than or equal to each value in [middle + 1, end].
   //  The index middle is determined in the procedure and returned.
   //-----------------------------------------------------------------
   private static int partition (double[] numbers, int start, int end)
   {
      double pivot = numbers[(int) (start + end)/2]; //uses the middle index
      int i = start - 1;
      int j = end + 1;

      //  As the loop progresses, the indices i and j move towards each other.
      //  Elements at i and j that are on the wrong side of the partition are
      //  exchanged. When i and j pass each other, the loop ends and j is
      //  returned as the index at which the elements are partitioned around.
      while (true)
      {
         i = i + 1;
         while (numbers[i] < pivot)
            i = i + 1;

         j = j - 1;
         while (numbers[j] > pivot)
            j = j - 1;

         if (i < j)
         {
            double tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
         }
         else return j;
      }
   }
}
