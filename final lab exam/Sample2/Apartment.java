package week15;

public class Apartment
{
	private int id;
	private int rooms;
	private double rent;
	private String status;

	public Apartment()
	{
		id = -1;
		rooms = 1;
		rent = -1;
		status = "Available";
	}

	public Apartment(int id, int rooms, double rent, String status)
	{
		this.id = id;
		setRooms(rooms);
		this.rent = rent;
		setStatus(status);
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getRooms()
	{
		return rooms;
	}

	public void setRooms(int rooms)
	{
		if (rooms >= 1 && rooms <= 4)
			this.rooms = rooms;
		else
			this.rooms = 1;
	}

	public double getRent()
	{
		return rent;
	}

	public void setRent(double rent)
	{
		this.rent = rent;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		if (status.equals("Available") || status.equals("Occupied"))
			this.status = status;
		else
			this.status = "Available";
	}

	public String toString()
	{
		return id + ", " + rooms + ", " + rent + ", " + status;
	}
}