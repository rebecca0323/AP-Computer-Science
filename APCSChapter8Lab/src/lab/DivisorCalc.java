//Made by Rebecca Zhu 1/16
//finds the gcd of two numbers using recursion

package lab;

public class DivisorCalc {
	
	public static int gcd(int num1, int num2) {
		int result = 1; //place holder
		if(num2 <= num1 && num1%num2 == 0) {
			result = num2; //can't have gcd greater than one of the inputs, so this is the base case
		}
		else if(num1 < num2) {
			result = gcd(num2, num1); //swap the order to have it consistent
		}
		else {
			result = gcd(num2, (num1%num2)); //recursion
		}
		
		
		return result;
		
	}
}
