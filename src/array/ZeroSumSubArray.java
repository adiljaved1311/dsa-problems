package array;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
//		int input1[] = {100,200,0,-50,10,40,20};
//		int result[] = zeroSum1(input1);
//		System.out.println("Start -> "+result[0]+" End -> "+result[1]);
//		
//		int input2[] = {0,0,-12,12,1,5,6,-12,10};
//		int result2[] = zeroSum1(input2);
//		System.out.println("Start -> "+result2[0]+" End -> "+result2[1]);
//		
		int input3[] = {1,0,2,-5,2,3,5};
		zeroSum3(input3);
		
		
	}
	// For Finding Largest sub-array having sum 0
	// Time ->  O(n) // Space -> O(n)
	public static int[] zeroSum1(int a[]) {                      
		HashMap<Integer,Integer> arr_sum = new HashMap<>();
		int sum= 0;
		int result[] = {-1,-1};
		int start = 0, end = 0, current_len = 0,len_arr = 0;
		arr_sum.put(0,-1);
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
			if(sum == 0 || arr_sum.containsKey(sum))
			{
				len_arr = (result[1]-result[0])+1;
				start = arr_sum.get(sum)+1;
				end = i;
				current_len = (end-start)+1;
				if(current_len > len_arr)
				{
					result[0] = start;
					result[1] = end;
				}
			}
			if(! arr_sum.containsKey(sum)) 
			{
			   arr_sum.put(sum,i);	
			}  
		}
		return result;
	}
	
	// For finding any sub-array with sum 0
	public static int[] zeroSum2(int a[])                            // Time ->  O(n)
	{                                                               // Space -> O(n)
		HashMap<Integer,Integer> arr_sum = new HashMap<>();
		int sum= 0;
		int result[] = {-1,-1};
		arr_sum.put(0,-1);
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
			if(sum == 0|| arr_sum.containsKey(sum))
			{
				result[0] = arr_sum.get(sum)+1;
				result[1] = i;
				return result;
			}
			arr_sum.put(sum,i);	
		}
		return result;
	}
	
	// print all the Sub-arrays having sum zero
	public static void zeroSum3(int a[])
	{
		HashMap<Integer,Integer> arr_sum = new HashMap<>();
		arr_sum.put(0,-1);
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
			if(sum == 0 || arr_sum.containsKey(sum))
			{
				int l1 = arr_sum.get(sum)+1;
				int l2 = i;
				System.out.println(l1+", "+l2);
			}
			arr_sum.put(sum,i);
		}
	}
}
