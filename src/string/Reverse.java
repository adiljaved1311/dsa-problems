package string;

public class Reverse {

	public static void main(String[] args) 
	{
		String s = "Rahul";
		System.out.println(reverse(s));
	}
	public static String reverse(String s)
	{
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c = s.charAt(i);
			s1 += Character.toString(c);
		}
		return s1;
	}
}
