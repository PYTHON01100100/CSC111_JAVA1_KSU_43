package week15;

import java.util.Scanner;

public class TestBillingSystemArrays
{
	public static void main(String[] args)
	{
		//1. Create a BillingSystem object.
		BillingSystemArrays b1 = new BillingSystemArrays();
		
//2. (1 point) Ask the user to enter bill information. Keep reading and storing bill information in array
//		bills until user enters (-1) as id of bill.

		Scanner input = new Scanner(System.in);
		int id;
		String status;
		double amount;
		double balance;
		
		System.out.print("enter id (-1 to exit) , status , amount , balance: ");
		id = input.nextInt();
		
		while(id != -1)
		{
			status = input.next();
			balance = input.nextDouble();
			amount = input.nextDouble();
			
			b1.addBill(id, status, amount, balance);

			//new Bill
			System.out.print("enter id (-1 to exit) , status , amount , balance: ");
			id = input.nextInt();
		}
		
		//3. (1 point) Ask the user to enter the id of the bill he wants to pay then display
		//the output of this operation.
		
		System.out.println("enter the id of the bill you want to pay : ");
		id = input.nextInt();
		
		if (b1.payBill(id) == true)
			System.out.println("it's Paid");
		else
			System.out.println("Bill not found!");

		//4. (0.5 points) ask the user if he wants to add balance
		//a. if (yes) ask the user to enter id and amount to add
		//to the balance then display the output of the operation.

		int answer;
		
		System.out.print("Do you want to add balance?: (1-Yes/2-No): ");
		answer = input.nextInt();
		
		if (answer == 1) //yes I want to add
		{
			System.out.println("Please enter the id and the amount of money you want to add: ");
			id = input.nextInt();
			
			int index = b1.findBill(id);
			
			if (index == -1)
				System.out.println("ID not found");
			else
			{
				amount = input.nextDouble();
				b1.addBalance(id, amount);
				
				System.out.println("The amount: " + amount + " is added to your balance. the new balance is: " 
				+ b1.getBalance(index));
			}
		}
		else
			System.out.println("OK – You don’t want to add balance");

		//5. (1 point) Finally, display all bills.
		for (int i = 0 ; i < b1.getNumOfBills() ; i++)
			b1.displayBill(i);

		input.close();
	}
}

/*

*/
