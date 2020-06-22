package array;
import java.util.*;
public class DuplicatesNick 
{
	public static void main(String[] args) 
	{
		int a[] = {4,3,2,7,8,2,3,1};   // 1<= a[i] <=a.length (Find all element that appear twice)
		//firstDuplicate(a);
		allDuplicates(a);
		//System.out.println(fDuplicate(a));
		//System.out.println(firstDuplicate2(a));
		//List<Integer> l = dup(a);
		//System.out.println(l);
	}
	public static void firstDuplicate(int a[])   // O(n)
	{
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) 
		{
			if(hs.add(a[i])==false)
			{
				System.out.println(a[i]+" : is First Duplicate");
				return;
			} 
		}
	}
	public static int fDuplicate(int a[])   // O(n^2)
	{
		int index = a.length;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					index = Math.min(index,j);
				}
			}
		}
		if(index == a.length)
			return -1;
		else
			return a[index];
		//System.out.println("First Duplicate Element : "+a[index]);
	}
	public static int firstDuplicate2(int a[])  // O(n)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[Math.abs(a[i])-1]<0)
				return Math.abs(a[i]);
			else
				a[Math.abs(a[i])-1] = -a[Math.abs(a[i])-1];
		}
		return -1;
	}
	public static void allDuplicates(int a[])   // O(n logn)
	{
		Arrays.sort(a);
		System.out.print("Duplicates : ");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i] == a[i+1])
			{
				System.out.print(a[i]+" , ");
			}
		}
		System.out.println();
	}
	public static List<Integer> dup(int a[])   // O(n)
	{  // 4,3,2,7,8,2,3,1
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<a.length; i++)
		{
			int index = Math.abs(a[i])-1;
			if(a[index]<0)
				list.add(index+1);
			
			a[index] = -a[index];
		}
		return list;
	}
}
