package LeetCode;

public class FirstPalindrome {

    public static String firstPalindrome(String[] words) {

        for(String s: words)
        {
            StringBuilder sb = new StringBuilder(s);
            if(sb.equals(sb.reverse()))
            {
                System.out.println(sb);
                return s;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String arr[]={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(arr));

    }
}
