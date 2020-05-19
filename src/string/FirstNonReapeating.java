package string;
import java.util.*;
public class FirstNonReapeating {

	public static void main(String[] args) 
	{
		String s = "agbcaczbccb";
		System.out.println(firstNonReapeating1(s));
		System.out.println(firstNonReapeating2(s));
		System.out.println(firstNonReapeating3(s));
		System.out.println(firstNonReapeating4(s));
	}
	public static char firstNonReapeating1(String s)  // O(n^2)
	{
		for(int i=0;i<s.length();i++)
		{
			boolean b = false;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j) && (i != j))
				{
					b = true;
					break;
				}
			}
			if(b == false)
			{
				return s.charAt(i);
			}
		}
		return '_';
	}
	public static char firstNonReapeating2(String s)  // T-> O(n)  & S-> O(n)
	{
		HashMap<Character,Integer> charCount = new HashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(charCount.containsKey(c))
			{
				charCount.put(c,charCount.get(c)+1);
			}else
			{
				charCount.put(c,1);
			}
		}
		for(int i=0; i<s.length();i++)
		{
			char c = s.charAt(i);
			if(charCount.get(c) == 1)
				return c;
		}
		return '_';
	}
	public static char firstNonReapeating3(String s)  //O(n)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
			{
				return s.charAt(i);
			}
		}
		return '-';
	}
	public static char firstNonReapeating4(String s)  // Time -> O(n)	// space -> O(1)
	{
		int charCount[] = new int[26];
		for(char c: s.toCharArray())
		{
			charCount[c-'a']++;
		}
		for(char c: s.toCharArray())
		{
			if(charCount[c-'a'] == 1)
				return c;
		}
		return '_';
	}
}
