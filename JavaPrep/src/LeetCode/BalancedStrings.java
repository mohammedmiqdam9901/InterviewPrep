package LeetCode;

public class BalancedStrings {

    public static int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (int i =0; i < s.length();i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }

            // Check if the substring is balanced
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
