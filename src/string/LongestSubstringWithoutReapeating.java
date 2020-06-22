package string;
import java.util.*;
public class LongestSubstringWithoutReapeating {

	public static void main(String[] args) 
	{
		String s = "dvdf";   // 3
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static String lengthOfLongestSubstring(String s) {
        int current_range = 0;
        int max_range = 0;
        String tempResult = "";
        String result = "";
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
        	int k = i;
            while(k<s.length() && set.add(s.charAt(k)))
            {
            	tempResult += s.charAt(k);
                k++;
                current_range++; 
            }
            set.clear();
            if(max_range < current_range)
            {
                max_range = current_range;
                result = tempResult;
            }
            current_range = 0;
            tempResult = "";
        }
        return result;
        //return max_range;
    }
}
