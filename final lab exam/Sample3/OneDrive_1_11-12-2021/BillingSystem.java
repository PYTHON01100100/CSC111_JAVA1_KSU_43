package week15;

public class BillingSystem
{
	private Bill bills[];
	private int numOfBills;
	public static final int MAX_SIZE = 100;
	
	public BillingSystem()
	{
		bills = new Bill[MAX_SIZE];
		numOfBills = 0;
	}

	//Not is the exam
	public BillingSystem(int size)
	{
		if (size <= 0)
			size = -size;

		bills = new Bill[size];
		numOfBills = 0;
	}

	public int getNumOfBills()
	{
		return numOfBills;
	}

	/*
	addBill (Bill b): this method will add a bill. If it is not possible to add the bill, you should print
	an error message “ERROR Adding”.
	*/
	
	public boolean addBill(Bill b)
	{
		if (b == null)
		{
			System.out.println("Empty Bill (NULL)");
			return false;
		}

		if (numOfBills < MAX_SIZE) //add
		{
			bills[numOfBills] = b;
			numOfBills++;
			
			System.out.println("Bill Added");
			return true;
		}
		else
		{
			System.out.println("ERROR Adding");
			return false;
		}
	}
	
	public boolean addBill(int id, double amount, double balance,String status)
	{
		if (numOfBills < MAX_SIZE) //add
		{
			Bill b = new Bill(id,status,amount,balance);
			bills[numOfBills] = b;
			numOfBills++;
			
			System.out.println("Bill Added");
			return true;
		}
		else
		{
			System.out.println("ERROR Adding");
			return false;
		}
	}
	
	public void removeBill(int i)
	{
		if (i >= 0 && i < numOfBills)
		{
			bills[i] = bills[numOfBills - 1];
			numOfBills--;
			System.out.println("Bill is removed");
		}
		else
			System.out.println("ERROR Removing");
	}
	
	public void displayBill(int i)
	{
		if (i >= 0 && i < numOfBills)
		{
			System.out.print("The bill id: " + bills[i].getId() + " with amount: " + bills[i].getAmount() + "SR");
			System.out.println(" is " + bills[i].getStatus() + ".The balance is " + bills[i].getBalance() + "SR.");
		}
		else
			System.out.println("ERROR Printing");
	}

	public int findBill(int id)
	{
		for(int i = 0 ; i < numOfBills ; i++)
		{
			if (bills[i].getId() == id)
				return i;
		}

		return -1; //Not found
	}
	
	public boolean payBill(int id)
	{
		int index = findBill(id); //to get the index of the bill
		
		if (bills[index].getStatus().equalsIgnoreCase("NotPaid"))
		{
			if (bills[index].getBalance() >= bills[index].getAmount()) //Now you pay
			{
				bills[index].setBalance(bills[index].getBalance() - bills[index].getAmount());
				bills[index].setStatus("Paid");

				return true;
			}
			else
				return false;
		}
		else
		{
			System.out.println("Thank you, it is already paid");
			return true;
		}
	}
}