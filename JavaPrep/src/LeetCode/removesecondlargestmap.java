package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class removesecondlargestmap {

    public static void removeSecondLargest()
    {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Miqdam", 21);
        hm.put("shane", 19);
        hm.put("blake", 33);
        hm.put("tom", 9);

        LinkedHashMap<String,Integer> lm = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
        int count = 1;

        for(String s: lm.keySet())
        {
         if(count == 2)
         {
             lm.remove(s);
             break;
         }
         count++;
        }

        for(String s: lm.keySet())
        {
            System.out.println("Key :" + s + "," + " Value :" + lm.get(s));
        }
    }

    public static void main(String[] args) {

        removeSecondLargest();

    }
}
