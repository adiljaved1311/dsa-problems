package array;
// check whether the given array is Palindrome or not
public class Palindrome {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,7,3,2,1};
		System.out.println(palindrome3(a));
	}
	
	public static boolean palindrome1(int a[])  // space -> O(n) & time -> O(n)
	{
		int b[] = new int[a.length];
		for(int i=a.length-1,j=0; i>=0; i--,j++)
		{
			b[j] = a[i];
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != b[i])
				return false;
		}
		return true;
	}
	
	public static boolean palindrome2(int a[])  // space -> O(1) & time -> O(n)
	{
		int left = 0, right = a.length-1;
		while(left < right)
		{
			if(a[left] != a[right])
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean palindrome3(int a[])  // Time -> O(n) & Space -> O(1);
	{
		for(int i=0; i<a.length/2; i++)
		{
			if(a[i] != a[a.length-1-i])
				return false;
		}
		return true;
	}
}
