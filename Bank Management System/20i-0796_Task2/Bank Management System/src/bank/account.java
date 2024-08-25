package bank;

import java.util.Scanner;
import java.util.Random;
import java.io.*; 
import java.util.*; 
import java.time.LocalDate;



public class account 
{
	public float balance;
	public LocalDate dateCreated;
	public Customer customer;
	public int accNo;


	account ()
	{
		float balance = 0;

	}

	account( float balance, LocalDate dateCreated,int accNo)
	{
		this.balance = balance;
		this.dateCreated = dateCreated;
		this.accNo = accNo;

	}




	void checkBalance()
	{
		System.out.println("Your balance is : " + balance);
		System.out.println("Name = " + customer.name);

	}	



	void printStatement()
	{
		customer.printDetails();

	}



	void transferAmount(account acc, float amount) {
		if (balance >= amount) {
			System.out.println("Transferred account: ");
			acc.balance += amount;
			balance -= amount;
			System.out.println("Successfully Transferred PKR " + amount);

		}
		else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("Remaining Balance: " + balance + "\n");

	}


	void DisplayAllDeductions()
	{}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	};
}
