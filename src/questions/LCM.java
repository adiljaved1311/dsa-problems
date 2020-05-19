package questions;

public class LCM {

	public static void main(String[] args) 
	{
		System.out.println(lcm(12,6));
	}
	public static int lcm(int n1, int n2)
	{
		int lcm = n1>=n2 ? n1 : n2;
		int temp = lcm;
		int i = 1;
		while(true)
		{
			if((lcm %n1 == 0) && (lcm %n2 == 0))
			{
				return lcm;
			}
			lcm = temp*(++i);
		}
	}
}
