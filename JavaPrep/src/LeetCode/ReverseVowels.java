package LeetCode;

public class ReverseVowels {

    public static String reverseVowels(String s) {

        char arr[] = s.toCharArray();

        for(int i =0; i < s.length()-1; i++)
        {
            if("aeiou".indexOf(s.charAt(i)) != -1)
            {
                for(int j = i+1; j < s.length();j++ )
                {
                    if("aeiou".indexOf(s.charAt(j)) != -1)
                    {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }

            }

        }

        return new String(arr);



    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
