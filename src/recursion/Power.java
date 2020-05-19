package recursion;

public class Power {

	public static void main(String[] args) 
	{
		System.out.println(power(2,6));
	}
	public static int power(int x, int y)
	{
		if(y == 0)
			return 1;
		
		if(y == 1)
			return x;
		
		int z = 0;
		if(y%2 == 0)
		    z = power(x,y/2)*power(x,y/2);
		else
			z = power(x,y/2)*power(x,y/2)*power(x,1);
		
		y = y/2;
		return z;
	}
}
