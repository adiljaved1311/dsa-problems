package companies.nagarro;

import java.util.*;

// Remove the duplicate characters if they occur more than once and remove all chars expect first occurred char

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "CSharpStarz";   // CSharptz
		System.out.println(removeDuplicates(input));
		System.out.println(removeDuplicates2(input));
	}
	
	public static String removeDuplicates(String input)   // Time -> O(n^2)
	{
		char str[] = input.toCharArray();                //  Space -> (c)  c -> no of characters in input String
		int index = 0;
		
		for(int i = 0; i< str.length; i++)
		{
			int j;
			for(j = 0; j<i; j++)
			{
				if(str[i] == str[j])
					break;
			}
			if(i == j)
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str,index));
	}
	
	public static String removeDuplicates2(String input)     //  Time  ->  O(n)  &&  SPace  ->  O(n)
	{
		HashSet<Character> set = new HashSet<>();
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < input.length() ; i++)
		{
			char c = input.charAt(i);
			if(set.add(c))
			{
				output.append(c);
			}
		}
		return output.toString();
	}
}
