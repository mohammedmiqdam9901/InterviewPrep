package LeetCode;

public class MinsubArray {

    public static int minSubArrayLen(int target, int[] nums) {
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            int count =1;
            int sum =nums[i];
            for(int j = i+1; j < nums.length; j++)
            {
                sum = sum + nums[j];
                count++;
                if(sum >= target)
                {
                    break;
                }

            }
            minCount = Math.min(count,minCount);

        }

        return minCount;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }
}
