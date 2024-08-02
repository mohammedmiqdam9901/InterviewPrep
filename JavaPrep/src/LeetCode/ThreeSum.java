package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int nums[])
    {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();

        for(int i =0; i < nums.length -2; i++)
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i +1;
            int right = nums.length -1;

            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0)
                {
                    ls.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right++;

                    left++;
                    right--;

                }
                else if(sum < 0)
                {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return ls;
    }

    public static void main(String[] args) {

        int nums[] = {-2,0,1,1,2};
        List<List<Integer>> resultList = threeSum(nums);

        for(List l : resultList)
            System.out.println(l);




    }
}
