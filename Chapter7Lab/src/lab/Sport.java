//made by Rebecca Zhu 11/20
//purpose is to make the parent class for all sports

package lab;

public class Sport {
	//instance variables that every sport has
	private String name;
	private String record;
	private String[] lineup = new String[3];
	private int averagePoints;
	
	//constructor that sets each instance variable as the parameters given
	public Sport(String n, String r, String[] s, int a) {
		name = n;
		record = r;
		lineup = s;
		averagePoints = a;
	}
	
	//prints the sport
	public void printSport() {
		System.out.println("\n"+ name + "'s stats:\nRecord: " + record + "\nTop 3 Players on the team: " + printPlayers() + "\nAverage points per game: " + averagePoints);
	}
	
	//returns the players in the lineup array so it can be printed
	public String printPlayers() {
		String s = "";
		for(int i = 0; i < lineup.length; i++) {
			s += (lineup[i] + " "); //concats the string to the variable s, adds a space after each one as well
		}
		return s;
	}
}
