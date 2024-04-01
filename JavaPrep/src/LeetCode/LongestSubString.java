package LeetCode;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        String overallLongest = "";
        String currentSubstring = "";

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            int charIndexInSubstring = currentSubstring.indexOf(currentChar);
            if (charIndexInSubstring == -1) {
                // Character is not in the currentSubstring, add it
                currentSubstring += currentChar;
            } else {
                // Character is already in the currentSubstring, update overallLongest
                overallLongest = (currentSubstring.length() > overallLongest.length()) ? currentSubstring : overallLongest;
                // Move the index to the next position after the repeated character
                i = charIndexInSubstring + 1;
                currentSubstring = "";
            }
        }

        // Check one more time after the loop ends
        overallLongest = (currentSubstring.length() > overallLongest.length()) ? currentSubstring : overallLongest;

        return overallLongest.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcb"));
    }
}
