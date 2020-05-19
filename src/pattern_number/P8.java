package pattern_number;

public class P8 {

	public static void main(String[] args) 
	{
		p8(5);
	}
	public static void p8(int n)   // n = number of rows
	{
		int num = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n ;j++)
			{
				System.out.print(num); 
				num = num==1 ? 0 : 1;
			}
			System.out.println();
		}
	}
}
/*

10101
01010
10101
01010
10101

*/