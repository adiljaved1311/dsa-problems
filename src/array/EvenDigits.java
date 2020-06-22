package array;

//	Given an array numbers of integers, return how many of them contain an even number of digits.
//			 Example 1:
//
//			Input: numbers = [12,345,2,6,7896]
//			Output: 2
//			Explanation: 
//			12 contains 2 digits (even number of digits). 
//			345 contains 3 digits (odd number of digits). 
//			2 contains 1 digit (odd number of digits). 
//			6 contains 1 digit (odd number of digits). 
//			7896 contains 4 digits (even number of digits). 
//			Therefore only 12 and 7896 contain an even number of digits.

public class EvenDigits 
{	
	public static void main(String[] args) 
	{
		int a[] = {12,345,2,6,7896};
		System.out.println(findNumbers(a));
		System.out.format("Adil","Javed");
	}
	public static int findNumbers(int a[])
	{
		int count_result = 0;
		for(int i=0; i<a.length; i++)
		{
			int num = a[i];
			int count_num = 0;
			while(num != 0)
			{
				num = num/10;
				count_num++;
			}
			if(count_num % 2 == 0)
			{
				count_result++;
			}
		}
		return count_result;
	}
}
