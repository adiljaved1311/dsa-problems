package questions;

public class CheckBinary {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = a-(-b);
		System.out.println(c);
		checkBinary(100110110);
	}
	public static void checkBinary(int n)
	{
		while(n!=0)
		{
			int n1 = n%10;
			if(n1!=0 && n1!=1)
			{
				System.out.println("Not Binary");
				return;
			}
			n = n/10;
		}
		System.out.println("Binary");
	}
}
