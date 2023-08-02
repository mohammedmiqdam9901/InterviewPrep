package Test;

import java.util.HashMap;

public class wordOccurenceCount {

    public static int CountingWords(String s1, String word)
    {
        String arr[] = s1.split(" ");
        int count = 1;
        HashMap<String,Integer> hm = new HashMap<>();

        for(int i =0; i < arr.length; i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],count);
            }
            else
                hm.put(arr[i], hm.get(arr[i])+1);
        }

        for(String x : hm.keySet())
        {
            if(word == x)
                System.out.println("The Occurence of word "+x+ " is" +hm.get(x));
        }
    }

    public static void main(String[] args) {
        String s1 = "My name name name is Miqdam Miqdam Miqdam Miqdam";
    }
}
