package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class StringRotation {


    public static String stringRotation(String s, int k)
    {
        Queue<Character> queue = new LinkedList<>();

        if(s.isEmpty() || k == 0)
            return s;

        for(char ch : s.toCharArray())
        {
            queue.offer(ch);
        }

        for(int i =0; i < k ; i++)
        {
            char ch = queue.poll();
            queue.offer(ch);
        }

        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty())
        {
            sb.append(queue.poll());
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(stringRotation("abcd",2));
    }
}
