package questions;

public class Swap {

	public static void main(String[] args) 
	{
		int x=105;
		int y=145;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
