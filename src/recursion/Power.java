package recursion;

public class Power {

	public static void main(String[] args) 
	{
		System.out.println(power(2,7));
		System.out.println(power2(2,7));
	}
	
	public static int power(int x, int y)
	{
		if(y == 0)
			return 1;
		if(y == 1)
			return x;
		if(y%2 == 0)
		    return power(x,y/2)*power(x,y/2);
		else
			return power(x,y/2)*power(x,y/2)*power(x,1);
		
	}
	public static int power2(int x, int y)
	{
		if(y == 0)
			return 1;
		if(y == 1)
			return x;
		if(y%2 == 0)
			return power2(x*x,y/2);
		else
			return x*power2(x*x,(y-1)/2);
	}
}
