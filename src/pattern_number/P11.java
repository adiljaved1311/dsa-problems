package pattern_number;

public class P11 {

	public static void main(String[] args) 
	{
		p11(5);
	}
	public static void p11(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int num = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(num+" ");
				num = num+n-j;
			}
			System.out.println();
		}
	}
}
/*

1
2 6  
3 7 10
4 8 11 13
5 9 12 14 15

*/
