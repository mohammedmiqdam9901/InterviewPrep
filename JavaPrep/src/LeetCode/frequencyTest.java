package LeetCode;

public class frequencyTest {

    public static boolean canBeEqualFrequency(String word) {
        int[] frequency = new int[26];

        // Count the frequency of each character
        for (char ch : word.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Check each character's frequency after removing it
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            frequency[index]--;

            if (isValidFrequency(frequency)) {
                return true;
            }

            frequency[index]++;
        }

        return false;
    }

    public static boolean isValidFrequency(int[] frequency) {
        int nonZeroCount = 0;
        int nonZeroFrequency = 0;

        for (int count : frequency) {
            if (count > 0) {
                nonZeroCount++;
                nonZeroFrequency = count;
            }
        }

        return nonZeroCount <= 1 || (nonZeroCount == 2 && nonZeroFrequency == 1);
    }

    public static void main(String[] args) {
        System.out.println(canBeEqualFrequency("abcc"));
    }
}
