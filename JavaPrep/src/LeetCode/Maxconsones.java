package LeetCode;

public class Maxconsones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int overallCount = 0;
        int count = 0;
        System.out.println(nums.length);
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i] == 1)
                count++;
            else
            {
                if(count > overallCount)
                {
                    overallCount = count;
                    count = 0;
                }
            }

        }
        return Math.max(overallCount,count);

    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
