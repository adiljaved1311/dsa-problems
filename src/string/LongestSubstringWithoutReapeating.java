package string;
import java.util.*;
public class LongestSubstringWithoutReapeating {

	public static void main(String[] args) 
	{
		String s = "abcabcbb";   // 3
	}
	public static int longestSubstring(String s)
	{
		HashSet<Character> hs = new HashSet();
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			char c1 = s.charAt(i);
			for(int j=i+1; j<s.length(); j++)
			{
				char c2 = s.charAt(j);
				
			}	
		}
		return -1;
	}
}
