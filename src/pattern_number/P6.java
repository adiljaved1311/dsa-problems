package pattern_number;

public class P6 {

	public static void main(String[] args) 
	{
		p6(5);
	}
	public static void p6(int n)
	{
		for(int i=n; i>=1; i--)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/