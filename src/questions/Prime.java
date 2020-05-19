package questions;

public class Prime 
{
	public static void main(String[] args) 
	{
		int n = 2;
		prime(n);
	}
	public static void prime(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i==0) 
			{
				System.out.println(n+" : Not Prime");
				return;
			}
		}
		System.out.println(n+" : Prime");
	}
}
