package recursion;

public class Factorial {

	public static void main(String[] args) 
	{
		System.out.println(factorial(4));
	}
	
	public static int factorial(int num)   // Time -> O(n)  &&  Space -> O(n) 
	{
		if(num == 0 || num == 1)
			return 1;
		return num*factorial(num-1);
	}
}
