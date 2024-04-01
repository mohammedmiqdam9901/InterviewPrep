package LeetCode;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean checkIsomorphic(String s1, String s2)
    {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();

        for(int i =0; i < s1.length(); i++)
        {
            if(hm1.containsKey(s1.charAt(i)))
            {
                if(hm1.get(s1.charAt(i)) != s2.charAt(i))
                    return false;

            }
            else
            {
                hm1.put(s1.charAt(i), s2.charAt(i));
            }

            if(hm2.containsKey(s2.charAt(i)))
            {
                if(hm2.get(s2.charAt(i)) != s1.charAt(i))
                    return false;

            }
            else
            {
                hm2.put(s2.charAt(i), s1.charAt(i));
            }
        }


        return true;


    }

    public static void main(String[] args) {
        System.out.println(checkIsomorphic("egg","add"));
    }
}
