package LeetCode;

public class Testing {

    public static boolean wordPattern(String pattern, String s) {

        String str[] = s.split(" ");

        int left =0;
        int right = pattern.length()-1;

        while(left < right)
        {
            if(pattern.charAt(left) == pattern.charAt(right))
            {
                String word1 = str[left];
                String word2 = str[right];
                if(!word1.equals(word2))
                    return false;
            }
            else if(pattern.charAt(left) != pattern.charAt(right))
            {
                String word1 = str[left];
                String word2 = str[right];
                if(word1.equals(word2))
                    return false;
            }

            left++;
            right--;

        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println(wordPattern("abba","dog cat cat dog"));

    }
}
