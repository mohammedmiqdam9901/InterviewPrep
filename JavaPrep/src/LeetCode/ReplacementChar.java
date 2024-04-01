package LeetCode;

import java.util.HashMap;

public class ReplacementChar {

    public static String characterReplacement(String s, int k) {


        String replaced = "";
        char replacementChar = 'A';
        char otherChar = 'A';
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0; i < s.length(); i++)
        {

            if(!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i), 1);
            }
            else
            {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }

        }

        for(Character ch: hm.keySet())
        {
            if(hm.get(ch)== k)
            {
                replacementChar = ch;
            }
            else
            {
                otherChar = ch;
            }
        }

        replaced = s.replace(replacementChar,otherChar);

        return replaced;

    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("abac",2));
    }
}
