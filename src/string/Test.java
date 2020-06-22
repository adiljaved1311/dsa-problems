package string;
import java.util.*; 
public class Test 
{
	public static void main(String[] args) 
	{
//		String s = "afabacec";
//		m1(s);
//		m2(s);
//		m3(s);
		System.out.println(reverseVowels("aA"));
	}
	
	public static String reverseSmallVowels(String s) {
        char c[] = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i < j)
        {
            if(
                ((c[i] == 'a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u'))
                &&((c[j] == 'a')||(c[j]=='e')||(c[j]=='i')||(c[j]=='o')||(c[j]=='u'))
              ) 
            {
            	char temp = c[i];
            	c[i] =c[j];
            	c[j] = temp;
            	i++;
            	j--;
            }else if(((c[i] == 'a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u'))
                    && ((c[j] != 'a')&&(c[j]!='e')&&(c[j]!='i')&&(c[j]!='o')&&(c[j]!='u'))
                    )
            {
                 j--;
            }else if(((c[i] != 'a')&&(c[i]!='e')&&(c[i]!='i')&&(c[i]!='o')&&(c[i]!='u'))
                    && ((c[j] == 'a')||(c[j]=='e')||(c[j]=='i')||(c[j]=='o')||(c[j]=='u'))
                    )
            {
                 i++;
            }
            else{
                i++;
            }
            	
        }
        String str = new String(c);
        return str;
    }
	public static String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i < j)
        {
        	if(isVowel(c[i]) && isVowel(c[j]))
        	{
        		char temp = c[i];
            	c[i] =c[j];
            	c[j] = temp;
            	i++;j--;
        	}else if(isVowel(c[i]) && !isVowel(c[j]))
        	{
        		j--;
        	}else if(! isVowel(c[i]) && isVowel(c[j]))
        	{
        		i++;
        	}else
        	{
        		i++;
        	}
        }
        String str = new String(c);
        return str;
	}    
    
	private static boolean isVowel(char c) {
		if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
			return true;
		return false;
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
