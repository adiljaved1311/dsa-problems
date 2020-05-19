package array;
import java.util.*;
public class ComposeRanges {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,5,8,9};   // [1->3, 5, 8->9]
		String[] st = composeRange(a);
		for(String s:st)
			System.out.print(s+", ");
	}
	public static String[] composeRange(int a[])
	{
		List<String> res = new ArrayList<>();
		
		for(int i=0; i<a.length; i++)
		{
			int start = a[i];
			while(i+1 < a.length && a[i]+1 == a[i+1] )
				i++;
			
			int end = a[i];
			String currentRange = "";
			if(start != end)
			{
				currentRange = start + "->" + end;
			}else
			{
				currentRange += start;
			}
			res.add(currentRange);
		}
		return res.toArray(new String[res.size()]);
	}
}
