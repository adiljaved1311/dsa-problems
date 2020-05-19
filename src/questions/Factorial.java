package questions;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int n=4;
		System.out.println("Factorial of "+n+" is : "+ factorial(n));
	}
	public static int factorial(int n)
	{
		int fact = 1;
		for(int i=2;i<=n;i++)
		{
			fact *= i;
		}
		return fact;
	}
}
