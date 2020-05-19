package questions;

public class PrintPrime 
{
	public static void main(String[] args) 
	{
		printPrime(11,19);
	}
	public static void printPrime(int r1,int r2)
	{
		
		for(int i=r1+1;i<r2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					++count;
				}	
			}
			if(count == 2) {
				System.out.print(i+" , ");
			}
		}
	}
}
