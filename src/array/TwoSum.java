package array;
import java.util.*;
//  Given an array of integers, return indices of the two numbers 
//  such that they add up to a specific target.
//  
//   You may assume that each input would have exactly one solution,
//   and you may not use the same element twice

//   Given nums = [2, 7, 11, 15], target = 9,
//   Because nums[0] + nums[1] = 2 + 7 = 9,
//   return [0, 1].

public class TwoSum {

	public static void main(String[] args) 
	{
		int a[] = {2,7,11,15,3,16,3,9,9};
		//int b[] = twoSum2(a,18);

		List<List<Integer>> list = twoSum4(a,18);
		for(List<Integer> l:list)
		{
			for(int i=0; i<l.size(); i++)
			{
				System.out.print(l.get(i)+" ");
			}
			System.out.println();
		}
	}
	public static int[] twoSum1(int a[],int target)    // T-> O(n^2) and S->O(1)
	{
		int res[] = {-1,-1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]+a[j]) == target)
				{
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}
	
	//Another approach by using hashmap
	public static int[] twoSum2(int a[],int target)     //T-> O(n) and S-> O(n)
	{
		int res[] = {-1,-1};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++)
		{
			int diff = target-a[i];
			if(map.containsKey(diff)) 
			{
				res[0] = map.get(diff);
				res[1] = i;
			}else
			{
				map.put(a[i],i);
			}
		}
		return res;
	}
	
	
	
	public static List<List<Integer>> twoSum3(int a[],int target)     //T-> O(n) and S-> O(n)
	{
		// 2,7,11,3,15     target = 18    Output = {1,2}, {3,4}           
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++)
		{
			int diff = target-a[i];
			if(map.containsKey(diff)) 
			{
				l1.add(map.get(diff));
				l1.add(i);
				l2 = List.copyOf(l1);
				list.add(l2);
				l1.clear();
			}else
			{
				map.put(a[i],i);
			}
		}
		return list;
	}
	
	public static List<List<Integer>> twoSum4(int a[],int target)     //No Duplicate Pairs
	{
		// 2,7,11,15,3,16,3,9    target = 18    Output = {1,2}, {3,4} {0,5} {7,8}        
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		int diff=0;
		
		for(int i=0; i<a.length; i++){
			diff = target-a[i];
			if(map.containsKey(a[i]) == true){
				if(diff == a[i]){
				l1.add(map.get(diff));      // Time - > O(n)
				l1.add(i);                  // Space -> O(n)
				l2 = List.copyOf(l1);
				list.add(l2);
				l1.clear();
				}
				//continue;
			}
			else if(map.containsKey(diff)) {
				l1.add(map.get(diff));
				l1.add(i);
				l2 = List.copyOf(l1);
				list.add(l2);
				l1.clear();
			}
				map.put(a[i],i);
		}
		return list;
	}
}











