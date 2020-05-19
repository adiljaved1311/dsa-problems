package questions;

public class Palindrome {

	public static void main(String[] args) 
	{
		palindrome(10301);
	}
	public static void palindrome(int n)
	{
		int num = n;
		int temp = 0;
		while(n != 0)
		{
			int n1 = n%10;
			temp = (temp*10)+n1;
			n = n/10;
		}
		if(temp == num)
			System.out.println(num+" : Palindrome");
		else
			System.out.println(num+" : Not Palindrome");
	}
}
