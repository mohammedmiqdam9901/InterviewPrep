package LeetCode;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramsMap.containsKey(sortedStr)) {
                anagramsMap.put(sortedStr, new ArrayList<>());
            }
            anagramsMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));

    }
}
