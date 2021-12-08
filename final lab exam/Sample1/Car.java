package week15;

public class Car
{
	private int id;
	private String model;
	private int year;
	private double price;

	public Car()
	{
		id = -1;
		year = -1;
		price = -1;
		model = "NA";
	}
	
	public Car(int id, String model, int year, double price)
	{
		this.id = id;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void dispaly()
	{
		 System.out.println("ID    : " + id);
		 System.out.println("Year  : " + year);
		 System.out.println("Model : " + model);
		 System.out.println("Price : " + price);
		 System.out.println("-----------------------------------");
	}
}