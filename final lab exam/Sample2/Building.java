package week15;

public class Building
{
	private Apartment apts[];
	private int numApts;
	public static final int MAX_SIZE = 100;

	public Building()
	{
		apts = new Apartment[MAX_SIZE];
		numApts = 0;
	}	

	public int getNumApts()
	{
		return numApts;
	}

	/*
	addApt: this method will add an apartment. If it is not possible to add the apartment,
	 you should print an error message “ERROR Adding”.
	*/
	
	public void addApt(Apartment a)
	{
		if (a == null)
		{
			System.out.println("Null Apartment");
			return;
		}

		if (numApts < MAX_SIZE) //We have space to rent the apt
		{
			apts[numApts] = a;
			numApts++;
			
			System.out.println("Apartment is rented (Mabrooooook)");
		}
		else
			System.out.println("ERROR Adding");
	}

	/*
	 * remove the apartment with index ‘i’ and put the last apartment in its place. Otherwise
		print “ERROR removing”
	 */
	
	public void removeApt(int i)
	{
		if (i >= 0 && i < numApts)
		{
			apts[i] = apts[numApts - 1];
			numApts--;
	
			System.out.println("Apartment is removed");
		}
		else
			System.out.println("ERROR removing");
	}

	/*
	displayApt: displays the apartments details for Apartment with index ‘i’ in the array, Otherwise print
	“ERROR Printing”
	*/
	
	public void displayApt(int i)
	{
		if (i >= 0 && i < numApts)
		{
			System.out.println("Apartment in index : " + i);
			System.out.println("ID    : " + apts[i].getId());
			System.out.println("Rooms : " + apts[i].getRooms());
			System.out.println("Rent  : " + apts[i].getRent());
			System.out.println("Status : " + apts[i].getStatus());
			System.out.println("----------------------------------");
		}
		else
			System.out.println("ERROR printing");
	}

	/*
	 *getFirstAvailable: returns the index of the first available apartment with a given number
	 * of rooms and rent. If no such apartment then return -1. For example, get the index of 
	 * first apt in array with 2 rooms and rent 1000 SR or less.
	 * (Note: status should be “Available”) 
	 */
	public int getFirstAvailable(double rent, int rooms)
	{
		for (int i = 0 ; i < numApts ; i++)
		{
			if (apts[i].getStatus().equalsIgnoreCase("Available"))
			{ 
			   if(apts[i].getRooms() == rooms && apts[i].getRent() <= rent)
				   return i;
			}
		}
		
		return -1;
	}

	/*
	rentApt: if the apartment status at index ‘i’ is “Available” then change it to “Occupied”. Otherwise,
	print error message “Apartment Already Rented”.
	*/
	
	public void rentApt(int i)
	{
		if (i >= 0 && i < numApts) //if the index is correct
		{
			if (apts[i].getStatus().equalsIgnoreCase("Available")) //if it a vailable
				apts[i].setStatus("Occupied");
			else
				System.out.println("Apartment Already Rented");
		}
		else
			System.out.println("ERROR index");
	}	

	public static void main(String[] args)
	{
	}
}