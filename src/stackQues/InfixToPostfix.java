package stackQues;
import java.util.*;
public class InfixToPostfix {

	public static void main(String[] args) {
		String exp = "a+b*c-d/e+f-g";
		System.out.println(infixToPostfix(exp));
	}
	
	public static String infixToPostfix(String exp)   // Priority -> *,/ -> +,-
	{
		Stack<Character> st = new Stack<>();
		char arr[] = exp.toCharArray();
		String postfix = "";
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] == '+' || arr[i] == '-')
			{
				if(st.isEmpty())
					st.push(arr[i]);
				else 
				{
					while(st.isEmpty() == false)
					{
						postfix += st.pop();    // if higher precedence operator is already present inside stack then pop out
					}
						st.push(arr[i]);
				}
			}	
			else if(arr[i] == '*' || arr[i] == '/')
			{
					if(st.isEmpty())
						st.push(arr[i]);
					else 
					{
						while(st.isEmpty() == false && st.peek() == '*' || st.peek() == '/')
						{
							postfix += st.pop();   // if higher precedence operator is already present inside stack then pop out
						}
							st.push(arr[i]);
			         }	
			}
			else 
				postfix += arr[i];   // if element is other than operator then add it into post fix
		}
		while(st.isEmpty() == false) {
			postfix += st.pop();        // all remaining operators inside stack are pop out
		}
		
		return postfix;
	}

}
