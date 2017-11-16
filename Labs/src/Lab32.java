
public class Lab32 
{
	public static void main( String[] args)
	{
		String test1 = "ape";
		String test2 = "apple";
		System.out.println(test2.compareTo(test1));
	}
	public static String[] merge( String[] list1, String[] list2)
	{
		String[] output = new String[list1.length+list2.length];
		int nextIndexOutput = 0;
		for (String x : list1)
		{
			for (String y: list2)
			{
				if (x.compareTo(y)>0)
				{
					output[nextIndexOutput] = y;
					y = "zzzzzz{{{";
					nextIndexOutput++;
				}
			}
			output[nextIndexOutput] = x;
		}
		return output;
	}
}

