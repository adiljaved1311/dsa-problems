package pattern_number;

public class P2 {

	public static void main(String[] args) 
	{
		p2(5);
	}
	public static void p2(int n)
	{
		int k=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
