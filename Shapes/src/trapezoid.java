
public class trapezoid implements Shape
{
	private double length;
	private double base;
	private double base2;
	private double length2;
	private double height;
		public double perimeter()
		{
			return(length + length2 + base + base2);
		}
		public double area()
		{
			return((base + base2)/2 * height);
		}
		public trapezoid( double length, double base, double base2, double length2, double height)
		{
			this.length = length;
			this.base = base;
			this.base2 = base2;
			this.length2 = length2;
			this.height= height;
		}
		public String toString() 
		{
			return "Rectangle Base: " + base + "Base 2:" + base2 + "Length: " + length + "Length 2: " + length2 + "Height: " + height + "Area: " + this.area() + " Perimeter: "
					+ this.perimeter();
		
		}
}