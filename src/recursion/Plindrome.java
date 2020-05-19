package recursion;

public class Plindrome {

	public static void main(String[] args) 
	{
		int a[] = {1,2,5,2,1};
		System.out.println(palindrome(a,0,a.length-1));
	}
	public static boolean palindrome(int a[],int left,int right)
	{
		if(left == right)
			return true;
		
		if(right - left == 1)
			return a[left]==a[right];
		
		if(a[left] == a[right] && palindrome(a,++left,--right))
			return true;
		
		return false;
	}
}
