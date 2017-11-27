
public class Lab33
{
	public static void main( String[] args)
	{
		int[] test1 = {7,3,5};
		insertionSort(test1);
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
		moveOver(test2, 0);
		for(int x: test2)
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
				int dummy= list1[i+1];
				moveOver(list1, j+1);
				list1[j+1]= dummy;
				
			}
		}
		
	}
	public static void moveOver(int[]array, int x)
	{
		int nextNum= array[x];
		for(int y=x; y<array.length-1; y++)
		{
			int dummy = array[y+1];
			array[y+1]= nextNum;
			nextNum = dummy;
		}
	}
	
}
