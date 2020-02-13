//Made by Rebecca Zhu 1/16
//purpose is to find a palindrome

package lab;

public class PalindromeDetect {

	//takes in string and returns a boolean determining whether it is a palindrome
	//used string because charAt can be used rather than dividing by powers of 10s
	public static boolean palindrome(String str) {
		int left, right; //placement indicators
		left = 0; //first digit
	    right = str.length() - 1; //last digit
	    if(str.charAt(left) == str.charAt(right)) //if the placements are equal
	    {
	    	String substr = "";
	    	if(str.length() > 2) {
	    		substr = str.substring(1, str.length()-1); //makes a substring that doesn't have to previous 2 edge digits
	    		palindrome(substr); //recursion, tests to see if it's a palindrome again
	    	}
	    	//when 1 or 0 digits left, then the method has reached the base case and returns true, so the number is a palindrome
		    return true;
	    }
	    return false;
	}
	
}
