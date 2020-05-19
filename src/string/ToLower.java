package string;

public class ToLower {

	public static void main(String[] args) 
	{
		System.out.println(toLower("RaHuL"));
	}
	public static String toLower(String s)
	{
		String s1 = "";
		for(int i=0; i<s.length(); i++)   //65+25 = 90
		{
			char c = s.charAt(i);
			if(c <= 'Z' && c >= 'A')
			{
			  c += 32;	
			}
			s1 += Character.toString(c);
		}
		return s1;
	}
}
