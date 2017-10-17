
public class ShapeRunner 
{	public static void main( String [] args)
	{
		Rectangle rect1 = new Rectangle(5,3);
		Circle circ1 = new Circle(3);
		if(rect1.perimeter() > circ1.perimeter())
		{
			System.out.print("Rectangle has larger perimeter");
		}
		else if (rect1.periemter() < circ1.periemter())
		{
			System.out.print("Circle has larger circumference");
		}
		else
		{
			System.out.print("Circumference is the same as the perimeter");
		}
	
	}

}
