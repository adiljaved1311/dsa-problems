package pattern_number;

public class P10 {

	public static void main(String[] args) 
	{
		p10(5);
	}
	public static void p10(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int num = i;
			for(int k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=n-i; j++)
			{
				System.out.print(num++ +" ");
			}
			System.out.println();
			
		}
		
		for(int i=2; i<=n; i++)
		{
			int num = n-i;
			for(int k=n; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(++num +" ");
			}
			System.out.println();
		}
	}
}
/*

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

*/