package week15;

public class BillingSystemArrays
{
	private int id[];
	private String status[];
	private double amount[];
	private double balance[];
	
	private int numOfBills;
	public static final int MAX_SIZE = 100;
	
	public BillingSystemArrays()
	{
		id = new int[MAX_SIZE];
		status = new String[MAX_SIZE];
		amount = new double[MAX_SIZE];
		balance = new double[MAX_SIZE];

		numOfBills = 0;
	}

	//Not is the exam
	public BillingSystemArrays(int size)
	{
		if (size <= 0)
			size = -size;

		id = new int[size];
		status = new String[size];
		amount = new double[size];
		balance = new double[size];

		numOfBills = 0;
	}

	public int getNumOfBills()
	{
		return numOfBills;
	}

	public boolean addBill(int id, String status, double amount, double balance)
	{
		if (numOfBills < MAX_SIZE) //add
		{
			this.id[numOfBills] = id;
			this.status[numOfBills] = status;
			this.amount[numOfBills] = amount;
			this.balance[numOfBills] = balance;
			
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
	
	public void removeBill(int i) //i is the index of the removed
	{
		if (i >= 0 && i < numOfBills)
		{
			this.id[i] = this.id[numOfBills - 1];
			this.status[i] = this.status[numOfBills - 1];
			this.amount[i] = this.amount[numOfBills - 1];
			this.balance[i] = this.balance[numOfBills - 1];

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
			System.out.print("The bill id: " + this.id[i] + " with amount: " + this.amount[i] + "SR");
			System.out.println(" is " + this.status[i] + ".The balance is " + this.balance[i] + "SR.");
		}
		else
			System.out.println("ERROR Printing");
	}

	public int findBill(int id)
	{
		for(int i = 0 ; i < numOfBills ; i++)
		{
			if (this.id[i] == id)
				return i;
		}

		return -1; //Not found
	}
	
	public boolean payBill(int id)
	{
		int index = findBill(id); //to get the index of the bill
		
		if (this.status[index].equalsIgnoreCase("NotPaid"))
		{
			if (this.balance[index] >= balance[index]) //Now you pay
			{
				this.balance[index] = this.balance[index] - this.amount[index];
				this.status[index] = "Paid";

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

	public void addBalance (int id , double money)
	{
		int index = findBill(id); //search for id
		
		if (index == -1) //id not found
			System.out.println("ERROR Bill not found! Cannot add balance");
		else  //id is found add money
			this.balance[index] += money; 
	}

	public double getBalance(int i)
	{
		if (i >= 0 && i < numOfBills)
			return balance[i];
		else
			return -1;
	}
}