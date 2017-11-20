
public class Lab32 
{
	public static void main( String[] args)
	{
		String test1 = "ape";
		String test2 = "apple";
		System.out.println(test2.compareTo(test1));
		String[] test3 = {"butter","food","pineapple","vaseline"};
		String[] test4 = {"apple","lasagna","lobsters","yoga"};
		String[] testProduct = merge(test3,test4);
		
		for (String x: testProduct)
		{
			System.out.print("["+x+"] ");
		}
		System.out.println("-----------------------------------");
		String[] test5 = {"boogie","drake","kendrick","travis"};
		String[] test6 = {"asaprocky","cardib","uzi","xxxtentacion"};
		String[] testProduct2 = merge(test5,test6);
		
		for (String x: testProduct2)
		{
			System.out.print("["+x+"] ");
		}
		
	}
	public static String[] merge( String[] list1, String[] list2)
	{
		String[] output = new String[list1.length+list2.length];
		int nextIndexOutput = 0;
		for (int y= 0; y<list1.length; y++)
		{
			System.out.println(list1[y]+"compare");
			for (int i= 0; i<list2.length; i++)
			{
				System.out.println(list2[i]+"words");
				if (list1[y].compareToIgnoreCase(list2[i])>0)
				{
					output[nextIndexOutput] = list2[i];
					list2[i] = "zzzzzz";
					nextIndexOutput++;
				}
				/*
				if (list1[y].compareToIgnoreCase(list2[i])<0 && y==list1.length-1 && y==list1.length-1)
				{
					output[nextIndexOutput] = list1[i];
					nextIndexOutput++;
					
					for (int j = i+1; j<list2.length-1; j++)
					{
						output[nextIndexOutput] = list2[j];
						nextIndexOutput++;
					}
					
				}*/
			
				System.out.println(nextIndexOutput);
				
			}
				if(y!= list1.length-1)
				{	
					output[nextIndexOutput] = list1[y];
					nextIndexOutput++;
				}
				if(y == list1.length-1)
				{
					for(int j= 0; j<list2.length; j++)
					{
						if(list1[y].compareToIgnoreCase(list2[j])<0)
						{
							output[nextIndexOutput]= list2[j];
							nextIndexOutput++;
						}
					}
				}
			
		}
		if (list1[list1.length-1].compareToIgnoreCase(list2[list2.length-1])<0)
		{
			output[output.length-1]=list2[list2.length-1];
		}
		else
		{
			output[output.length-1]=list1[list1.length-1];
		}
		return output;
	}
}

