package Test;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean checkingBalancedParenthesis(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
                return false;
            else if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
            {
                st.add(s.charAt(i));

            }

            else
            {
                if(s.charAt(i) == '}' && st.peek() == '{'|| s.charAt(i) == ']' && st.peek() == '[' || s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if(st.empty())
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(checkingBalancedParenthesis("]{[]}"));

    }
}
