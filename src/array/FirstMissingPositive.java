package array;
import java.util.*;
/*
  Given an unsorted integer array, find the smallest missing positive integer.
  Input: [1,2,0]       Output: 3
  Input: [3,4,-1,1]    Output: 2
  Input: [7,8,9,11,12] Output: 1
*/
public class FirstMissingPositive {

	public static void main(String[] args) {
		int a[] = {1,2,0};
		System.out.println(firstMissingPositive(a));
	}
	public static int firstMissingPositive(int a[])
	{
		if(a.length == 0)
			return 1;
		HashSet<Integer> set = new HashSet<>();
		for(int x:a)
			set.add(x);
		for(int i=1; i<a.length ;i++)
		{
			if(set.contains(i) == false)
				return i;
		}
		return a.length;
	}
}
