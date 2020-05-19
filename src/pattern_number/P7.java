package pattern_number;

public class P7 {

	public static void main(String[] args) 
	{
		p7(5);
	}
	public static void p7(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int num = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
	}
}
/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1
*/