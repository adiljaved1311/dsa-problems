package array;
import java.util.*;

// Given two Arrays and a sum you have to return true if the sum numbers present one from first array and another
// from second array otherwise if not then return false;
public class SumOfTwo 
{
	public static void main(String[] args) 
	{
		int a[] = {0,0,-5,30212};
		int b[] = {-10,40,-3,9};
		int v = -8;
		
		System.out.println(sumOfTwo1(a,b,v));
		System.out.println(sumOfTwo2(a,b,v));
	}
	public static boolean sumOfTwo1(int []a, int []b, int v)   // O(n^2)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if((a[i]+b[j])==v)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static boolean sumOfTwo2(int[]a, int[]b, int v) // O(m) where m<n do loop for small array 
	{
		HashSet<Integer> diff = new HashSet<>();
		for(int i:a)
		{
			int d = v-i;
			diff.add(d);
		}
		for(int i:b)
		{
			if(diff.contains(i))
				return true;
		}
		return false;
	}
}
