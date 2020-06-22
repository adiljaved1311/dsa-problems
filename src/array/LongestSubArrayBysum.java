package array;

public class LongestSubArrayBysum {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,0,0,0,6,8,9};
		int sum = 15;
		a = longestSubArray(a,sum);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static int[] longestSubArray(int a[],int s) // return the starting and ending index
	{
		int [] result = new int[] {-1};
		int sum=0;
		int left=0;
		int right=0;
		
		while(right < a.length)
		{
			sum += a[right];
			while(left<right && sum>s)
			{
				sum -= a[left];
				left++;
			}
			if(sum == s &&(result.length == 1 || result[1] - result[0] < right-left))
				result = new int[] {left,right}; //0,4  0,7
			
			right++;
		}
		return result;
	}
}
