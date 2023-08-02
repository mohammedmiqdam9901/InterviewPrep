package Test;

import java.util.Stack;

public class MinimimInsertionBalancedParenthesis {

    public static void makingBalancedParenthesis(String s)
    {
        Stack<Character> st = new Stack<>();

        for(Character c :s.toCharArray())
        {
            if(st.isEmpty() && c == ')')
                st.add(c);
            else if(!st.isEmpty() && c == ')' && st.peek() =='(')
                st.pop();
            else
                st.add(c);

        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        makingBalancedParenthesis("())(())))");
    }
}
