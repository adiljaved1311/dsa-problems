package questions;

public class FibRecurrsion 
{
	public static void main(String[] args) 
	{
		System.out.println(fib(3));
	}
	// 1 1 2 3 5 8 13 21 34
	
	public static int fib(int n)
	{
		int result = 0;
		if(n == 0)
			return 0;
		if(n == 1 || n == 2)
			result = 1;
		else
			result = fib(n-1)+fib(n-2);
			return result;
	}
}
