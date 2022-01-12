package week16;

public class Bank
{
	/*
	* names: An array containing the clients names (no duplicates).
	* balances: An array containing the clients balances.
	* nClients: the number of clients.
	*/
	private String[] names;
	private double[] balances;
	private int nClients;

	public Bank() 
	{
		names = new String[100];
		balances = new double[100];
		nClients = 0;
	}
	
	/*
	* Bank(size): A constructor that sets the banks nClients to 0, 
	* initializes both arrays names and balances to be of size size.
	*/
	public Bank(int size) 
	{
		this.names    = new String[size];
		this.balances = new double[size];

		nClients = 0;
	}
	
	/*
	 * findIndexByName(name): returns the index of name in the array names. 
	 * If name is not found, return -1.
	 */
	public int findIndexByName(String name)
	{
		for(int i = 0 ; i < nClients ; i++)
		{
			if (this.names[i].equalsIgnoreCase(name))
				return i;
		}

		return -1;
	}
	
	/*
	 * addClient(name, balance): adds name to the array of names and balance to 
	 * the array of balances in the same index, then returns true. 
	 * If there is no space in the arrays, it returns false. 
	 * If there was a client with the same name, it doesn’t add the client and returns false.
	 */
	public boolean addClient(String name, double balance)
	{
		if (nClients < names.length) //check for space
		{
			int index = findIndexByName(name);

			if (index == -1) //Not found, go ahead and add
			{
				this.names[nClients] = name;
				this.balances[nClients] = balance;
				nClients++;

				return true;
			}
			else //Already in the array
				return false;
		}
		else //array is full
			return false;
	}
	
	public boolean addClient2(String name, double balance)
	{
		if (nClients < names.length) //check for space
		{
			int index = findIndexByName(name);

			if (index == -1) //Not found, go ahead and add
			{
				this.names[nClients] = name;
				this.balances[nClients] = balance;
				nClients++;

				return true;
			}
		}

		return false;
	}
	
	public int addClient3(String name, double balance)
	{
		if (nClients < names.length) //check for space
		{
			int index = findIndexByName(name);

			if (index == -1) //Not found, go ahead and add
			{
				this.names[nClients] = name;
				this.balances[nClients] = balance;
				nClients++;

				return 1;
			}
			else //Already in the array
				return 0;
		}
		else //array is full
			return -1;
	}

	/*
	 * deleteClient(name): removes a client by replacing his/her name 
	 * and balance with the last client’s name and balance, 
	 * then returns true. Returns false if name was not found.
	 */
	public boolean deleteClient(String name)
	{
		int index = findIndexByName(name);

		if (index == -1) //not found
			return false;
		else
		{
			names[index] = names[nClients - 1];
			balances[index] = balances[nClients - 1];

			nClients--;
			return true;
		}
	}
	
	public boolean deleteClientShift(String name)
	{
		int index = findIndexByName(name); //search for the name and return the index of this name

		if (index == -1) //not found
			return false;
		else
		{
			for(int i = index ; i < nClients - 1 ; i++)
			{
				names[i]    = names[i + 1];
				balances[i] = balances[i + 1];
			}

			nClients--;

			return true;
		}
	}

	/*
	 * deposit(name, amount): adds the amount to the balance of name, 
	 * then returns true. Then prints the name, previous balance, 
	 * and current balance. If name is not found, return false.
	 * 
	 * Ali was 1900.0, now 2000.0
	 */
	public boolean deposit(String name, double amount)
	{
		int index = findIndexByName(name);
		
		if (index == -1) //not found
			return false;
		else
		{
			double t = balances[index];
			balances[index] += amount; //add the amount to balance at index
			System.out.println(names[index] + " was " + t + " , now " + balances[index]);

			return true;
		}
	}
	
	/*
	 * withdraw(name, amount): takes the amount from the balance of name, then returns true. 
	 * Then print the name, previous balance, and current balance. 
	 * If name is not found or the balance is not enough, return false without changing 
	 * the balance.
	 * 
	 * Ali was 1900.0, now 1000.0
	 */
	public boolean withdraw(String name, double amount)
	{ 
		int index = findIndexByName(name);

		if (index == -1) //not found
			return false;
		else
		{
			double t = balances[index];

			if (balances[index] >= amount)
			{
				balances[index] -= amount;
				System.out.println(names[index] + " was " + t + " , now " + balances[index]);

				return true;
			}
			else
			{
				System.out.println(names[index] + " was " + t + " , now " + balances[index]);
				return false;
			}
		}
	}

	/*
	 * transfer(fName, tName, amount): takes the amount from fName‘s balance and 
	 * adds it to tName’s balance, then returns true. Then prints the name, previous balance,
	 * and current balance for both clients. If either fName or tName are not found 
	 * or the balance is not enough, return false without changing the balance:
	 * 
	 * Ali was 1900.0, now 1000.0
	 * Ahmad was 100.0, now 1000.0
	 */
	public boolean transfer(String fName, String tName, double amount)
	{ 
		int index1 = findIndexByName(fName);
		
		if (index1 == -1)
			return false;
		else
		{
			int index2 = findIndexByName(tName);
			
			if (index2 == -1)
				return false;
			else
			{
				double t1 = balances[index1];  //balance of from before changing
				double t2 = balances[index2];  //balance of to before changing

				if (balances[index1] >= amount) //check if the from balance is enough
				{
					balances[index1] -= amount;
					balances[index2] += amount;

					System.out.print(names[index1] + " was " + t1 + ", now " + balances[index1]);
					System.out.print(names[index2] + " was " + t2 + ", now " + balances[index2]);

					return true;
				}
				else
				{
					System.out.print(names[index1] + " was " + t1 + ", now " + balances[index1]);
					System.out.print(names[index2] + " was " + t2 + ", now " + balances[index2]);

					return false;
				}
			}
		}
	}

	/*
	 * transfterToBank(fName, toBank, tName, amount): takes the amount from fName‘s balance 
	 * and adds it to tName’s balance in toBank, then returns true. 
	 * If either fName or tName are not found or the balance is not enough, return false.
	 */

	public boolean transferToBank(String f, Bank toBank, String t, double a) 
	{
		int index1 = this.findIndexByName(f);

		if (index1 == -1)
			return false;
		else
		{
			int index2 = toBank.findIndexByName(t);
			
			if (index2 == -1)
				return false;
			else
			{
				double t1 = this.balances[index1];
				double t2 = toBank.balances[index2];

				if (this.balances[index1] >= a)
				{
					this.balances[index1]   -= a;
					toBank.balances[index2] += a;
					
					System.out.println(this.names[index1]   + " was " + t1 + ", now " + this.balances[index1]);
					System.out.println(toBank.names[index2] + " was " + t2 + ", now " + toBank.balances[index2]);
				
					return true;
				}
				else
				{
					System.out.println(this.names[index1]   + " was " + t1 + ", now " + this.balances[index1]);
					System.out.println(toBank.names[index2] + " was " + t2 + ", now " + toBank.balances[index2]);

					return false;
				}
			}
		}
	}

	/*
	 * display(name): prints name information. If name is not found, print “Not found.”
	 */
	public void display(String name) 
	{
		int index = findIndexByName(name);
		
		if (index == -1)
			System.out.println("Not found");
		else
			System.out.println(this.names[index] + " " + this.balances[index] + " SR");
	}

	/*
	 * findMax(): returns the name of the richest client in the bank. 
	 * If the bank has no clients, returns null.
	 */
	public String findMax() 
	{
		if (nClients == 0)
			return null;
		else
		{
			String maxname    = names[0]; //store first name as maxName
			double maxBalance = balances[0]; //store first balance as maxBalance

			for (int i = 1 ; i < nClients ; i++)
			{
				if (this.balances[i] > maxBalance)
				{
					maxBalance = this.balances[i];
					maxname    = this.names[i];
				}
			}

			return maxname;
		}
	}
}