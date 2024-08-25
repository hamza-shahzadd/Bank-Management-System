package bank;

import java.util.Scanner;
import java.util.Random;
import java.io.*; 
import java.util.*; 
import java.time.LocalDate;

public class savingAccount extends account
{
	private float zakat;
	private int savingNo;
	private int interest;



	void cashWithdrawl(int val)
	{
		if(val > balance)
		{
			System.out.println("You have insufficient balance to proceed this transaction");
		}
		else
		{
			balance = balance - val;

			printStatement();

			System.out.println("Cash Withdrawn : " + val);
			System.out.println("Your balance is : " + balance);

		}
	}

	void makeDeposit(int val)
	{
		balance= balance + val; 

		printStatement();

		System.out.println("Cash deposited : " + val);
		System.out.println("Your balance is : " + balance);
	}


	void calculateZakat()/// annually?
	{
		if(balance >= 20000)
		{
			zakat=(balance * 25)/1000;
			System.out.print("Your zakat is = ");
			System.out.println(zakat);
		}
		else
		{
			System.out.print("Your'e exempted from zakat");			
		}

	}

	void DisplayAllDeductions()
	{
		System.out.print("Zakat deduction = ");
		System.out.println(zakat);

	}
	float calculate_interest() 
	{
		float interest_rate = (interest * balance)/100; 
		return interest_rate;
	}

	public float getZakat() {
		return zakat;
	}

	public void setZakat(float zakat) {
		this.zakat = zakat;
	}

	public int getSavingNo() {
		return savingNo;
	}

	public void setSavingNo(int savingNo) {
		this.savingNo = savingNo;
	}

}
