package LeetCode;

import java.util.HashMap;

public class ArrayTarget {

    public static int[] targetSum(int arr[], int target)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0; i < arr.length; i++)
        {
            hm.put(arr[i], i);
        }

        for(int i =0; i < arr.length; i++)
        {
            int comp = target - arr[i];

            if(hm.containsKey(comp) && hm.get(comp) !=i)
            {
                return new int[] {comp,arr[i]};
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int exp[] = {2,7,11,15};
        int result[] = targetSum(exp,9);

        for(int i =0; i < result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
