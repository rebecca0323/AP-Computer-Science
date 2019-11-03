//Made by Rebecca Zhu on 10/18/19
//purpose is a class in the programming projects for chapter 5

package chapter5;

//import NumberFormat class to format answer to specific # of decimals
import java.text.NumberFormat;

public class Account implements Lockable{
	//private variables that can only be accessed directly in this class
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private final double RATE = 0.035; //can't be modified because it's a double
	
	private int acctNumber; //represents the acctNum for the bank account
	private double balance; //represents the balance for the bank account
	private String name; //represents name of owner for the bank account
	private int key;
	private boolean locked;
	
	//set up the account by defining owner, account number and initial balance
	public Account(String owner, int account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
		locked = false;
	}
	
	//sets up account that makes the initial balance as 0, overloaded constructor
	public Account(String owner, int account) {
		name = owner;
		acctNumber = account;
		balance = 0.00;
		locked = false;
	}
	
	//validates the transaction, then deposits the specified amount into account and returns the new balance
	@SuppressWarnings("null")
	public double deposit (double amount) {
		if(locked == false) {
			if(amount < 0) { //deposit value is negative
				System.out.println("\nError: Deposit amount is invalid.\n" + acctNumber + " " + fmt.format(amount));
			}
			else
				balance += amount; //increments balance by the deposited amount
			return balance;
		}
		else
			return (Double) null;
	}
	
	//validates the transaction, then withdraws the specified amount from account. returns new balance
	@SuppressWarnings("null")
	public double withdraw (double amount, double fee) {
		if(locked == false) {
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
		else
			return (Double) null;
	}
	
	//adds interest to the account and returns the new balance
	@SuppressWarnings("null")
	public double addInterest() {
		if(locked == false) {
			balance += (balance * RATE);
			return balance;
		}
		else
			return (Double) null;
	}
	
	//returns the current balance of the account
	@SuppressWarnings("null")
	public double getBalance() {
		if(locked == false)
			return balance;
		else
			return (Double) null;
	}
	
	//returns the account number
	@SuppressWarnings("null")
	public int getAccountNumber() {
		if(locked == false)
			return acctNumber;
		else
			return (Integer) null;
	}
	
	//returns a one-line description of the account as a string
	public String toString() {
		if(locked == false) {
			return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
		}
		else
			return "";
	}
	
	//transfer money from one account to another account by passing in the account the money is going to and the amount
	@SuppressWarnings("null")
	public double transfer(double d, Account a) {
		if(locked == false) {
			withdraw(d, 0.0); //withdraws d amount from the first account
			a.deposit(d); //deposits it into the second account
			return balance;
		}
		else
			return (Double) null;
	}

	// uses the setKey method from the lockable interface and sets the account's key as the parameter
	@Override
	public void setKey(int key) {
		this.key = key;
	}
	
	//uses the lock method from the lockable interface and locks the account if the entered key is correct
	@Override
	public void lock(int key) {
		if(key == this.key)
			locked = true;
		else
			locked = false;
	}
	
	//uses the unlock method from the lockable interface and unlocks the account if the entered key is correct
	@Override
	public void unlock(int key) {
		if(key == this.key)
			locked = false;
		else
			locked = true;
	}

	//uses the locked method from the lockable interface and returns if the account is locked
	@Override
	public boolean locked() {
		return locked;
	}
}