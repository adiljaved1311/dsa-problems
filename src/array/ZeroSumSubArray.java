package array;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
		int input1[] = {100,200,0,-50,10,40,20};
		int result[] = zeroSum2(input1);
		System.out.println("Start -> "+result[0]+" End -> "+result[1]);
		int input2[] = {0,0,-12,12,1,5,6,-12,10};
		int result2[] = zeroSum1(input2);
		System.out.println("Start -> "+result2[0]+" End -> "+result2[1]);
	}
	// Time ->  O(n) // Space -> O(n)
	public static int[] zeroSum1(int a[]) {                      
		HashMap<Integer,Integer> arr_sum = new HashMap<>();
		int sum= 0;
		int result[] = {-1,-1};
		int start = 0, end = 0, current_len = 0,len_arr = 0;
		arr_sum.put(0,-1);
		for(int i=0; i<a.length; i++){
			sum += a[i];
			if(arr_sum.containsKey(sum)){
				len_arr = (result[1]-result[0])+1;
				start = arr_sum.get(sum)+1;
				end = i;
				current_len = (end-start)+1;
				if(current_len > len_arr){
					result[0] = start;
					result[1] = end;
				}
			}
			if(! arr_sum.containsKey(sum)) {
			   arr_sum.put(sum,i);	
			}  
		}
		return result;
	}
	
	public static int[] zeroSum2(int a[])                      // Time ->  O(n)
	{                                                         // Space -> O(n)
		HashMap<Integer,Integer> arr_sum = new HashMap<>();
		int sum= 0;
		int result[] = {-1,-1};
		arr_sum.put(0,-1);
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
			if(sum == 0 || arr_sum.containsKey(sum))
			{
				result[0] = arr_sum.get(sum)+1;
				result[1] = i;
				//System.out.println("Start -> "+result[0]+" End -> "+result[1]);
				return result;
			}
			arr_sum.put(sum,i);	
		}
		//System.out.println("No subArray is present with zero sum");
		return result;
	}
	
	
	
	
	public static void zeroSumK(int a[],int k)                      // Time ->  O(n)
	{                                                              // Space => O(n)
		HashMap<Integer,Integer> arr_sum = new HashMap<>();
		int sum= 0;
		int count = 0;
		boolean b = false;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
			
			if(sum == 0 || arr_sum.containsKey(sum-k))
			{
				//System.out.println("True");
				b = true;
				count++;
			}else
			arr_sum.put(sum,i);
		}
		count--;
		if(b == false)
		System.out.println("False");
		else {
			System.out.println("Count : "+count);
		}
	}
}
