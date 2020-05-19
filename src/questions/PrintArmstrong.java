package questions;

public class PrintArmstrong 
{
	public static void main(String[] args) 
	{
		printArmstrong(1,500);
	}
	public static void printArmstrong(int n1,int n2)
	{
		for(int i=n1+1;i<n2;i++)
		{
			int sum = 0;
			int num = i;
			while(num!=0)
			{
				int n = num%10;
				sum = sum+(n*n*n);
				num = num/10;
			}
			if(sum == i)
				System.out.print(i+" ,");
		}
	}
}
