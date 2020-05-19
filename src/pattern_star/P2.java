package pattern_star;

public class P2 
{
	public static void main(String[] args) 
	{
		int n=5;
		p2(n);
	}
	public static void p2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
