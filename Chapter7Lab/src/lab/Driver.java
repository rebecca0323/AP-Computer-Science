//Made by Rebecca Zhu 11/20/19
//Driver for the chapter 7 lab

package lab;

public class Driver {
	//calls all the methods for the exercises
	public static void main(String[] args) {
		exerciseOne();
		exerciseTwo();
		exerciseThree();
		exerciseFour();
		exerciseFive();
	}
	
	//exercise 1 is about inheritance from the coin class
	public static void exerciseOne() {
		System.out.println("Exercise One:");
		MonetaryCoin penny = new MonetaryCoin(0.01); //instantiates a money coin object which instantiates a coin object
		System.out.println(penny);
		MonetaryCoin nickel = new MonetaryCoin(0.05);
		MonetaryCoin dime = new MonetaryCoin(0.10);
		System.out.println("sum of the values = " + (penny.getValue() + nickel.getValue() + dime.getValue())); //uses getters to return value of the coins
	}
	
	//exercise 2 is about inheritance with an employee and the child classes as different types of employees
	public static void exerciseTwo() {
		System.out.println("\nExercise Two:");
		Nurse n = new Nurse("nurse", "Neil", 2, 10000); //nurse object, parameters allow the employee object to be instantiated
		Surgeon s = new Surgeon("surgeon", "Rebecca", 3, 200000); //surgeon object
		Doctor d = new Doctor("doctor", "Jason", 4, 100000); //doctor object
		Administrator a = new Administrator("administrator", "Anna", 4, 120000); //administrator object
		Receptionist r = new Receptionist("receptionist", "Liz", 3, 80000); //receptionist object
		Janitor j = new Janitor("janitor", "Bob", 2, 60000); //janitor object
	}
	
	//exercise 3 deals with derived classes from the superclass of reading materials
	public static void exerciseThree() {
		System.out.println("\nExercise Three:");
		Book myBook = new Book(50, "Rebecca Zhu", "Biography", 3); //book object, first 3 are parameters to make the reading object
		Novel myNovel = new Novel(300, "Rebecca Zhu", "Life as REBECCA", 5); //instantiates novel object
		Magazine myMag = new Magazine(60, "Anna Mathew", "Wallstreet Journal", 7); //instantiates magazine object
		TechnicalJournal rucha = new TechnicalJournal(20, "Rucha Dave", "Epilepsy"); //instantiates technical journal object
		Textbook neil = new Textbook(1000, "Neil Kachappilly", "How to be SWEATY", "finesser"); //instantiates textbook object
	}
	
	//exercise 4 deals with derived classes from a sport superclass
	public static void exerciseFour() {
		System.out.println("\nExercise Four:");
		Soccer South = new Soccer("NHSS Girls Soccer", "10-1-2", 3, 50, 20, 3); //first 3 are parameters for the sport class and the other parameters are for the soccer class
		Basketball bball = new Basketball("Nashua Recreational Basketball Team", "5-2-4", 60, 5, 4); //instantiates a basketball object
		Football f = new Football("Powderpuff", "0-1", 21, 3, 3, 2, 1, 50, 35); //instantiates a football object
	}
	
	//exercise 5 deals with derived classes from a person superclass
	public static void exerciseFive() {
		System.out.println("\nExercise Five:");
		Age rebecca = new Age("Rebecca", 16); //first parameter is passed in the super constructor to make the person object, while the other parameter is for the age object
		Nationality erika = new Nationality("Erika", "Japanese"); //instantiates a nationality object
		Occupation jason = new Occupation("Jason", "doctor"); //instantiates occupation object
		Income bob = new Income("Bob", 70000); //instantiates income object
	}
}
