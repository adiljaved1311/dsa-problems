package questions;

public class Power {

	public static void main(String[] args) 
	{
		System.out.println(power(3,14));
		System.out.println(power1(3,14));
	}
	public static int power(int x, int y)  // O(log n)
	{
		if( x == 0)
			return 1;
		if( y == 1)
			return x;
		int z = 0;
		if( y%2 == 0)
		{
			z = power(x,y/2) * power(x,y/2);
		}
		if( y%2 !=0 )
		{
			z = power(x,y/2)*power(x,y/2)*power(x,1);
		}
		return z;
	}
	public static int power1(int x, int y)
	{
		int temp = x;
		while(y != 0)
		{
			if(y%2 == 0)
			{
				temp = temp*temp;
				y = y/2;
			}
			else
			{
				temp = temp*temp + (x);
				y = y/2;
			}
		}
		return temp;
	}
}
