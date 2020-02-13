//made by rebecca zhu 12/19
//cdlist for the cd objects using a linked list

package lab;

public class CDList {
	private ListNode list;
	   //-----------------------------------------------------------------
	   //  Sets up an empty list of magazines.
	   //-----------------------------------------------------------------
	   public CDList()
	   {
	      list = null;
	   }
	   //-----------------------------------------------------------------
	   //  Creates a new MagazineNode object and adds it to the end of
	   //  the linked list.
	   //-----------------------------------------------------------------
	   public void add (CD cd)
	   {
	      ListNode node = new ListNode (cd, null);
	      ListNode current;
	      if (list == null)
	         list = node;
	      else
	      {
	         current = list;
	         while (current.getNext() != null)
	            current = current.getNext();
	         current.setNext(node);
	      }
	   }
	   //-----------------------------------------------------------------
	   //  Returns this list of magazines as a string.
	   //-----------------------------------------------------------------
	   public String toString ()
	   {
	      String result = "";
	      ListNode current = list;
	      while (current != null)
	      {
	         result += current.getValue().toString() + "\n";
	         current = current.getNext();
	      }
	      return result;
	   }
	}