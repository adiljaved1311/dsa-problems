package questions;

public class Armstrong {

	public static void main(String[] args) 
	{
		armstrong(152);
	}
	public static void armstrong(int n)
	{
		int num = n;
		int sum = 0;
		while(n != 0)
		{
			int n1 = n%10;
			sum = sum+(n1*n1*n1);
			n = n/10;
		}
		if(sum == num)
			System.out.println(num +" : Armstrong");
		else
			System.out.println(num +" : Not Armstrong");
	}
}
