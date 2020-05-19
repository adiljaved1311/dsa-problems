package string;

public class ToUpper {

	public static void main(String[] args) 
	{
		System.out.println(toUpper("rahUl"));
	}
	public static String toUpper(String s)
	{
		String s1= "";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>=97 && c<= 65)
			c -= 32;
			s1 += Character.toString(c);
		}
		return s1;
	}
}
