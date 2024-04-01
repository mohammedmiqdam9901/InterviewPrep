package LeetCode;

public class MaxStrings {

    public static int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        for(int i =0; i < words.length; i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            String rev = sb.reverse().toString();
            for(int j = i+1; j < words.length; j++)
            {
                if(words[j].equals(rev))
                {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        String arr[] = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(arr));
    }
}
