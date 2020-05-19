package array;

import java.util.*;
// given an array and a sum return the indices of the pairs having the sum in he array
public class SumPair {

	public static void main(String[] args) 
	{
		int a[] = {2,5,8,7,3,6};
		m1(a,10);
		System.out.println();
		m2(a,10);
	}
	public static void m1(int a[],int sum)  // O(n^2)
	{
		for(int i = 0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.print("("+a[i]+","+a[j]+"),");
				}
			}
		}
	}
	public static void m2(int a[],int sum)   // O(nlogn)
	{
		Arrays.sort(a);
		int left = 0, right = a.length-1;
		while(left<right)
		{
			int s = a[left]+a[right];
			if(s==sum) 
			{
				System.out.print("("+a[left]+","+a[right]+"),");
				left++;
				right--;
			}else if(s<sum)
				left++;
			else
				right--;
		}
	}
	public static void sumPair3(int a[],int sum)   // Time -> O(n) && Space -> O(n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++)
        {
            int diff = sum-a[i];
            if(map.containsKey(diff))
            {
                System.out.println(map.get(diff)+","+a[i]);
            }
            else
            {
                map.put(a[i],a[i]);
            }
        }
    }
}
