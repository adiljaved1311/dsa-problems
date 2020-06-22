package stackQues;

import java.util.Stack;

public class validParanthesis {

	public static void main(String[] args) {
		System.out.println(isValid("(])"));
		System.out.println(isValid("({[]})"));
	}
	
	 public static boolean isValid(String s)
	 {
		 Stack<Character> st = new Stack<>();  
		 
		 for(int i=0; i<s.length(); i++)
		 {
			 char c = s.charAt(i);
			 
			 if(c == '(' || c == '{' || c == '[')
				 st.push(c);
			 else if(c == ')' || c == '}' || c == ']'){
				 if(st.isEmpty())
					 return false;
				 else {
					 char top = st.peek();
					 if(c == ')' && top == '(')
						 st.pop();
					 else if(c == '}' && top == '{') 
						 st.pop();
					 else if(c == ']' && top == '[')
						 st.pop();
					 else
						 return false;
				 }
			 }
		 }
		 return st.isEmpty() ? true : false;
	}

}
