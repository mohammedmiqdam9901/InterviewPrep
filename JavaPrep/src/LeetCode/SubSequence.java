package LeetCode;

public class SubSequence {

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;

        // Iterate through t
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            // If characters match, move sIndex to the next character
            if (sIndex < s.length() && s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
        }

        // If sIndex has reached the end of s, then s is a subsequence of t
        return sIndex == s.length();
    }


    public static void main(String[] args) {
        System.out.println(isSubsequence("ab","bab"));

    }
}
