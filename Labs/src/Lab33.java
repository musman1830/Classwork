
public class Lab33
{
	public static void main( String[] args)
	{
		/*int[] test1 = {7,3,5,4,5,9,8};
		insertionSort(test1);
		System.out.println("");
		for(int x: test1)
		{
			System.out.print("["+ x +"]");
		}
		int[] test2= new int[5];
		test2[0]=3;
		test2[1]=2;
		test2[2]=1;
		test2[3]=0;
		System.out.println("-----");
		System.out.println();
		moveOver(test2, 0, 1);
		
		for(int x: test2)
		{
			System.out.print("["+ x +"]");
		}
		
		System.out.println("-----");
		System.out.println();
		double[] test3= {3,2,2,4,2,5,4,7,9,8};
		selectionSort(test3);
		for(double x: test3)
		{
			System.out.print("["+ x +"]");
		}
		*/
		String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		bubbleSort(test4);
		for(String x: test4)
		{
			System.out.print("["+ x +"]");
		}
	}
	public static void insertionSort(int[] list1)
	{
		for (int i=0; i<list1.length-1; i++)
		{
			
				
			
				System.out.println(list1[i]+"major");
				if (list1[i+1]<list1[i])
				{
					boolean foundPlace= false;
					int j = i;
				
					while(!foundPlace)
					{
						if(j==-1)
						{
							foundPlace=true;
							System.out.println("Found start" + j);
						}
						else if(list1[j]<list1[i+1])
						{
							System.out.println("Found bigger" + list1[j]);
							foundPlace=true;
						}
						else
						{
							j--;
						}
					
					}
					System.out.println("i="+ i+ " " + list1[i+1]);
					int dummy= list1[i+1];
					System.out.println(dummy + "dummy");
					moveOver(list1, j+1,i+1);
				
					list1[j+1]= dummy;
					for(int x: list1)
					{
						System.out.print("["+ x +"]");
					}
				}
			}
		
		
	}
	public static void moveOver(int[]array, int x, int z)
	{
		int nextNum= array[x];
		for(int y=x; y<z; y++)
		{
			int dummy = array[y+1];
			array[y+1]= nextNum;
			nextNum = dummy;
		}
	}
	public static void selectionSort(double [] list1)
	{
		for(int i=0; i<list1.length; i++)
		{
			double smallest = list1[i];
			for(int j=i+1;j<list1.length; j++)
			{
				if(smallest>list1[j])
				{
					double dummy = list1[i];
					smallest = list1[j];
					list1[j]= dummy;
					
					
				}
				
			}
			list1[i]= smallest;
		}
	}
	public static void bubbleSort(String[] list1)
	{
		boolean swapZero = false;
		while(!swapZero)
		{
			int numSwap=0;
			for(int i=0; i<list1.length-1; i++)
			{
				
				if((list1[i].compareToIgnoreCase(list1[i+1]))>0)
				{
					String dummy= list1[i];
					list1[i]=list1[i+1];
					list1[i+1]=dummy;
					numSwap++;
					
				}
			}
			if(numSwap==0)
			{
				swapZero=true;
			}
		}
	}
}
