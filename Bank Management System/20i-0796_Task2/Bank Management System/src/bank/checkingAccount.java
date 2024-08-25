package bank;

import java.util.Scanner;
import java.util.Random;
import java.io.*; 
import java.util.*; 
import java.time.LocalDate;

public class checkingAccount extends account
{
	private int noOfTransactions;
	private int transactionFee;

	checkingAccount()
	{
		noOfTransactions = 0;
		transactionFee = 0;
	}

	void cashWithdrawl(int val)
	{
		if(val > balance+5000)
		{
			System.out.println("You have insufficient balance to proceed this transaction");
		}
		else
		{
			balance = balance - val;

			printStatement();

			System.out.println("Cash Withdrawn : " + val);
			System.out.println("Your balance is : " + balance);



			noOfTransactions ++;
		}

		if(noOfTransactions > 2)
		{
			transactionFee += 10;
		}

	}
	void makeDeposit(int val)
	{
		balance= balance + val;

		printStatement();

		System.out.println("Cash deposited : " + val);
		System.out.println("Your balance is : " + balance);

		noOfTransactions ++;

		if(noOfTransactions > 2)
		{
			transactionFee += 10;
		}
	}
	void DisplayAllDeductions()
	{
		System.out.println("Tax deduction fee = " + transactionFee);
		System.out.println("Total number of transactions this month = " + noOfTransactions);
	}

	public int getNoOfTransactions() {
		return noOfTransactions;
	}

	public void setNoOfTransactions(int noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}

	public int getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(int transactionFee) {
		this.transactionFee = transactionFee;
	}
}
