package Test;

import java.util.Arrays;

public class anagramCheck {

    public static boolean checkingAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if(checkingAnagram(str1,str2))
            System.out.println("ANAGRAMS");
        else
            System.out.println("NOT ANAGRAMS");

    }

}
