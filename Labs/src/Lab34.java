
public class Lab34 {
	
	public static void main( String[] args)
	{
		int[] test1= {2,5,8,3,6,1};
		partition(test1,0,test1.length-1);
		for(int x: test1)
		{
			System.out.print("["+ x +"]");
		}
		System.out.println();
		int[] test2 = {1,2,3,4};
		swapMethod(test2, 1,3);
		for(int x: test2)
		{
			System.out.print("["+ x +"]");
		}
	}
	public static void partition(int[] list1, int front, int back)
	{
		int positionPivot = front;
		int frontIndex = front+1;
		int backIndex = back;
		System.out.println(list1[frontIndex] +" " + list1[backIndex] + " " + list1[positionPivot]);
		boolean searchingBack = true;
		boolean searchingFront = false;
		while(backIndex>frontIndex)
		{
			if (list1[positionPivot]>list1[backIndex] && searchingBack)
			{
				int j = 0;
				j = positionPivot;
				positionPivot = backIndex;
				backIndex=j;
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
				frontIndex =j;
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
	}
	
	public static void swapMethod (int[] list, int pivotIndex, int index)
	{
		int dummy = list[index];
		list[index] = list[pivotIndex];
		list[pivotIndex] = dummy;
	}
}
