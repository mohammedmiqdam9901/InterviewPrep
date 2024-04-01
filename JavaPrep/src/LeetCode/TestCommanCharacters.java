package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class TestCommanCharacters {

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        if (words == null || words.length == 0) {
            return result;
        }

        // Initialize the map to store character counts for the first word
        Map<Character, Integer> charCountMap = getCharCount(words[0]);

        // Iterate through the remaining words
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentCharCountMap = getCharCount(words[i]);

            // Update the charCountMap by taking the minimum count for each character
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                char ch = entry.getKey();
                int countInCurrentWord = currentCharCountMap.getOrDefault(ch, 0);
                int minCount = Math.min(entry.getValue(), countInCurrentWord);
                charCountMap.put(ch, minCount);
            }
        }

        // Convert the charCountMap to a list of characters based on their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int j = 0; j < count; j++) {
                result.add(String.valueOf(ch));
            }
        }

        return result;
    }

    private static Map<Character, Integer> getCharCount(String word) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        String[] words1 = {"bella", "label", "roller"};
        System.out.println("Example 1 Output: " + commonChars(words1));

        String[] words2 = {"cool", "lock", "cook"};
        System.out.println("Example 2 Output: " + commonChars(words2));
    }
}
