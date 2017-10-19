
public class Circle implements Shape 
{
	private double radius;
	private double pi = 3.14;
	public Circle (double radius)
	{
		this.radius = radius;
	}

	public double perimeter()
	{
		return 2*pi*radius;
	}
	public double area()
	{
	return pi *radius* radius;	
	}
	public String toString() 
	{
		
		return "Circle radius:" + radius +"Area:" + this.area() + "Perimeter:" + this.perimeter();
	}
}
