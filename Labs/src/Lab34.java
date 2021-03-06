
public class Lab34 {
	
	public static void main( String[] args)
	{
		/*int[] test1= {5,2,8,1,9,6,0};
		partition(test1,0,test1.length-1);
		for(int x: test1)
		{
			System.out.print("["+ x +"]");
		}
		System.out.println(partition(test1,0,test1.length-1));
		System.out.println();
		int[] test2 = {1,2,3,4};
		swapMethod(test2, 1,3);
		for(int x: test2)
		{
			System.out.print("["+ x +"]");
		}
		*/
		int[] test3={6,5,8,3,9,10,4};
		//int positionPivot = partition(test3,0,4);
		//System.out.println(positionPivot);
		quickSort(test3,0,test3.length-1);
		for(int x: test3)
		{
			System.out.print("["+ x +"]");
		}
	}
	public static int partition(int[] list1, int front, int back)
	{
		int positionPivot = front;
		int frontIndex = front+1;
		int backIndex = back;
		//System.out.println(list1[frontIndex] +" " + list1[backIndex] + " " + list1[positionPivot]);
		boolean searchingBack = true;
		boolean searchingFront = false;
		while(backIndex>frontIndex)
		{
			//System.out.println("random");
			if (list1[positionPivot]>list1[backIndex] && searchingBack)
			{
				int j = 0;
				j = positionPivot;
				positionPivot = backIndex;
				//backIndex=j;
				swapMethod(list1, j, positionPivot);
				
				frontIndex= j+1;
				searchingBack = false;
				searchingFront = true;
			}
			else if (searchingBack && list1[positionPivot]<list1[backIndex])
			{
				backIndex--;
			}
			if (list1[positionPivot]<list1[frontIndex] && searchingFront)
			{

				
				int j = 0;
				j = positionPivot;
				positionPivot = frontIndex;
				//frontIndex =j;
				swapMethod(list1, j, positionPivot);
			
				backIndex = j-1;
				searchingBack=true;
				searchingFront=false;
			}
			else if (searchingFront && list1[positionPivot]>list1[frontIndex])
			{
				frontIndex++;
			}
			
		}
		return positionPivot;
	}
	
	public static void swapMethod (int[] list, int pivotIndex, int index)
	{
		int dummy = list[index];
		list[index] = list[pivotIndex];
		list[pivotIndex] = dummy;
	}
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front==back)
		{
			System.out.println("front");
		}
		else
		{
			System.out.println("else statement");
			int positionPivot = partition(list1,front,back);
			quickSort(list1,front,positionPivot);
			quickSort(list1,positionPivot+1,list1.length-1);
			
		}
	}
}
