package week15;

public class Bill
{
	private int id;
	private String status;
	private double amount;
	private double balance;
	
	public Bill()
	{
		id = -1;
		status = "NotPaid";
		amount = 0;
		balance = 0;
	}
	
	public Bill(int id, String status, double amount, double balance)
	{
		this.id = id;
		this.status = status;
		this.amount = amount;
		this.balance = balance;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		if (status.equalsIgnoreCase("Paid") || status.equalsIgnoreCase("Notpaid"))
			this.status = status;
		else
			this.status = "NotPaid";
	}

	public double getAmount()
	{
		return amount;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
}