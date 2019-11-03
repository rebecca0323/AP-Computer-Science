//Made by Rebecca Zhu on 10/04/19
//purpose is a class in the programming projects for chapter 4

package chapter4;

//import NumberFormat class to format answer to specific # of decimals
import java.text.NumberFormat;

public class Account {
	//private variables that can only be accessed directly in this class
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private final double RATE = 0.035; //can't be modified because it's a double
	
	private int acctNumber; //represents the acctNum for the bank account
	private double balance; //represents the balance for the bank account
	private String name; //represents name of owner for the bank account
	
	//set up the account by defining owner, account number and initial balance
	public Account(String owner, int account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	//sets up account that makes the initial balance as 0, overloaded constructor
	public Account(String owner, int account) {
		name = owner;
		acctNumber = account;
		balance = 0.00;
	}
	
	//validates the transaction, then deposits the specified amount into account and returns the new balance
	public double deposit (double amount) {
		if(amount < 0) { //deposit value is negative
			System.out.println("\nError: Deposit amount is invalid.\n" + acctNumber + " " + fmt.format(amount));
		}
		else
			balance += amount; //increments balance by the deposited amount
		return balance;
	}
	
	//validates the transaction, then withdraws the specified amount from account. returns new balance
	public double withdraw (double amount, double fee) {
		amount += fee; //if fee involved, adds it to count so it can be subtracted from the balance as well
		if(amount < 0) { //if amount trying to withdraw is negative
			System.out.println("\nError: Withdraw amount is invalid.\nAccount: " + acctNumber + "\nRequested: " + fmt.format(amount));
		}
		else {
			if (amount > balance) { //if you're trying to withdraw more than you have in your bank account
				System.out.println("\nError: Insufficient funds.\nAccount: " + acctNumber + "\nRequested: " + fmt.format(amount) + "\nAvailable: " + fmt.format(balance));
			}
			else
				balance -= amount;
		}
		return balance;
	}
	
	//adds interest to the account and returns the new balance
	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}
	
	//returns the current balance of the account
	public double getBalance() {
		return balance;
	}
	
	//returns the account number
	public int getAccountNumber() {
		return acctNumber;
	}
	
	//returns a one-line description of the account as a string
	public String toString() {
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}
	
	//transfer money from one account to another account by passing in the account the money is going to and the amount
	public double transfer(double d, Account a) {
		withdraw(d, 0.0); //withdraws d amount from the first account
		a.deposit(d); //deposits it into the second account
		return balance;
	}
}