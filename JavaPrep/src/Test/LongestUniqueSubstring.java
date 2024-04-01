package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestUniqueSubstring {

    public static void findingLongestUniqueSubstring(String s)
    {
        Set<String> uniqueSubstring = new HashSet<>();
        for(int i=0; i< s.length(); i++)
        {
            for(int j=i+1; j<=s.length();j++)
            {
                String subString = s.substring(i,j);
                uniqueSubstring.add(subString);
            }
        }
        int currentLength =-1;
        List<String> LongestuniqueSubstrings = new ArrayList<>();

        for(String x: uniqueSubstring)
        {
            Set<Character> uniqueSub = new HashSet<>();
            int max_length = 0;
            for(Character w :x.toCharArray())
            {
                if(!uniqueSub.contains(w))
                    max_length++;
                    uniqueSub.add(w);
            }
            if(x.length() == max_length )
            {
                if(x.length() >=currentLength)
                {
                    LongestuniqueSubstrings.add(x);
                    currentLength =x.length();

                }

            }

        }

        System.out.println(LongestuniqueSubstrings.toString());

    }

    public static void main(String[] args) {

        findingLongestUniqueSubstring("abadsb");

    }
}
