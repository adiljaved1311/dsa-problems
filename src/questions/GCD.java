package questions;

public class GCD {
	public static void main(String[] args) 
	{
		int n1=20,n2=3;
		System.out.println("GCD of "+n1+" and "+n2+" is : "+gcd(n1,n2));
	}
	public static int gcd(int n1,int n2)
	{
		int rem=0;
		while(n1!=0)
		{
			rem = n2%n1;
			n2 = n1;
			n1 = rem;
		}
		return n2;
	}
}
