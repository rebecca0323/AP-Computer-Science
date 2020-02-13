//Made by Rebecca Zhu 12/18
//driver for chapter 9 lab

package lab;

import java.util.LinkedList;
import java.util.Queue;

public class Driver {
	public static void main(String[] args) {
		exerciseOne();
		exerciseFour();
		exerciseFive();
	}
	
	//exercise 1 for CD object linked list
	public static void exerciseOne() {
		System.out.println("Exercise One:\n");
		
		//instantiates CDList object
		CDList CDCollection = new CDList();
		
		//adds the CD to the CDList
		CDCollection.add(new CD("We Love You Tecca", "Lil Tecca", 19.99, 5));
		CDCollection.add(new CD("Sweetener", "Ariana Grande", 34.99, 11));
		CDCollection.add(new CD("Hollywood's Bleeding", "Post Malone", 24.99, 7));
		CDCollection.add(new CD("TrapStar Turnt PopStar", "PnB Rock", 15.99, 4));
		
		//prints the CDList object
		System.out.println(CDCollection);
	}
	
	//exercise 4 deals with the insertion sort
	public static void exerciseFour() {
		System.out.println("Exercise Four:\n");
		
		//instantiates a new Integer List Object
		IntegerList rack = new IntegerList();
	
		//adds the CD's to the rack but not alphabetically arranged
		rack.add(new CD("We Love You Tecca", "Lil Tecca", 19.99, 5));
		rack.add(new CD("Sweetener", "Ariana Grande", 34.99, 11));
		rack.add(new CD("Hollywood's Bleeding", "Post Malone", 24.99, 7));
		rack.add(new CD("TrapStar Turnt PopStar", "PnB Rock", 15.99, 4));
		rack.add(new CD("Finessing", "Neil", 125, 4));
		
		//prints the rack
		System.out.println(rack);
	}
	
	//exercise 5 deals with a queue of customers
	public static void exerciseFive() {
		System.out.println("Exercise Five:\n");
		Queue<Customer> ticketBooth = new LinkedList<Customer>(); //instantiates a queue of customer objects
		
		//adds the customers that are in the line, so that akshay will be removed first
		ticketBooth.add(new Customer("Rebecca"));
		ticketBooth.add(new Customer("Neil"));
		ticketBooth.add(new Customer("Akshay"));
		
		//size of the queue
		System.out.println("There are " + ticketBooth.size() + " people in line.");
		//random # of minutes passed to make the first customer leave
		int randomInt = (int) (Math.random()*10)+1;
		//uses remove method
		System.out.println("After " + randomInt + " minutes, " + ticketBooth.remove() + " finished bying the tickets and left the line");
		//updated size
		System.out.println("There are " + ticketBooth.size() + " people in line.");
		randomInt = (int) (Math.random()*10)+1;
		System.out.println("After " + randomInt + " minutes, " + ticketBooth.remove() + " finished bying the tickets and left the line");
		//adding someone to the queue
		ticketBooth.add(new Customer("Brandon"));
		System.out.println("Another customer has joined the line");
		System.out.println("There are " + ticketBooth.size() + " people in line.");
		randomInt = (int) (Math.random()*10)+1;
		System.out.println("After " + randomInt + " minutes, " + ticketBooth.remove() + " finished bying the tickets and left the line");
		randomInt = (int) (Math.random()*10)+1;
		System.out.println("After " + randomInt + " minutes, " + ticketBooth.remove() + " finished bying the tickets and left the line");
	}
}


