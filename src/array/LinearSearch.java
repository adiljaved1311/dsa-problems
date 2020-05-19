package array;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[] = {1,2,8,65,1,4,6,7};
		System.out.println(linearSearch(a,4));
	}
	public static int linearSearch(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				return i;
			}
		}
		return -1;
	}
}
