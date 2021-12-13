package week16;

public class Point
{
	private double x;
	private double y;
	
	public double getX()
	{
		return x;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double distance(Point p)
	{
		double xs = Math.pow(p.x - this.x, 2);
		double ys = Math.pow(p.y - this.y, 2);
		
		return Math.sqrt(xs + ys);
	}
}