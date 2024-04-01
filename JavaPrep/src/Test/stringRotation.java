package Test;

import java.util.LinkedList;
import java.util.Queue;

public class stringRotation {

    public static String rotateString(String s, int k)
    {
        if(s.length() == 0 || k < 0)
            return s;

        Queue<Character> queue = new LinkedList<>();

        for(char x : s.toCharArray())
        {
            queue.offer(x);
        }

        for(int i =0; i < k;i++)
        {
            char temp =queue.poll();
            queue.offer(temp);
        }

        StringBuilder rotatedString = new StringBuilder();
        while(!queue.isEmpty())
        {
            rotatedString.append(queue.poll());
        }

        return rotatedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcd",2));

    }
}
