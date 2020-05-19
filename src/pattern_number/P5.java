package pattern_number;

public class P5 {

	public static void main(String[] args) 
	{
		p5(5);
	}
	public static void p5(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
*/