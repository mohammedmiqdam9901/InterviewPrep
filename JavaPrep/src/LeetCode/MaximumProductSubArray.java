package LeetCode;

public class MaximumProductSubArray {

    public static int maxProduct(int[] nums) {

        int overallProduct = nums[0];

        if(nums.length == 1)
            return nums[0];

        for(int i =0; i < nums.length; i++)
        {
            int currentProduct =1;

            for(int j = i; j < nums.length;j++)
            {
                currentProduct = currentProduct * nums[j];

                if(currentProduct > overallProduct)
                {
                    overallProduct = currentProduct;

                }


            }

            if(currentProduct > overallProduct)
            {
                overallProduct = currentProduct;
            }
        }



        return overallProduct;



    }

    public static void main(String[] args) {
        int arr[] = {-3,0,1,-2};
        System.out.println(maxProduct(arr));
    }
}
