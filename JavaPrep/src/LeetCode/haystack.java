package LeetCode;

public class haystack {

    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i =0; i <= n - m; i++)
        {
            int startIndex = i;
            for(int j =0; j < m; j++)
            {
                if(haystack.charAt(i+j) != needle.charAt(j))
                {
                    break;
                }

                if(j == m -1)
                {
                    return startIndex;
                }

            }

        }

        return -1;

    }
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
