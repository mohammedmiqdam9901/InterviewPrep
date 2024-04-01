package LeetCode;

public class TwinStrings {

    public static boolean twinStringsCheck(String s1,String s2)
    {

        if(s1.length() != s2.length())
            return false;

        char[] arr = s1.toCharArray();

        for(int i =0; i < s1.length(); i++)
        {
            if(i%2 == 0 && s1.charAt(i) != s2.charAt(i))
            {
                for(int j = i+2; j < s1.length(); j+=2)
                {
                    if(s1.charAt(j) == s2.charAt(i))
                    {
                        swap(arr,i,j);
                        break;
                    }
                }

            }
            else if(i%2 != 0 && s1.charAt(i) != s2.charAt(i))
            {
                for(int j = i+2; j < s1.length(); j+=2)
                {
                    if(s1.charAt(j) == s2.charAt(i))
                    {
                        swap(arr,i,j);
                        break;
                    }
                }
            }
        }

        System.out.println("First String "+ s1);
        System.out.println("Second String "+ s2);
        String modified_arr = new String(arr);
        System.out.println(modified_arr);


        if(modified_arr.equals(s2))
            return true;
        else
            return false;
    }

    public static void swap(char arr[],int i , int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {

        System.out.println(twinStringsCheck("abcd","bcda"));

    }
}
