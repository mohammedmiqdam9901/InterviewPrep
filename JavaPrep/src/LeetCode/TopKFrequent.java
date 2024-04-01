package LeetCode;

import java.util.HashMap;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i =0; i < nums.length; i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }

        int result[] = new int[hm.size()];
        int i =0;
        for(Integer ele: hm.keySet())
        {
            result[i] = hm.get(ele);
            System.out.println(result[i]);
            i++;
        }



        int required[] = new int[k];

        for(int l =0; i < k ; i++)
        {
            required[i] = result[l];
        }

        return required;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};

        int res[] = topKFrequent(arr,2);

        for(int k =0; k < res.length; k++)
        {
            System.out.println(res[k]);
        }
    }
}
