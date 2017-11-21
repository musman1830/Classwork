
public class Lab32 
{
	public static void main( String[] args)
	{
		String test1 = "ape";
		String test2 = "apple";
		//System.out.println(test2.compareTo(test1));
		String[] test3 = {"butter","food","pineapple","vaseline"};
		String[] test4 = {"apple","lasagna","lobsters","yoga"};
		String[] testProduct = merge(test3,test4);
		
		for (String x: testProduct)
		{
			System.out.print("["+x+"] ");
		}
		System.out.println("-----------------------------------");
		//String[] test5 = {"boogie","drake","kendrick","travis"};
		//String[] test6 = {"asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		String[] test5 = {"rocky"};
		String[] test6 = {"asap"};
		String[] testProduct2 = merge(test5,test6);
		
		
		for (String x: testProduct2)
		{
			System.out.print("["+x+"] ");
		}
		System.out.println("-----------------------------------");
		String[] testMergeSort = {"gum","soft","dog","clothes","pizza","nap","starbucks"};
		testMergeSort = mergeSort(testMergeSort);
		System.out.println("-------------------------");
		for (String x: testMergeSort)
		{
			System.out.print("["+x+"] ");
		}
		
	}
	public static String[] merge( String[] list1, String[] list2)
	{
		int amount = 0;
		String[] output = new String[list1.length+list2.length];
		int nextIndexOutput = 0;
		for (int y= 0; y<list1.length; y++)
		{
			//System.out.println(list1[y]+"compare");
			for (int i= 0; i<list2.length; i++)
			{
				//System.out.println(list2[i]+"words");
				if (list2[i]!=null && list1[y].compareToIgnoreCase(list2[i])>0)
				{
					output[nextIndexOutput] = list2[i];
					list2[i] = null;
					nextIndexOutput++;
					amount++;
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
			
				//System.out.println(nextIndexOutput);
				
			}
			output[nextIndexOutput] = list1[y];
			nextIndexOutput++;
			
			/*	if(y!= list1.length-1)
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
							output[nextIndexOutput-2]= list2[j];
							nextIndexOutput++;
						}
					}
				}
			*/
		}
		//System.out.println("last  " + nextIndexOutput);
		//System.out.println(output[nextIndexOutput]);
		if(amount < list2.length)
		{
			for(int a =0; a<list2.length; a++)
			{
				if(list2[a]!= null && list2[a].compareToIgnoreCase(list1[list1.length-1])>0)
				{
					//System.out.println(list2[a]);
					output[nextIndexOutput]= list2[a];
					nextIndexOutput++;
				}
			}
		}
		if (list1.length>1 && list2.length>1)
		{
			if (list1[list1.length-1].compareToIgnoreCase(list2[list2.length-1])<0)
			{
				output[output.length-1]=list2[list2.length-1];
			}
			else
			{
				output[output.length-1]=list1[list1.length-1];
			}
		}
		return output;
	}
	
	public static String[] mergeSort(String[] list)
	{
		if (list.length==2)
		{
			String[] x = {list[0]};
			String[] y = {list[1]};
			list = merge(x,y);
			
		}
		
		
		else	
		{
			String[] x = new String[list.length/2];
			for (int i = 0; i<list.length/2; i++)
			{
				x[i] = list[i];
			}
			for (String k: x)
			{
				System.out.print("["+k+"] ");
			}
			String[] y = new String[list.length/2];
			int i = 0;
			for (int j = (list.length/2) ; j<list.length; j++)
			{
				y[i] = list[j];
				i++;
			}
			for (String k: y)
			{
				System.out.print("["+k+"] ");
			}
			
			list = merge(mergeSort(x), mergeSort(y)); 
		}
		return list;
	}
}

