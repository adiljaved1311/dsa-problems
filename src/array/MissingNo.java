package array;

public class MissingNo 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16}; //10
		System.out.println(m1(a));
		System.out.println(m2(a));
	}
	
	public static int m1(int a[])
	{
		int arrSum = 0;
		int expSum = 0;
		for(int i=0;i<a.length;i++)
		{
			arrSum += a[i];
		}
		int l = a.length-1;
		expSum = a[l]*(a[l]+1)/2;
		int missingNo = expSum-arrSum;
		return missingNo;
	}
	
	public static int m2(int a[])
	{
		int missingNo = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] !=i+1 )
			{
				missingNo = i+1;
				break;
			}
		}
		return missingNo;
	}
}
