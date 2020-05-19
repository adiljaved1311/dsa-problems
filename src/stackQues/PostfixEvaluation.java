package stackQues;
import java.util.*;
public class PostfixEvaluation {

	public static void main(String[] args) {
		String ques = "4*4/2+6-1+2";
		int result = postfixEvaluation(ques);
		System.out.println(result);
	}
	
	public static int postfixEvaluation(String exp)
	{
		exp = InfixToPostfix1.infixToPostfix(exp);  // convert infix to post fix
		Stack<Integer> st = new Stack<>();
		int left,right,result;
		
		for(int i=0; i<exp.length(); i++)
		{ 
			char c = exp.charAt(i);
			if(isOperand(c))         // if it is operand/Number then push it into stack
			{
				int num = c - '0';   // convert characters to numbers
				st.push(num);
			}else                    // if it is operator then pop out 2 elements and perform operation on them
			{
				right = st.pop();    // first element pop out
				left = st.pop();     // second element pop out
				if(c == '+')
				{
					result = left+right;
					st.push(result);
				}
				else if(c == '-')
				{
					result = left-right;
					st.push(result);
				}
				else if(c == '*')
				{
					result = left*right;
					st.push(result);
				}
				else if(c == '/')
				{
					result = left/right;
					st.push(result);
				}
			}
		}
		result = st.pop();
		return result;
	}
	
	private static boolean isOperand(char s)
	{
		if(s == '+' || s == '-' || s == '*' || s == '/')
			return false;
		else
			return true;
	}
}
