
public class Lab31 {
	public static void main(String[] args)
	{
		int[] test = {0,4,5,6,3,4,9};
		//System.out.println(remove(test,6));
		test = remove(test,3);
		for (int x:test)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		int[] test2 = {0,7,6,7,0,4,3,2};
		test2 = removeDuplicates(test2);
		
		for (int x:test2)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		int[] testp = {2,3,4};
		int[] testp2 = {1,2,3};
		int[][] productTest = productArray(testp,testp2);
		System.out.println(productTest[1][2]);
	}
	
	
	
	public static int[] removeDuplicates(int[] list)
	{
		for(int i=0;i<list.length;i++)
		{
			for(int j=i+1; j<list.length;j++)
			{
				if (list[i] ==list[j])
					list = remove(list,j);
			}
		}
		return list;
		
	}
	public static int[] remove(int []list, int x)
	{
		int[] newArray = new int[list.length-1];
		boolean isDeleted = false;
		for(int y=0; y<list.length; y++)
		{
			if (y==x)
				isDeleted= true;
			
			if(y!=x)
			{
				if(isDeleted)
					newArray[y-1] = list[y];
				
				else
					newArray[y] = list[y];
			}
		}
		return newArray;
	}
	public static int[][] productArray(int [] arr1, int[] arr2)
	{
		int[][] table;
		table = new int[arr1.length][arr2.length];
		//System.out.println(arr1[0] + " " + arr2[0]);
		for(int i=0; i<arr1.length; i++)
		{
			//System.out.println(arr1[i]);
			for (int j=0; j<arr2.length; j++)
			{
				//System.out.println(arr2[j]);
				table[i][j] = (arr1[i])*(arr2[j]);
			}
		}
		return table;
	}
	
}
