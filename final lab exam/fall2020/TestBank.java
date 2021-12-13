package week16;

import java.util.Scanner;

public class TestBank
{
	public static void main(String[] args)
	{
		//1. Create a Bank object b1 with the size of 5.
		Bank b1 = new Bank(5);

		//2. Create another Bank object b2 with size of 2.
		Bank b2 = new Bank(2);

		/*
		3. Add the following clients to the bank b2:
			1- Mike, 1000
			2- Joe, 3000
		*/

		b2.addClient("Mike", 1000);
		b2.addClient("Joe", 3000);

		/*
		 *4. Print the following menu:
		 	1- Add Client.
			2- Close a client account.
			3- Deposit.
			4- Withdraw.
			5- Transfer.
			6- Transfer to another bank.
			7- Display balance.
			8- Find the richest client.
			9- Exit.
		 */
	
		Scanner input = new Scanner(System.in);
		int choice;
		double balance;
		String name;
		double amount;
		String fName;
		String tName;

		do
		{
			System.out.println("******************************");
			System.out.println("1- Add Client.               *");
			System.out.println("2- Close a client account.   *");
			System.out.println("3- Deposit.                  *");
			System.out.println("4- Withdraw.                 *");
			System.out.println("5- Transfer.                 *");
			System.out.println("6- Transfer to another bank. *");
			System.out.println("7- Display balance.          *");
			System.out.println("8- Find the richest client.  *");
			System.out.println("9- Exit.                     *");
			System.out.println("******************************");

			System.out.print("=> ");
			choice = input.nextInt();

			if (choice == 1) //Add
			{
				System.out.print("Enter name and balance: ");
				name = input.next();
				balance = input.nextDouble();
				
				if (b1.addClient(name, balance))
					System.out.println("DONE");
				else
					System.out.println("ERROR");
			}
			else if(choice == 2) //Delete
			{
				System.out.print("Enter name: ");
				name = input.next();

				if (b1.deleteClient(name))
					System.out.println("DONE");
				else
					System.out.println("ERROR");
			}
			else if(choice == 3) //Deposit
			{
				System.out.print("Enter name and amount: ");
				name = input.next();
				amount = input.nextDouble();
				
				if (b1.deposit(name, amount))
					System.out.println("DONE");
				else
					System.out.println("ERROR");
			}
			else if(choice == 4)//withdraw
			{
				System.out.print("Enter name and amount: ");
				name = input.next();
				amount = input.nextDouble();

				if (b1.withdraw(name, amount))
					System.out.println("DONE");
				else
					System.out.println("ERROR");
			}
			else if(choice == 5)
			{
				System.out.print("Enter from name, to name, and amount: ");
				fName = input.next();
				tName = input.next();
				amount = input.nextDouble();

				if (b1.transfer(fName, tName, amount))
					System.out.println("DONE");
				else
					System.out.println("ERROR");
			}
			else if(choice == 6)
			{
				System.out.print("Enter from name (this bank), to name (other bank), and amount: ");	
				fName = input.next();
				tName = input.next();
				amount = input.nextDouble();
				
				if (b1.transferToBank(fName, b2,tName, amount))
					System.out.println("DONE");
				else
					System.out.println("ERROR");
			}
			else if(choice == 7)
			{
				System.out.print("Enter name: ");
				name = input.next();

				b1.display(name);
			}
			else if(choice == 8)
			{
				String maxName = b1.findMax();

				if (maxName == null)
					System.out.println("No names in the bank");
				else
					b1.display(maxName);
			}
			else if(choice == 9)
				System.out.println("Goodbye");
			else
				System.out.println("Wrong choice.");
		}while(choice != 9);

		input.close();
	}
}