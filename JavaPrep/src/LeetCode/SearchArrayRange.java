package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchArrayRange {

    public static int[] searchRange(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        int arr1[] = {-1,-1};
        int arr[] = new int[2];
        boolean found = false;
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                found = true;
                ls.add(i);
            }
        }
        if(ls.size() == 1)
        {
            ls.add(ls.get(0));
            arr[0] = ls.get(0);
            arr[1] = ls.get(ls.size() -1);
        }
        else if(ls.size() > 1)
        {
            arr[0] = ls.get(0);
            arr[1] = ls.get(ls.size() -1);
        }


        if(found)
        {
            return arr;
        }
        else
            return arr1;

    }

    public static void main(String[] args) {
        int arr[] = {1,4};
        System.out.println(Arrays.toString(searchRange(arr, 4)));
    }
}
