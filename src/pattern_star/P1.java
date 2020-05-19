package pattern_star;

public class P1 
{
	public static void main(String[] args) 
	{
		int n=5;
		p1(n);
	}
	public static void p1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
    *
   * *
  * * *
 * * * *
* * * * *

 for(int i=0;i<n;i++)
		{
			for(int j=n-2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
*/