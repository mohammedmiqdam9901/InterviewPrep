package LeetCode;

public class ASCIIOccurence {


    public static void characterCount(String s)
    {
        int arr[] = new int[26];
        for(int i =0; i < s.length();i++)
        {
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }

        for(int i : arr)
        {
            System.out.println("The value is"+i);
        }
    }

    public static void main(String[] args) {
        characterCount("aabbcc");
    }
}
