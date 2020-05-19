package questions;

public class SquareRoot {

	public static void main(String[] args) 
	{
		System.out.println(squareRoot1(400));
	}
	public static int squareRoot(int num)
	{
		for(int i=1; i<num; i++)
		{
			if(i*i == num)
				return i;
			if(i*i>num)
				break;
		}
		return -1;
	}
	public static int squareRoot1(int num)
	{
		int i=1;
		while(true)
		{
			if(i*i == num)
				return i;
			if(i*i >num)
				return -1;
			i++;
		}
	}
}
