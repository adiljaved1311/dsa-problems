package pattern_star;

public class P5 
{
	public static void main(String[] args) 
	{
		int n=5;
		p5(n);
	}
	public static void p5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}