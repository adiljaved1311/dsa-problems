package tavant;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "{[[]]}";
        System.out.println(isBalancedParanthesis(s));
    }
    private static boolean isBalancedParanthesis(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0 ;i <s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                st.push(c);
            }else if(c == ']' || c == '}' || c == ')'){
                if(st.empty()){
                    return false;
                }else{
                    char c1 = st.peek();
                    if(c1 == '[' && c == ']')
                        st.pop();
                    else if(c1 == '{' && c == '}')
                        st.pop();
                    else if(c1 == '(' && c == ')')
                        st.pop();
                    else
                        return false;
                }
            }
        }
        return st.empty() ? true : false;
    }
}
