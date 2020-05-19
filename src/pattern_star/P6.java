package pattern_star;

public class P6 {

	public static void main(String[] args) 
	{
		p6(5);
	}
	public static void p6(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*

     *
    **
   ***
  ****
 *****
******

*/