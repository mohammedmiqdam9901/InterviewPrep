package LeetCode;

public class PeakElement {

    public static int findPeakElement(int[] nums) {

        int i =0;

        if(nums.length ==1)
            return 0;

        for(i = 0; i < nums.length; i++)
        {
            if(i!= 0 && i != nums.length -1)
            {
                if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
                    return i;

            }
        }

        return i;

    }

    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(findPeakElement(arr));
    }


}
