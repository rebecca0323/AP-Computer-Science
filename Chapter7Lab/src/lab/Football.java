//Made by Rebecca Zhu 11/20
//purpose is as subclass of parent class sport

package lab;

public class Football extends Sport{
	//instance variables that are specific to the football class
	private static String[] s = new String[] {"Akshay", "Leny", "Asma"};
	private int fieldGoals;
	private int touchDowns;
	private int turnOvers;
	private int QBSneaks;
	private int longestThrow;
	private int longestRun;
	
	//constructor for the football class
	public Football(String n, String r, int a, int field, int touch, int turn, int qb, int longthrow, int run) {
		super(n, r, s, a); //passes parameters to make the sport object from parent class
		fieldGoals = field; //sets instance variables to the parameters given
		touchDowns = touch;
		turnOvers = turn;
		QBSneaks = qb;
		longestThrow = longthrow;
		longestRun = run;
		
		printFootball(); //prints the specific sport
	}
	
	//method that prints the sport
	public void printFootball() {
		this.printSport(); //calls method from base class
		System.out.println("# of touch downs: " + touchDowns); //prints the instance variables of the specific sport
		System.out.println("# of field goals: " + fieldGoals);
		System.out.println("# of turn overs: " + turnOvers);
		System.out.println("# of QB sneaks: " + QBSneaks);
		System.out.println("Longest throw from QB: " + longestThrow + " yards");
		System.out.println("Longest run in one down: " + longestRun + " yards");
	}

}
