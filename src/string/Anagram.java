package string;

import java.util.*;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "stop";
		String s2 = "pots";
		System.out.println(isAnagram1(s1,s2));
		System.out.println(isAnagram3(s1,s2));
	}
	
	    public static boolean isAnagram1(String s, String t) {  // Time -> O(n)  & Space -> O(n)
	        HashMap<Character,Integer> map1 = new HashMap<>();
	        HashMap<Character,Integer> map2 = new HashMap<>();
	        if(s.length() == t.length())
	        {
	            for(int i=0; i<s.length(); i++)
	            {
	                char c = s.charAt(i);
	                if(map1.containsKey(c))
	                {
	                    map1.put(c,map1.get(c)+1);
	                }else
	                {
	                    map1.put(c,1);
	                }
	            }
	            for(int i=0; i<t.length(); i++)
	            {
	                char c = t.charAt(i);
	                if(map2.containsKey(c))
	                {
	                    map2.put(c,map2.get(c)+1);
	                }else
	                {
	                    map2.put(c,1);
	                }
	            }
	            for(int i=0; i<s.length(); i++)
	            {
	                char c = s.charAt(i);
	                if(map1.get(c) != map2.get(c))
	                {
	                    return false;
	                }
	            }
	            return true;
	        }else
	        {
	            return false;
	        }
	    }
	
	    public static boolean isAnagram2(String s, String t) { // T->O(nlogn) S->O(n)
	        if (s.length() != t.length()) {
	            return false;
	        }
	        char[] str1 = s.toCharArray();
	        char[] str2 = t.toCharArray();
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	        return Arrays.equals(str1, str2);
	    }
	    
	    public static boolean isAnagram3(String s, String t) {  //  T->O(n)  // Space -> O(1)
	        if (s.length() != t.length()) {
	            return false;
	        }
	        int[] counter = new int[26];
	        for (int i = 0; i < s.length(); i++) {
	            counter[s.charAt(i) - 'a']++;
	            counter[t.charAt(i) - 'a']--;
	        }
	        for (int count : counter) {
	            if (count != 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	
}
