package array;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,3,4,4,5,6,6};
		System.out.println(removeDuplicates(a));
	}
	public static int removeDuplicates(int a[])
	{
		int len = a.length;
		int i = 0;
		if(len <= 1)
			return len;
		for(int j=1; j<len; j++)
		{
			if(a[j] != a[i])
			{
				a[++i] = a[j];
			}
		}
		return i+1;
	}
}
