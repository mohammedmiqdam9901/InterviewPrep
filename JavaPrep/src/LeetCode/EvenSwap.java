package LeetCode;

public class EvenSwap {

    public static String evenSwapping(String s1)
    {
        char arr[] = s1.toCharArray();

        for(int i =0 ; i < s1.length(); i++)
        {
            if(i%2 ==0 && i+2 < s1.length())
            {
                swap(arr,i,i+2);
            }
        }

        return new String(arr);

    }

    public static void swap(char arr[],int i , int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        System.out.println(evenSwapping("abcde"));
    }
}
