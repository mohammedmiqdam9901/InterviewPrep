package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("Food", 100);
        hm.put("drinks",23);
        hm.put("extra",123);
        hm.put("misc",43);

        LinkedHashMap<String,Integer> sortedHashmap =hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));

        for(String key: sortedHashmap.keySet())
        {
            System.out.println(key +" "+sortedHashmap.get(key));
        }
    }
}
