package bank;

import java.util.Scanner;

import java.util.Random;
import java.io.*; 
import java.util.*; 
import java.time.LocalDate;

public class Customer 
{

	public String name;
	public String address;
	public String phoneNumber;
	public int number;
	public account account;
	public checkingAccount checking;
	public savingAccount saving;
	public checkingAccount getChecking() 
	{
	return checking;
	}

	public void setChecking(checkingAccount checking) {
		this.checking = checking;
	}

	public savingAccount getSaving() {
		return saving;
	}

	public void setSaving(savingAccount saving) {
		this.saving = saving;
	}



	/// parameterized constructor

	Customer()
	{
		name="";
		address= "";
		phoneNumber="";

	}

	Customer(String name, String address, String phoneNumber, int number )
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.number = number;
	}

	///// getters
	String getName()
	{
		return name;
	}

	String getAddress()
	{
		return address;
	}

	String getPhoneNumber()
	{
		return phoneNumber;
	}

	int getNumber()
	{
		return number;
	}
	////   setters
	void setName(String name)
	{
		this.name = name;
	}

	void setAddress(String address)
	{
		this.address = address;
	}

	void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	// 

	void printDetails()
	{
		System.out.println("Customer details:");
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Phone Number : "+ phoneNumber);
		System.out.println("Your account number is : " + number);

	}

	public account getAccount() {
		return account;
	}

	public void setAccount(account account) {
		this.account = account;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	
}
