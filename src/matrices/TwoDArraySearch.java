package matrices;

public class TwoDArraySearch {

	public static void main(String[] args)    // Given an sorted array row wise and column wise both you have a find 
	{                                         // a given number in the array
		int a[][] = {{10,20,30},
				    {40,50,60},
				    {70,80,90}};
		search(a,50);
	}
	
	public static void search(int a[][],int num)
	{
		int i = 0;
		int j = a.length-1;
		while(i<a.length && j>=0)
		{
			if(num == a[i][j])
			{
				System.out.println(i+" , "+j);
				return;
			}
			if(num > a[i][j])
				i++;
			else
				j--;
		}
		System.out.println("Number not Found");
	}
}
