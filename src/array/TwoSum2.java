package array;
/*
  Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to
  a specific target number.

  The function twoSum should return indices of the two numbers such that they add up to the target, where index1 
  must be less than index2.
  
  Input: numbers = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/

public class TwoSum2 {
	public static void main(String[] args) {
		int a[] = {2,7,11,15};
		int b[] = twoSum2(a,9);
		for(int x:b)
			System.out.print(x+", ");
	}
	public static int[] twoSum2(int a[], int target)   // Time -> O(n)  && Space -> O(1)
	{
		int res[] = {-1,-1};
		int left = 0;
		int right = a.length-1;
		while(left < right)
		{
			int sum = a[left]+a[right];
			if(sum == target)
			{
				res[0] = left;
				res[1] = right;
				return res;
			}else if(sum < target)
				left++;
			else
				right--;
		}
		return res;
	}
}
