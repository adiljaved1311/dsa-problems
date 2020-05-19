package questions;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		int n = 145;     // 145 = 1! + 4! + 5!
		strong(n);
	}
	public static void strong(int n)
	{
		int fact=1;
		int num =n;
		int sum=0;
		while(n!=0)
		{
			int n1=n%10;
			n = n/10;
			for(int i=2;i<=n1;i++)
			{
				fact = fact*i;
			}
			sum += fact;
			fact=1;
		}
		if(sum==num)
			System.out.println(num+" is Strong Number");
		else
			System.out.println(num+" is not Strong Number");
	}
}
