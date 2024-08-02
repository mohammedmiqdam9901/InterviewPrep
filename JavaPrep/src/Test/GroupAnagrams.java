package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {


    public static List<List<String>> groupAnagrams(List<String> ls)
    {
        HashMap<String,List<String>> hm = new HashMap<>();
        List<List<String>> resultantList = new ArrayList<>();

        for(String s: ls)
        {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);

            String sortedString = new String(ch);

            if(!hm.containsKey(sortedString))
            {
                ArrayList<String> ar = new ArrayList<>();
                ar.add(s);
                hm.put(sortedString, ar);
            }
            else
            {
                List<String> arr = hm.get(sortedString);
                arr.add(s);

            }
        }

        for(String key: hm.keySet())
        {
            resultantList.add(hm.get(key));
        }

        return resultantList;


    }

    public static void main(String[] args) {
        String array[] = {"eat","tea","tan","ate","nat","bat"};
        List<String> arl = Arrays.asList(array);
        System.out.println(groupAnagrams(arl));

    }
}
