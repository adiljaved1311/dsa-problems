package string;
import java.util.*;
public class TestString {

	public static void main(String[] args) 
	{
		String s = "azabebcscz";
		System.out.println(fnp1(s));
		System.out.println(fnp2(s));
		System.out.println(fnp3(s));
	}
	
	public static char fnp1(String s)
	{
		 for(int i=0; i<s.length(); i++)
		 {
			 char c = s.charAt(i);
			 if(s.indexOf(c) == s.lastIndexOf(c))
				 return c;
		 }
		 return 0;
	}
	
	public static char fnp2(String s)
	{
		int a[] = new int[255];
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int count = (int)s.charAt(i);
			a[count]++;
		}
		for(int i=0; i<a.length; i++)
		{
			char c = s.charAt(i);
			if(a[c] == 1)
				return c;
		}
		return 0;
	}
	
	public static char fnp3(String s)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}else
			{
				map.put(c,1);
			}
		}
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(map.get(c) == 1)
			{
				return c;
			}
		}
		return 0;
	}
}









