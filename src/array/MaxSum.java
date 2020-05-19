package array;

public class MaxSum {

	public static void main(String[] args) 
	{
		// find sub array of having maxSum in a array
		int a[] = {-5,-2,7,6,-10};
		maxSum2(a);
	}
	public static void maxSum2(int a[])   // O(n)
	{
		int maxSum = a[0];
		int currentSum = maxSum;
		for(int i=1; i<a.length; i++)
		{
			if((a[i]+currentSum) > a[i])
				currentSum = a[i]+currentSum;
			else
				currentSum = a[i];
			
			if(maxSum < currentSum)
				maxSum = currentSum;
		}
		System.out.println(maxSum);
	}
	public static void maxSum1(int a[])   // O(n)
	{
		int maxSum = a[0];
		int currentSum = a[0];
		for(int i=1; i<a.length; i++)
		{
			currentSum = Math.max(a[i]+currentSum, a[i]);
			maxSum = Math.max(currentSum, maxSum);	
		}
		System.out.println(maxSum);
	}
}
