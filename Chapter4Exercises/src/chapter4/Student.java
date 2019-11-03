//made by Rebecca Zhu on 10/5/19 
//purpose is for a class for exercise 4.8

package chapter4;

public class Student {
	//variables for the student objects
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int test1, test2, test3;
	private double average;
	
	//sets up student object with the specified initial values
	public Student(String first, String last, Address home, Address school, int t1, int t2, int t3) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	
	//sets up student object with the specified initial values except no test scores so the test scores are automatically set to 0
	public Student(String first, String last, Address home, Address school) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	
	//sets the different test scores
	public void setTestScore(int a, int b) {
		if(a == 1)
			test1 = b;
		else if(a == 2)
			test2 = b;
		else if(a == 3)
			test3 = b;
		else
			System.out.println("Invalid input");
	}
	
	//returns the test scores according to what the parameter is
	public int getTestScore(int a) {
		if(a == 1)
			return test1;
		else if(a == 2)
			return test2;
		else if(a == 3)
			return test3;
		else
			return 0;
	}
	
	//computes the average of the test scores and returns the value
	public double average() {
		average = (test1 + test2 + test3) / 3.0;
		return average;
	}
	
	//returns the Student object as a string
	public String toString() {
		String result;
		result = "\n" + firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress;
		result += "Past 3 test scores: " + test1 + ", " + test2 + ", " + test3 + "\n";
		result += "The average of your three tests: " + average;
		return result;
	}

}
