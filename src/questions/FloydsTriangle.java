package questions;

public class FloydsTriangle {

	public static void main(String[] args) 
	{
		flyod(5);
	}
	public static void flyod(int n)
	{
		int k=1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}
