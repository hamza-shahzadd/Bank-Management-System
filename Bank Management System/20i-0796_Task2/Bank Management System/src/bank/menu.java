package bank;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.*; 
import java.util.*; 
import java.time.LocalDate;
public class menu 
{

	public static void main(String[] args) throws FileNotFoundException 
	{

		System.out.println("Enter (1) for Database Connection\nEnter (2) for Bank Management System\n");
        Scanner sccc = new Scanner(System.in);
		int testChoice = sccc.nextInt();
        while(testChoice <1 || testChoice > 2) 
        {
            System.out.println("Incorrect Choice");
            testChoice = sccc.nextInt();
        }

        if (testChoice == 1) {
            int rollNo;
            String name;
            String section;
            String batch;
            int dbChoice = 0;
            while(dbChoice != 3) {
                System.out.println("Press (1) to insert data, Press (2) to retrieve data or press (3) to exit");
                dbChoice = sccc.nextInt();
                if(dbChoice == 1)
                {
                    System.out.println("Enter the following info:\n");
                    System.out.println("Roll No:");
                    rollNo = sccc.nextInt();
                    System.out.println("Name:");
                    name = sccc.next();
                    System.out.println("Section:");
                    section = sccc.next();
                    System.out.println("Batch:");
                    batch = sccc.next();

                    DataBase newInsert = new DataBase(rollNo,name,section,batch);
                    newInsert.write();
                }
                else if(dbChoice == 2)
                {
                	DataBase retrieve = new DataBase();
                    retrieve.read();
                }
                else if( dbChoice == 3)
                {  
                	System.out.println("Thank You!");
                   
                }
            }
            sccc.close();
            return;

        }







				// TODO Auto-generated method stub
				int accountType= 1;
				List<Customer> customers = new ArrayList<Customer>();

				//	Customer customer = new Customer();
				//	Account account = new Account();
				//	account.setCustomer(customer);
				//	customer.setAccount(account);
				//	Savings saving = new Savings();
				//	Checking checking = new Checking();
				//	saving.setCustomer(customer);
				//	checking.setCustomer(customer);



				System.out.println("Welcome to the Bank \n");

				System.out.println("Enter (1) to register account \nEnter (2) to remove account ");
				System.out.println("Enter (3) login to account ");
				System.out.println("Enter (4) for bank details \nEnter (5) to for details with deductions \nEnter (0) to end ");
				Scanner s = new Scanner(System.in);
				int choice = s.nextInt();

				while(choice != 0)
				{

					if(choice < 0 || choice > 5 )
					{
						System.out.println("Error, please enter again");
					}
					if(choice == 1)
					{
						Customer customer = new Customer();
						account account = new account();
						account.setCustomer(customer);
						customer.setAccount(account);

						System.out.println("Enter (1) to open savings account\nEnter (2) to open checking account\nEnter (3) to open both ");
						Scanner c1 = new Scanner(System.in);
						int cho1= c1.nextInt();

						System.out.println("Please enter your full name");
						Scanner sc = new Scanner(System.in);
						String Name = sc.nextLine();

						System.out.println("Please enter your Address");
						Scanner sc1 = new Scanner(System.in);
						String address = sc1.nextLine();

						System.out.println("Please enter your Phone number");
						Scanner sc2 = new Scanner(System.in);
						String phoneNumber = sc2.nextLine();

						Random accNo = new Random();
						int number;
						number = 1000+accNo.nextInt(1000); 

						LocalDate date = LocalDate.now(); 



						if(cho1 == 1)
						{


							savingAccount saving = new savingAccount();
							//	Checking checking = new Checking();
							saving.setCustomer(customer);
							//	checking.setCustomer(customer);

							System.out.println("Please enter your balance for savings account");
							Scanner sc4 = new Scanner(System.in);
							Float balance = sc4.nextFloat();

							System.out.println("Congratulations!! You have been registered with acc No:\n" + number);
							//customer = new Customer(Name, address, phoneNumber, number);
							customer.setName(Name);
							customer.setAddress(address);
							customer.setNumber(number);
							customer.setPhoneNumber(phoneNumber);
							saving.setBalance(balance);
							saving.setDateCreated(date);
							saving.setCustomer(customer);

							saving.setCustomer(customer);
							customer.setSaving(saving);
							customers.add(customer);



						}

						if(cho1 == 2)
						{



							System.out.println("Please enter your balance for checking account");
							Scanner sc4 = new Scanner(System.in);
							Float balance = sc4.nextFloat();

							//Savings saving = new Savings();
							checkingAccount checking = new checkingAccount();
							//saving.setCustomer(customer);
							checking.setCustomer(customer);
							customer.setChecking(checking);
							checking.balance=balance;
							System.out.println("Congratulations!! You have been registered with acc No:\n" + number);

							//	customer = new Customer(Name, address, phoneNumber, number);
							customer.setName(Name);
							customer.setAddress(address);
							customer.setNumber(number);
							customer.setPhoneNumber(phoneNumber);
							//	account = new Account(balance, date, number);
							checking.setBalance(balance);
							checking.setDateCreated(date);
							checking.setCustomer(customer);

							checking.setCustomer(customer);
							customer.setChecking(checking);
							customers.add(customer);


						}


						if(cho1 == 3)
						{


							savingAccount saving = new savingAccount();
							//	Checking checking = new Checking();
							saving.setCustomer(customer);
							//	checking.setCustomer(customer);

							System.out.println("Please enter your balance for savings account");
							Scanner sc4 = new Scanner(System.in);
							Float balance = sc4.nextFloat();

							//System.out.println("Congratulations!! You have been registered with acc No:\n" + number);
							//customer = new Customer(Name, address, phoneNumber, number);
							customer.setName(Name);
							customer.setAddress(address);
							customer.setNumber(number);
							customer.setPhoneNumber(phoneNumber);
							saving.setBalance(balance);
							saving.setDateCreated(date);
							saving.setCustomer(customer);

							saving.setCustomer(customer);
							customer.setSaving(saving);
							customers.add(customer);

							System.out.println("Please enter your balance for checking account");
							Scanner sc44 = new Scanner(System.in);
							Float balancef = sc44.nextFloat();

							//Savings saving = new Savings();
							checkingAccount checking = new checkingAccount();
							//saving.setCustomer(customer);
							checking.setCustomer(customer);
							customer.setChecking(checking);
							checking.balance=balancef;
							System.out.println("Congratulations!! You have been registered with acc No:\n" + number);

							//	customer = new Customer(Name, address, phoneNumber, number);
							customer.setName(Name);
							customer.setAddress(address);
							customer.setNumber(number);
							customer.setPhoneNumber(phoneNumber);
							//	account = new Account(balance, date, number);
							checking.setBalance(balancef);
							checking.setDateCreated(date);
							checking.setCustomer(customer);

							checking.setCustomer(customer);
							customer.setChecking(checking);
							customers.add(customer);

						}

						if(choice < 1 || choice > 3)
						{
							System.out.println("Error, please enter again");
						}
						// file handling for customers


					}	

					else if(choice == 2)
					{

						// remove account through account number

						System.out.println("Enter account number for account removal");
						Scanner sc7 = new Scanner(System.in);
						int rem = sc7.nextInt();


						Iterator<Customer> iter = customers.iterator();
						int index = 0;
						Boolean found= false;
						while (iter.hasNext()) 
						{
							Customer customer = iter.next();

							if(rem == customer.number)
							{			
								found= true;
								break;
								//customers.remove(index);
							}
							index++;
						}
						if(found == true)
						{
							customers.remove(index);
							System.out.println("Account deleted");
						}
						else if(found == false)
						{
							System.out.println("Invalid account number");
						}

					}
					else if(choice == 3)
					{
						System.out.println("Login: \nPlease enter your account number");
						Scanner sc5= new Scanner(System.in);
						int code = sc5.nextInt();

						Boolean valid = false;
						Iterator<Customer> iter2 = customers.iterator();
						while (iter2.hasNext()) 
						{
							Customer customer = iter2.next();
							System.out.println(customer.number);
							if(code == customer.number)
							{
								valid = true;
								System.out.println("You have susessfully logged in");
								System.out.println("Enter (1)for Savings account and (2) for Checking account");
								Scanner sc8 = new Scanner(System.in);
								int aC = sc8.nextInt();

								if(aC == 1)
								{
									System.out.println("Welcome to your saving account");
									System.out.println("Enter (1) for Balance check");
									System.out.println("Enter (2) for Cash deposit");
									System.out.println("Enter (3) for Cash withdrawl");
									System.out.println("Enter (4) for Print statement");
									System.out.println("Enter (5) for Transferring cash");
									System.out.println("Enter (6) for Calculation of Zakat");
									System.out.println("Enter (7) for Deduction display");
									Scanner save = new Scanner(System.in);
									int sS = save.nextInt();

									if(sS == 1)
									{
										savingAccount saving = customer.saving;
										saving.checkBalance();

									}
									else if(sS == 2)
									{
										savingAccount saving = customer.saving;
										System.out.println("Enter amount of cash to deposit");
										Scanner dep = new Scanner(System.in);
										int depo = dep.nextInt();
										saving.makeDeposit(depo);

									}
									else if(sS == 3)
									{
										savingAccount saving = customer.saving;
										System.out.println("Enter amount of cash to withdraw");
										Scanner wit = new Scanner(System.in);
										int withd = wit.nextInt();
										saving.cashWithdrawl(withd);
									}
									else if(sS == 4)
									{
										savingAccount saving = customer.saving;
										saving.printStatement();
									}
									else if(sS == 5)
									{
										System.out.println("Press (1) if you have Checking account or Press (2) if you have Saving account");
										Scanner e = new Scanner(System.in);
										int type = e.nextInt();
										System.out.println("Enter account Number to transfer to: ");
										Scanner ss = new Scanner(System.in);
										int account2 = ss.nextInt();


										Iterator<Customer> cust2 = customers.iterator();
										Customer newCust2 = null;
										while(cust2.hasNext()) {
											Customer temp2 = (Customer) cust2.next();
											if (temp2.getNumber() == account2) {
												newCust2 = temp2;
												break;
											}
										}
										System.out.println("Enter (1)for Savings account and (2) for Checking account");
										Scanner sc12 = new Scanner(System.in);
										int AC = sc12.nextInt();
										System.out.println("Enter the amount of cash for transfer");
										Scanner casssh = new Scanner(System.in);
										int amount = casssh.nextInt(); 

										if(AC == 1)
										{
											if(type == 1)
											{
												customer.getChecking().transferAmount(newCust2.getSaving(), amount);
											}
											else 
											{
												customer.getSaving().transferAmount(newCust2.getSaving(), amount);
											}
										}
										else
										{
											if(type == 1)
											{
												customer.getChecking().transferAmount(newCust2.getChecking(), amount);
											}
											else 
											{
												customer.getSaving().transferAmount(newCust2.getChecking(), amount);
											}
										}
									}
									else if(sS == 6)
									{
										savingAccount saving = customer.saving;
										saving.calculateZakat();
									}
									else if(sS == 7)
									{
										savingAccount saving = customer.saving;
										saving.DisplayAllDeductions();
									}
									else if(sS < 0 || sS >7)
									{
										System.out.println("Error");
									}
								}
								else
								{
									System.out.println("Welcome to your Checking account");
									System.out.println("Enter (1) for Balance check");
									System.out.println("Enter (2) for Cash deposit");
									System.out.println("Enter (3) for Cash withdrawl");
									System.out.println("Enter (4) for Print statement");
									System.out.println("Enter (5) for Transferring cash");
									System.out.println("Enter (6) for Deduction display");
									Scanner che = new Scanner(System.in);
									int cS = che.nextInt();

									if(cS == 1)
									{
										checkingAccount checking = customer.checking;
										checking.checkBalance();
									}
									else if(cS == 2)
									{
										checkingAccount checking = customer.checking;
										System.out.println("Enter amount of cash to deposit");
										Scanner depc = new Scanner(System.in);
										int depoc = depc.nextInt();
										checking.makeDeposit(depoc);

									}
									else if(cS == 3)
									{
										checkingAccount checking = customer.checking;
										System.out.println("Enter amount of cash to withdraw");
										Scanner witc = new Scanner(System.in);
										int withdc = witc.nextInt();
										checking.cashWithdrawl(withdc);
									}
									else if(cS == 4)
									{
										checkingAccount checking = customer.checking;
										checking.printStatement();
									}
									else if(cS == 5)
									{
										System.out.println("Press (1) if you have Checking account or Press (2) if you have Saving account");
										Scanner e = new Scanner(System.in);
										int type = e.nextInt();
										System.out.println("Enter account Number to transfer to: ");
										Scanner ss = new Scanner(System.in);
										int account2 = ss.nextInt();


										Iterator<Customer> cust2 = customers.iterator();
										Customer newCust2 = null;


										while(cust2.hasNext()) {
											Customer temp2 = (Customer) cust2.next();
											if (temp2.getNumber() == account2) {
												newCust2 = temp2;
												break;
											}
										}
										System.out.println("Enter (1)for Savings account and (2) for Checking account");
										Scanner sc12 = new Scanner(System.in);
										int AC = sc12.nextInt();
										System.out.println("Enter the amount of cash for transfer");
										Scanner casssh = new Scanner(System.in);
										int amount = casssh.nextInt(); 


										if(AC == 1)
										{
											if(type == 1)
											{
												customer.getChecking().transferAmount(newCust2.getSaving(), amount);
											}
											else 
											{
												customer.getSaving().transferAmount(newCust2.getSaving(), amount);
											}
										}
										else
										{
											if(type == 1)
											{
												customer.getChecking().transferAmount(newCust2.getChecking(), amount);
											}
											else 
											{
												customer.getSaving().transferAmount(newCust2.getChecking(), amount);
											}
										}
									}

									else if(cS == 6)
									{
										checkingAccount checking = customer.checking;
										checking.DisplayAllDeductions();
									}
									else if(cS < 0 || cS > 6)
									{
										System.out.println("Error");
									}

								}

							}

						}
						if(valid == false)
						{
							System.out.println("Invalid account number");
						}
						else if(valid == true)
						{
							System.out.println("You have succesfully logged in");
						}

					}
					if(choice == 4)
					{

						System.out.println("Login: \nPlease enter your account number");
						Scanner sc5= new Scanner(System.in);
						int code = sc5.nextInt();

						Iterator<Customer> iter = customers.iterator();
						while (iter.hasNext()) 
						{
							Customer customer = iter.next();
							if(code == customer.number)
							{	

								System.out.println("Enter (1) for savings account or Enter (2) for checking account");
								Scanner sc9 = new Scanner(System.in);
								int pD= sc9.nextInt();

								if(pD== 1)
								{
									savingAccount saving = customer.saving;
									saving.printStatement();
								}
								else if (pD == 2)
								{
									checkingAccount checking = customer.checking;
									checking.printStatement();
								}
								else if(pD <1 || pD > 2)
								{
									System.out.println("Error");
								}

							}			
						}
					}
					if(choice == 5)
					{
						System.out.println("Enter (1) for savings account or Enter (2) for checking account");
						Scanner s9 = new Scanner(System.in);
						int pd= s9.nextInt();

						System.out.println("Login: \nPlease enter your account number");
						Scanner sc5= new Scanner(System.in);
						int code = sc5.nextInt();

						Iterator<Customer> iter = customers.iterator();
						while (iter.hasNext()) 
						{
							Customer customer = iter.next();
							if(code == customer.number)
							{

								if(pd == 1)
								{
									savingAccount saving = customer.saving;
									saving.printStatement();
									saving.DisplayAllDeductions();
								}
								else
								{
									checkingAccount checking = customer.checking;
									checking.printStatement();
									checking.DisplayAllDeductions();
								}
							}
						}
					}
					////////////////////////////////////////////////




					////////////////////////////////////////////////

					System.out.println("Enter (1) to register account \nEnter (2) to remove account ");
					System.out.println("Enter (3) login to account ");
					System.out.println("Enter (4) for bank details \nEnter (5) to for details with deductions \nEnter (0) to end ");

					Scanner s7 = new Scanner(System.in);
					choice = s7.nextInt();
				}
				////////////////////////
				Iterator<Customer> iter = customers.iterator();



				while (iter.hasNext()) 
				{
					Customer customer = iter.next();
					try {

						// Open given file in append mode by creating an
						// object of BufferedWriter class
						BufferedWriter out = new BufferedWriter(
								new FileWriter("Customer.txt", true));

						// Writing on output stream
						out.write("\n\nCustomer name: " + customer.getName());
						out.write("\nCustomer address: " + customer.getAddress());
						out.write("\nCustomer phone number: " + customer.getPhoneNumber());
						out.write("\nCustomer Id: " + customer.getNumber());
						// Closing the connection
						out.close();
					}

					// Catch block to handle the exceptions
					catch (IOException e) {

						// Display message when exception occurs
						System.out.println("exception occurred" + e);
					}	
				}	
				/////////////////////// saving account 
				Iterator<Customer> iter2 = customers.iterator();

				while (iter2.hasNext()) 
				{
					Customer customer = iter2.next();
					savingAccount saving = customer.saving;
					if(saving != null)
					{	
						try {

							// Open given file in append mode by creating an
							// object of BufferedWriter class
							BufferedWriter out = new BufferedWriter(
									new FileWriter("SavingsAccount.txt", true));

							// Writing on output stream
							out.write("\n\nCustomer name: " + customer.getName());
							out.write("\nCustomer Id: " + customer.getNumber());


							out.write("\nbalance : " + saving.balance);
							// Closing the connection
							out.close();
						}

						// Catch block to handle the exceptions
						catch (IOException e) {

							// Display message when exception occurs
							System.out.println("exception occurred" + e);
						}	
					}



					checkingAccount checking = customer.checking;
					if(checking != null)
					{
						try {

							// Open given file in append mode by creating an
							// object of BufferedWriter class
							BufferedWriter out = new BufferedWriter(
									new FileWriter("CheckingAccount.txt", true));

							// Writing on output stream
							out.write("\n\nCustomer name: " + customer.getName());
							out.write("\nCustomer Id: " + customer.getNumber());
							out.write("\nbalance : " + checking.balance);

							// Closing the connection
							out.close();
						}

						// Catch block to handle the exceptions
						catch (IOException e) {

							// Display message when exception occurs
							System.out.println("exception occurred" + e);
						}	
					}
				}

				/// file reading:
				System.out.println("Press (1) to read files or press (2) TO END");
				Scanner sr = new Scanner(System.in);
				int reaad = sr.nextInt();
				if(reaad == 1)
				{
					try {
						File myObj = new File("Customer.txt");
						System.out.println("\nCustomer file");
						Scanner myReader = new Scanner(myObj);
						while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							System.out.println(data);
						}
						myReader.close();
					} catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}
					////////////////////////////////////
					try {
						File myObj = new File("CheckingAccount.txt");
						System.out.println("\nChecking file");
						Scanner myReader = new Scanner(myObj);
						while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							System.out.println(data);
						}
						myReader.close();
					} catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}
					///////////////////////////////////////
					try {
						File myObj = new File("SavingsAccount.txt");
						System.out.println("\nSavings file");
						Scanner myReader = new Scanner(myObj);
						while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							System.out.println(data);
						}
						myReader.close();
					} catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}



				}


			}

	
		}
