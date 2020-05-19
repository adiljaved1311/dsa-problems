package matrices;

public class Search {

	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3,4},
				     {5,6,7,8},
				     {9,10,11,12}};
		int num = 17;
		System.out.println(search1(num,a));
		System.out.println(search2(num,new int[]{1,2}));
	}
	public static boolean search1(int num,int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j] == num)
					return true;
			}
		}
		return false;
	}
	public static boolean search2(int num, int a[])
	{
		for(int i=0; i<a.length;i++)
		{
			
		}
		return false;
	}
}
