package questions;

public class TwoDArraySearch {

	public static void main(String[] args) 
	{
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
