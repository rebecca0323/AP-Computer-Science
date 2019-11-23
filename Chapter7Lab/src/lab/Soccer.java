//Made by Rebecca Zhu 11/20
//purpose is as subclass of parent class sport

package lab;

public class Soccer extends Sport{
	//instance variables that are specific to the soccer class
	private String homefield;
	private int averageNumOfPasses;
	private int shotsOnNet;
	private int goalsScored;
	private double scoringRat;
	private boolean playoffs;
	private static String[] s = new String[] {"Angie", "Ahana", "Liz"};
	
	//constructor for the soccer class
	public Soccer(String n, String r, int a, int b, int c, int d) {
		super(n, r, s, a); //passes parameters to make the sport object from parent class
		homefield = "Stellos Stadium"; //sets instance variables to the parameters given
		averageNumOfPasses = b;
		shotsOnNet = c;
		goalsScored = d;
		scoringRat = (double) goalsScored / shotsOnNet;
		playoffs = true;
		
		printSoccer(); //prints the specific sport
	}

	//method that prints the sport
	public void printSoccer() {
		this.printSport(); //calls method from base class
		System.out.println("Home stadium: " + homefield); //prints the instance variables of the specific sport
		System.out.println("Average number of passes per game: " + averageNumOfPasses);
		System.out.println("Shots On Net: " + shotsOnNet);
		System.out.println("Goals Scored: " + goalsScored);
		System.out.println("Scoring ratio: " + scoringRat);
		System.out.println("Playoff Status: " + playoffs());
	}
	
	//method that returns text corresponding to whether they are in playoffs or not
	public String playoffs() {
		if(playoffs == true) {
			return "They are through to the playoffs";
		}
		else
			return "Not this season... Maybe next year!";
	}
}
