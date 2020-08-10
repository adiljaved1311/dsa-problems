package array;

// Given am array of natural numbers starting from 1 from which one number is missing find that number
public class MissingNo 
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,3,4,5}; //15 is missing
		System.out.println(m(a));
		//System.out.println(m2(a));
	}
	
	public static int m(int a[])
	{
		int sum = 0;
		int i;
		for(i=0; i<a.length; i++)
		{
			sum = sum + i - a[i];
		}
		sum = sum + i;
		return sum;
	}
	
	public static int m1(int a[])
	{
		int arrSum = 0;
		int expSum = 0;
		for(int i=0;i<a.length;i++)
		{
			arrSum += a[i];
		}
		int n = a.length-1;
		expSum = (a[n]*(a[n]+1))/2;
		int missingNo = expSum-arrSum;
		return missingNo;
	}
	
	// for sorted array an number can be start from anywhere
    public static int missingNumber2(int a[])
    {
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i]+1 != a[i+1])
                return a[i]+1;
        }
        return -1;
    }
    
	public static int m2(int a[])   // For sorted array where number start from 1
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
