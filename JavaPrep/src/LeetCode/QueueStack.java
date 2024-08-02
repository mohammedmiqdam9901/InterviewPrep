package LeetCode;

import java.util.Stack;

public class QueueStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void push(int element)
    {
        s1.push(element);
    }

    public static int pop()
    {
        while(!s1.isEmpty())
        {
            s2.add(s1.pop());
        }
        int ans = s2.pop();

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

        return ans;
    }

    public static void main(String[] args) {
        push(2);
        push(3);
        push(4);

        System.out.println(pop());

    }
}
