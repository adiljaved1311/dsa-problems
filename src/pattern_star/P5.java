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
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}