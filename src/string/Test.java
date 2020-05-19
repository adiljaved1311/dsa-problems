package string;
import java.util.*; 
public class Test 
{
	public static void main(String[] args) 
	{
		String s = "afabacec";
		m1(s);
		m2(s);
		m3(s);
	}
	public static void m1(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
				return;
			}
		}
	}
	public static void m2(String s)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0 ; i<s.length(); i++)
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
			if(map.get(c)==1)
			{
				System.out.println(c);
				return;
			}
		}
	}
	public static void m3(String s)
	{
		int a[] = new int[26];
		for(char c:s.toCharArray())
		{
			a[c-'a']++;
		}
		for(char c:s.toCharArray())
		{
			if(a[c-'a']==1)
			{
				System.out.println(c);
				return;
			}
		}
	}
}
