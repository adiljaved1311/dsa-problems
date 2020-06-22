package string;
import java.util.*;
public class ListAnagram {

	public static void main(String[] args) 
	{
		List<String> dictionary = new ArrayList<>();
		dictionary.add("bsg");
		dictionary.add("bat");
		dictionary.add("hack");
		dictionary.add("chak");
		
		List<String> query = new ArrayList<>();
		query.add("sbg");
		query.add("atb");
		query.add("hack");
		
		List<Integer> anagram = listAnagram(dictionary,query);
	
		for(int x:anagram)
			System.out.print(x+" ");
	}
	
	public static List<Integer> listAnagram(List<String> dictionary, List<String> query)
	{
		List<Integer> list = new ArrayList<>();
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<dictionary.size(); i++) 
		{
			dictionary.set(i,sorted(dictionary.get(i)));
		}
		for(int i=0; i<query.size(); i++) 
		{
			query.set(i,sorted(query.get(i)));
		}
		for(int i=0;i<dictionary.size();i++)
		{
			String s = dictionary.get(i);
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);
			}else
			{
				map.put(s,1);
			}
		}
		for(int i=0;i<query.size();i++)
		{
			String s = query.get(i);
			if(map.containsKey(s))
			{
				list.add(map.get(s));
			}else
			{
				list.add(0);
			}
		}
		return list;
	}
	
	public static String sorted(String s) {
		char c[] = s.toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder();
		for(char ch:c)
			sb.append(ch);
		return sb.toString();
	}

}
