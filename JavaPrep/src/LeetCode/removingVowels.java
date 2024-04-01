package LeetCode;

public class removingVowels {

    public static String removing_vowels(String s)
    {
        return s.replaceAll("[aeiouAEIOU]","");
    }

    public static void main(String[] args) {

        System.out.println(removing_vowels("Miqdam"));
    }
}
