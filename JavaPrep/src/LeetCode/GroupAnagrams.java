package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> resultAnagrams = new ArrayList<>();

        for(int i =0; i < strs.length; i++)
        {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            List<String> currentAnagrams = new ArrayList<String>();
            currentAnagrams.add(strs[i]);
            for(int j = i+1; j < strs.length; j++)
            {
                char arrNext[] = strs[j].toCharArray();
                Arrays.sort(arrNext);

                if(Arrays.equals(arr,arrNext))
                    currentAnagrams.add(strs[j]);
            }

            resultAnagrams.add(currentAnagrams);

        }

        return resultAnagrams;

    }

    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));

    }
}
