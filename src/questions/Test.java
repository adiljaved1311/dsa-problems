package questions;
import static java.lang.Math.*;
public class Test 
{
	public static void main(String[] args) 
	{
		binaryToDecimal(101);
		fibonacci(9);
		lcm(5,6);
		hcf(25,30);
		swap(14,21);
		printPrime(1,100);
		strong(146);
		printArmStrong(1,500);
	}
	public static void binaryToDecimal(int n)
	{
		int sum = 0,i=0;
		while(n != 0)
		{
			int n1 = n%10;
			sum += (n1*pow(2,i));
			i++;
			n = n/10;
		}
		System.out.println(sum);
	}
	public static void fibonacci(int n)
	{
		int a=0,b=1,c=a+b;
		if(n==0)
			System.out.println("Oth Fibonacci : "+a);
		else
		{
			for(int i=2;i<=n;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(n+"th Fibonacci : "+c);
		}
	}
	public static void lcm(int a, int b)
	{
		int lcm = a>b ? a : b;
		while(true)
		{
			if(lcm%a == 0 && lcm%b == 0)
			{
				System.out.println("Lcm of "+a+" & "+b+" is : "+lcm);
				return;
			}
			lcm++;
		}
	}
	public static void hcf(int a, int b)
	{
		int rem = 0;
		while(a != 0)
		{
			rem = b % a;
			b = a;
			a = rem;
		}
		System.out.println("Hcf is : "+b);
	}
	public static void swap(int a,int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = "+a+" b = "+b);
	}
	public static void printPrime(int r1, int r2)
	{
		System.out.print("Prime No.s : ");
		for(int i=r1+1; i<r2; i++)
		{
			int count = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
					++count;
			}
			if(count == 2)
			{
				System.out.print(i+", ");
			}
			count = 0;
		}
		System.out.println();
	}
	public static void strong(int n)
	{
		int num=n,sum=0;
		while(num != 0)
		{
			int n1 = num % 10;
			int fact = 1;
			for(int i=2; i<=n1; i++)
			{
				fact = fact*i;
			}
			sum += fact;
			fact = 1;
			num = num/10;
		}
		if(sum == n)
			System.out.println(n+" is Strong No.");
		else
			System.out.println(n+" is not Strong No.");
	}
	public static void printArmStrong(int r1, int r2)
	{
		System.out.print("ArmStrong No.s : ");
		for(int i=r1+1; i<r2; i++)
		{
			int sum=0,num=i;
			while(num != 0)
			{
				int n1 = num%10;
				sum = sum+(n1*n1*n1);
				num = num/10;
			}
			if(sum == i)
				System.out.print(i+", ");
		}
		System.out.println();
	}
}











