package Test;

import java.util.HashSet;

public class longestSubstring {

    public static String gettingLongestSubstring(String s)
    {
        String longestSubstringTillNow = "";
        String longestSubstringOverall = "";

        HashSet set = new HashSet();

        for(int i=0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            if(set.contains(c))
            {
                longestSubstringTillNow = "";
                set.clear();
            }
            longestSubstringTillNow = longestSubstringTillNow + c;
            set.add(c);

            if(longestSubstringTillNow.length() > longestSubstringOverall.length())
            {
                longestSubstringOverall = longestSubstringTillNow;
            }

        }

        return longestSubstringOverall;

    }


    public static void main(String[] args) {

        System.out.println(gettingLongestSubstring("abccefgh"));

    }
}
