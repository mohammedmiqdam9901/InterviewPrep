package LeetCode;

public class jsonsplit {

    public static void jsonParse()
    {
        String s1 = "{\"key1\": \"value1\", \"key2\": \"value2\"}";
        String arr[] = s1.split(",\\s*");

        for(String arrayElements : arr)
        {
            System.out.println(arrayElements);
        }

        for(String s: arr)
        {
            String keypair[] = s.split(":\\s*");
            String key = keypair[0].replaceAll("[^a-zA-Z1-9]","");
            String value = keypair[1].replaceAll("\"","");
            System.out.println(key);
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        jsonParse();
    }
}
