package pattern_star;

public class P4 
{
	public static void main(String[] args) 
	{
		int n=5;
		p4(n);
	}
	public static void p4(int n)
	{
		int num = 1;
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=num; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			num = num+2;
		}
		int num2 = 9;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=num2; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			num2 = num2-2;
		}
	}
}
/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/