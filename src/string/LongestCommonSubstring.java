package string;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String s1 = "zxabcdezy";
		String s2 = "yzabcdezx";   // o/p -> abcdez
		System.out.println(longestCommonSubstring(s1,s2));
	}
	public static String longestCommonSubstring(String s1, String s2)
	{
		String substring = "";
		String temp = "";
		int k = 0;
		for(int i=0; i<s1.length(); i++)
		{
			k = i;
			char c1 = s1.charAt(i);
			for(int j=0; j<s2.length(); j++)
			{
				char c2 = s2.charAt(j);
				if(c1 == c2)
				{
					while((k<s1.length() && j < s2.length()) && (s1.charAt(k) == s2.charAt(j)))
					{
						temp += s1.charAt(k);
						k++;j++;
					}
				}
				if(substring.length() < temp.length())
					substring = temp;
				temp = "";
			}
		}
		if(substring == "")
			return "-";
		return substring;
	}
}
