
public class Circle implements Shape 
{
	private double rad;
	private double pi = 3.14;
	public Circle (double rad)
	{
		this.radius = rad;
	}

	public double Circumference()
	{
		return 2*pi*rad;
	}
	public double Area()
	{
		
	}
}