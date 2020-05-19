package pattern_star;

public class P3 
{
	public static void main(String[] args) 
	{
		int n=5;
		p3(n);
	}
	public static void p3(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
