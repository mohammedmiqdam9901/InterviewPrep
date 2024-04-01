package LeetCode;

import java.util.*;

public class TestGroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            // Convert the sorted character array back to a string
            String sortedStr = new String(charArray);

            // Check if the sorted string exists in the map
            if (!anagramMap.containsKey(sortedStr)) {
                // If the sorted string is not in the map, create a new list for it
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the list of anagrams
            anagramMap.get(sortedStr).add(str);
        }

        // Convert the values of the map to a list and return
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
}
