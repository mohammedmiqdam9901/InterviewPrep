package Test;

import java.util.HashMap;

public class majorityElement {

    public static void findingMajorityElement(int arr[])
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count =1;
        for(int i =0; i < arr.length; i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],count);
            }
            else
                hm.put(arr[i],hm.get(arr[i])+1);
        }

        for(int x : hm.keySet())
        {
            if(hm.get(x) > arr.length/2)
                System.out.println(x);
        }
    }

    public static void main(String[] args) {

        findingMajorityElement(new int[]{2, 2, 2, 3,4,4});
    }
}
