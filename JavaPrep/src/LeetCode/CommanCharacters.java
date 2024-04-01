package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommanCharacters {

    public static List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        Map<Character, Integer> hm = addCharacters(words[0].toCharArray());



        for(int i =1; i< words.length;i++)
        {
            Map<Character, Integer> updated_hm = addCharacters(words[i].toCharArray());
            for(Character ch: hm.keySet())
            {
                int currentCount = updated_hm.getOrDefault(ch,0);
                int min_count = Math.min(hm.get(ch), currentCount);
                hm.put(ch,min_count);
            }

        }

        for(Character ch:hm.keySet())
        {
            System.out.println("Key is"+ ch +"Value is"+ hm.get(ch));

        }

        for(Character ch:hm.keySet())
        {
            if(hm.get(ch) > 0)
            {
                for(int i =0 ; i < hm.get(ch);i++)
                {
                    result.add(String.valueOf(ch));
                }
            }


        }

        return result;

    }

    private static Map<Character, Integer> addCharacters(char[] charArray) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i =0; i < charArray.length; i++)
        {

            charCountMap.put(charArray[i], charCountMap.getOrDefault(charArray[i], 0) + 1);

        }

        return charCountMap;
    }

    public static void main(String[] args) {
        String words[] = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }
}
