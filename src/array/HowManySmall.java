package array;
import java.util.*;
// Given the array nums, for each nums[i] find out 
// how many numbers in the array are smaller than it. That is, 
// for each nums[i] you have to count the number of valid j's 
// such that j != i and nums[j] < nums[i].
// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]

public class HowManySmall {

	public static void main(String[] args) 
	{
		int a[] = {8,1,2,2,3};  
		int b[] = howmanySmaller1(a);
		for(int x:b)
			System.out.print(x+", ");
	}
	
	public static int[] howmanySmaller1(int []a)   // T-> O(n^2)  S->O(n)
	{
		int res[] = new int[a.length];
		int count = 0;
		int index = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i] > a[j] && i != j)
					count++;
			}
			res[index++] = count;
			count = 0;
		}
		return res;
	}
	
	// Second Approach by using Map
	public static int[] howmanySmaller2(int a[])  // 8,1,2,2,3
	{
		int res[] = new int[a.length];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++)
		{
			map.put(a[i], i);
			
		}
		
		return res;
	}
}






