package classwork;
import java.util.List;
import java.util.Collections;


public class removeNums {
	public static void main(String [] args)
	{
		
	}
	public static List<Integer>removesDupes(List < Integer > nums)
	{
		Collections.sort(nums);
		for(int i =0; i<nums.size(); i++)
		{
			for(int x=0; x<nums.size(); x++)
			{
				remove(x);
				
				
			}
			i--;
		}
		return List;
	}
	private static void remove(int x) {
		
	}
}
