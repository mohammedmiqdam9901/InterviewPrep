package LeetCode;

import java.util.HashMap;

public class jsontest {

    public static void main(String[] args) {

        String json = "{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\"}";

        String KeyValues[] = json.split(",\\s*");

        for(String str:KeyValues)
        {
            System.out.println(str);
        }

        HashMap<String,String> hm = new HashMap<>();

        for(String keysvalues: KeyValues)
        {
            String splitKeysValues[] = keysvalues.split(":\\s*");
            String Key = splitKeysValues[0].replaceAll("[^A-Za-z0-9]","");
            String value = splitKeysValues[1].replaceAll("\"","");
            System.out.println(Key);
            System.out.println(value);
            hm.put(Key,value);

        }

        System.out.println(hm.get("size"));

    }
}
