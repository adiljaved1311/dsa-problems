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
//		System.out.println(reverseVowels("aA"));
		//test("<>ejd<");
		System.out.println(receivedText("HE*<LL>O12#2a><fd"));
		StringBuilder out = new StringBuilder("hjj");
		System.out.println(out.insert(0,"b"));
	}
	

    public static String receivedText(String S) {
    // WRITE DOWN YOUR CODE HERE
        //String output = "";
        StringBuilder out = new StringBuilder("");
        boolean numLock = true;
        boolean home = false;
        boolean end = true;
        for(int i=0; i<S.length(); i++)
        {
            char c = S.charAt(i);
            if(c == '<'){
                home = true;
                end = false;
            }else if(c == '>'){
                end = true;
                home = false;
            }else if(c == '*'){
                //output = output.substring(0,output.length()-1);
                out = new StringBuilder(out.substring(0,out.length()-1));
            }else if(c == '#'){
                numLock = true ? false : true;
            }else{
                if(end == true){
                    if(numLock == true)
                    	out.append(c);
                        //output += c;
                    else{
                        if(!(c >= 48 && c <= 57))
                            //output += c;
                        	out.append(c);
                    }
                }else{
                    if(numLock == true)
                        //output = c+output;
                    	out.insert(0,c);
                    else{
                        if(!(c >= 48 && c <= 57))
                            //output = c+output;
                        	out.insert(0,c);
                    }
                }    
            }
        }
        return out.toString();

    }

	
	public static void test(String s) {
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '<')
				System.out.println(c);
		}
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
