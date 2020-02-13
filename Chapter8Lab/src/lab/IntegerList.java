//made by Rebecca Zhu on 12/19
//linked list of CD objects sorted by album title

package lab;

public class IntegerList {
	private ListNode list; //instance variable of a list node
	   //-----------------------------------------------------------------
	   //  Sets up an empty list of magazines.
	   //-----------------------------------------------------------------
	   public IntegerList()
	   {
	      list = null;
	   }
	   
	   //insertion sort method
	   public void add (CD i)
	   {
	      ListNode node = new ListNode (i, null); //instantiates a new node object with the cd parameter
	      ListNode current;
	      if (list == null) //first cd being added to the list
	         list = node; //list references the only object in the list
	      else
	      {
	    	  current = list; //current references the beginning of the list and acts as a tracker
	    	  CD c = (CD) current.getValue(); // casts the object from the listnode into a cd object so it can be compared
	    	  if(c.compareTo(node.getValue()) < 0) { //when the node is greater than the beginning of the list
	    		  ListNode temp = null; //trackers to find the biggest listnode in the list
	    		  ListNode next = null;
	    		  
	    		  //when the node is greater than the beginning of the list
	    		  while(c.compareTo(node.getValue()) < 0) {
	    			  if(current.getNext() != null) { //when you're not at the end of the list
	    				  current = current.getNext(); //updates current so it can keep comparing
	    			  }
	    			  temp = current; //temp becomes the new current for comparison
	    			  break; //breaks out of the loop when it's not greater than the current listnode
	    		  }
	    		  if(temp.getNext() != null) { //when its not at the end of the list then the listnodes have to be shifted down
		    		  next = temp.getNext(); //gets the next list node
		    		  node.setNext(next); //makes the next list node as the next for the node passed in as the parameter
	    		  }
	    		  temp.setNext(node); //sets the previous node's next node as the node passed in as the parameter
	    	  }
			 else { //when its not greater, just set the node to the beginning of the list and make list reference the first object, which is the new node
				 node.setNext(current);
				 list = node;
			 }
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