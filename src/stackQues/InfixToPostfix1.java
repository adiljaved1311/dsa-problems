package stackQues;
import java.util.*;
public class InfixToPostfix1 {

	public static void main(String[] args) {
		String exp = "a+b*c-d/e+f-g";
		System.out.println(infixToPostfix(exp));  // abc*+de/-f+g-
	}
	// Priority
	// +,- -> 1
	// *,/ -> 2
	public static String infixToPostfix(String exp)
	{
		Stack<Character> st = new Stack<>();
		char arr[] = exp.toCharArray();
		String postfix = "";
		for(int i=0; i<arr.length; i++)
		{
			if(isOperator(arr[i]))
			{
				if(st.isEmpty()) 
				{
					st.push(arr[i]);
				}
				else
				{
					int current = priority(arr[i]);
					int in_stackTop = priority(st.peek());
					
					if(current <= in_stackTop)   // if lower precedence operator is inside the stack and higher is outside then push it 
					{    
						while(st.isEmpty() == false && current <= priority(st.peek()))
                        {
                            postfix += st.pop();   // if current operator is lower or equal to stack top operator then pop out
                        }                          // until the current operator is higher than stack top operator
                    }
                    st.push(arr[i]);  // if current operator is higher than stack top operator then push it 
				}	
			}else
			{
				postfix += arr[i];
			}	
		}
		while(st.isEmpty() == false) {
			postfix += st.pop();        // all remaining operators inside stack are pop out
		}
		
		return postfix;
	}
	
	private static boolean isOperator(char c)
	{
		if(c == '+' || c == '-' || c == '*' || c == '/')
			return true;
		else
			return false;
	}
	private static int priority(char c)
	{
		if(c == '+' || c == '-')
			return 1;
		else if(c == '*' || c == '/')
			return 2;
		else
			return 0;
	}
}
