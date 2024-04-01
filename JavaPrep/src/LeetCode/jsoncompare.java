package LeetCode;

import java.util.HashMap;

public class jsoncompare {

    public static void jsonCompare(String json)
    {
        String keyPairs[] = json.substring(1,json.length() -1).split(",");

        HashMap<String,String> hm = new HashMap<>();

        for(String parts: keyPairs)
        {
            String brokenParts[] = parts.split(":");
            hm.put(brokenParts[0],brokenParts[1]);

        }

        for(String key: hm.keySet())
        {
            System.out.println(key + ":" + hm.get(key));
        }
    }

    public static void main(String[] args) {
        String json1 = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        jsonCompare(json1);

    }
}
