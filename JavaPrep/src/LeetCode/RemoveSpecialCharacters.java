package LeetCode;

public class RemoveSpecialCharacters {

    public static boolean isPalindrome(String s) {
        String palindromeString = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(palindromeString);

        StringBuilder sb = new StringBuilder(palindromeString);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);

        if(palindromeString.equalsIgnoreCase(reversed))
        {
            return true;
        }

        return false;


    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }


}
