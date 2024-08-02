package LeetCode;

import java.util.HashSet;

public class LongestSubString {

    public static String lengthOfLongestSubstring(String s) {

        int startPointer = 0;
        int endPointer = 0;
        int max = 0;
        String longestSubstring = "";

        HashSet<Character> hm = new HashSet<>();

        while(endPointer < s.length())
        {
            if(!hm.contains(s.charAt(endPointer)))
            {
                hm.add(s.charAt(endPointer));
                endPointer++;
                if(endPointer - startPointer > max)
                {
                    max = endPointer - startPointer;
                    longestSubstring = s.substring(startPointer,endPointer);
                }
            }
            else
            {

                hm.remove(s.charAt(startPointer));
                startPointer++;
            }
        }

        return longestSubstring;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcb"));
    }
}
