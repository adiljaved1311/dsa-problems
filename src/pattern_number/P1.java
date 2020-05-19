package pattern_number;

public class P1 {

	public static void main(String[] args) 
	{
		p1(5);
	}
	public static void p1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/
