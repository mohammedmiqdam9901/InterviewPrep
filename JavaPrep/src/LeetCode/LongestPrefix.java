package LeetCode;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String baseString = strs[0];
        int minCount = baseString.length();

        for(int i = 1; i < strs.length; i++)
        {
            int count = 0;
            int length = Math.min(baseString.length(), strs[i].length());
            for(int j =0; j < length; j++)
            {
                if(baseString.charAt(j) == strs[i].charAt(j))
                {
                    count++;
                }
                else
                    break;
            }

            minCount = Math.min(minCount,count);

        }

        if(minCount == 0)
            return "";
        else
            return baseString.substring(0,minCount);

    }

    public static void main(String[] args) {
        String arr[] = {"","b"};
        System.out.println(longestCommonPrefix(arr));
    }
}
