package stack;

public class Q1 {

	public static void main(String[] args) 
	{
		Stack st = new Stack();
		String s = "1+2";
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			while(c != '+' || c != '-')
			{
				st.push(c);
			}
		}
	}
}
