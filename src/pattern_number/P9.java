package pattern_number;

public class P9 {

	public static void main(String[] args) 
	{
		p9(5);
	}
	public static void p9(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int num = 1;
			for(int j=1; j<=i; j++)
			{
				System.out.print(num);
				num = num==1 ? 0 : 1;
			}
			System.out.println();
		}
	}
}
/*

1
10
101
1010
10101

*/