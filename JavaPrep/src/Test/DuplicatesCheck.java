package Test;

import java.util.HashMap;

public class DuplicatesCheck {

    public static void checkingDuplicates(String arr[])
    {
        HashMap<String, Integer> hm = new HashMap<>();
        int count =1;

        for(String x : arr)
        {
            if(!hm.containsKey(x))
            {
                hm.put(x,count);
            }
            else
            {
                hm.put(x,hm.get(x)+1);
            }
        }

        for(String x: hm.keySet())
        {
            if(hm.get(x) > 1)
            {
                System.out.println("The duplicate is "+x+ "with count of "+ hm.get(x));
            }
            else
                System.out.println("The unique character is "+x);

        }
    }

    public static void main(String[] args) {
        checkingDuplicates(new String[]{"10", "15", "16", "10"});



    }
}
