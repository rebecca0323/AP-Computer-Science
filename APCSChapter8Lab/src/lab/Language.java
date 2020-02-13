//Made by Rebecca Zhu 1/16
//purpose is to make a new language based off of blurbs, whoozits, and whatzits

package lab;

public class Language {
	private String blurb;
	private String whoozit;
	private String whatzit;
	private int rounds; //tracker for the testBlurb methhod
	private int randomInt;
	
	public Language() {
		blurb = "";
		whoozit = "x y";
		whatzit = "q z/d whoozit";
		rounds = 0;
		randomInt = (int) (3*Math.random()+1); //limit on the number of whatzits or else terminal will crash from infinity loop	
	}
	
	//method for programming project 7
	public void runExerSeven() {
		System.out.println(randBlurb(blurb));
	}
	
	//returns the blurb, which is a whoozit followed by 1 or more whatzits
	public String randBlurb(String b) {
		b = b + addWhoozit() + addWhatzits(""); //calls the whoozit and whatzits methods
		
		return b;
	}
	
	//Whoozit is dead end, so no recursion
	//Whoozit consists of x followed by any number of y's
	public String addWhoozit() {
		String result = "x";
		int random = (int) (3*Math.random()); //randomly chooses the amount of y's
		
		for(int i = 0; i < random; i++) {
			result += "y"; //concatenates the string
		}
		
		return result;
		
	}
	
	//Whatzit is a q followed by a z or d followed by a whoozit
	public String addWhatzits(String b) {
		String result = b + "q";
		
		if(rounds < randomInt) { // if the method should add more whatzits or stop
			int r1 = (int) (2*Math.random()); //randomly chooses to add z or d
			if(r1 == 0) {
				result += "z";
			}
			else {
				result +="d";
			}
			
			result += addWhoozit(); //adds the whoozit
			
			rounds++; //increments rounds
			addWhatzits(result); //calls itself again so that another whatzit can be added to form a blurb
		}
		
		return result;
	}
	
	//for exercise 8, tests if string is a valid blurb
	public void testBlurb(String b) {
		String newBlurb = testWhoo(b); //tests for a whoozit in the beginning of the string
		testWha(newBlurb); //tests for one or more whatzits in the string, this is the recursive method
	}
	
	//tests for a whoozit
	public String testWhoo(String b) {
		int whooz = 0; //counter for the index
		String w = "";
		if(b == null || b.length() == 0) { //no string
			return "";
		}
		else if(b.charAt(0) == 'x') { //checks if first letter is an x
			whooz++; //increments the index
			while(b.length() > whooz && b.charAt(whooz) == 'y') { //loops through to see if next letters are y's and tracks how many there are
					if(b.length() <= whooz) {
						whooz++;
						//makes a substring so that it gets rid of the whoozit and allows the string to be returned to be tested in the whatzit method
						w = b.substring(whooz);
						int length = w.length();
						if(length == 0 && rounds == 0) { //no whatzit after the first whoozit
							return "bad";
						}
						rounds++;
						if(length == 0) { //this means the string ends on a whoozit, so it is valid
							w = "good"; //the returned strings will be parsed in the whazit method
						}
						return w; //returns the string
					}
				whooz++; //increments it so that it can test the next index
			}
		}
		else { //not a whoozit in the beginning of string
			return "bad"; 
		}
		
		//will run after the else if statement finishes
		w = b.substring(whooz); //makes a substring to be tested in the whatzit method
		int length = w.length();
		if(length == 0 && rounds == 0) { //no whatzit after the first whoozit
			return "bad";
		}
		rounds++;
		if(length == 0) { //end of string so it's valid
			w = "good";
		}
		return w;
	}
	
	//tests if string contains a whatzit in the beginning
	public void testWha(String b) {
		String w = "";
		int wha = 0; //counter
		if(b.length() == 0) { //empty string is passed in from the whoozit method, so the string must've ended in a whoozit and is valid
			System.out.println("Valid");
		}
		else if(b.equals("good")) { //parsing the string that is returned from the whoozit method
			System.out.println("valid");
		}
		else if(b.equals("bad")) { //whoozit returned "bad"
			System.out.println("invalid");
		}
		//whoozit returned string that must be checked for a whatzit
		else if(b.charAt(0) == 'q') { //first letter is q
			wha++;
			if(b.charAt(wha) == 'z' || b.charAt(wha) == 'd') { //second character is either z or d
				wha++;
				b = b.substring(wha); //makes a substring that gets rid of first part
				if(b.length() == 0) {
					System.out.println("invalid"); //ends without the whoozit
				}
				if(b.length() > 0) { //more to the substring
					b = testWhoo(b); //must get rid of the whoozit following it if it is valid
				}
				if(b.length() > 0) {
					testWha(b); //indirect recursion to keep truncating whatzits and whoozits until the string is empty
				}
			}
		}
		else { //not a whatzit in the beginning of string
			System.out.println("Invalid");
		}
	}
}
