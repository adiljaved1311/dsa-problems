package string;

public class CountChar {

	public static void main(String[] args) 
	{
		countChar("Rahaul",'a');
	}
	public static void countChar(String s,char c)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == c)
			{
				++count;
			}
		}
		System.out.println(c+" : "+count);
	}
}
