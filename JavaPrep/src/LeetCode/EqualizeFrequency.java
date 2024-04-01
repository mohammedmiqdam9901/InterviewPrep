package LeetCode;

import java.util.HashMap;


public class EqualizeFrequency {

    public static boolean equalFrequency(String word) {

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i =0; i < word.length(); i++)
        {
            if(!hm.containsKey(word.charAt(i)))
            {
                hm.put(word.charAt(i), 1);
            }
            else
            {
                hm.put(word.charAt(i),hm.get(word.charAt(i))+1);
            }
        }

        int max_key = 0;
        char max = '\0';

        for(Character ch : hm.keySet())
        {
            if(hm.get(ch) > max_key)
            {
                max_key = hm.get(ch);
                max = ch;
            }

        }

        for(Character ch : hm.keySet())
        {
            if(max != ch)
            {
                if(hm.get(ch) != max_key -1)
                    return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(equalFrequency("abccc"));
    }

}
