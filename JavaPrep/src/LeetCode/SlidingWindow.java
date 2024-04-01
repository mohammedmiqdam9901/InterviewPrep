package LeetCode;

public class SlidingWindow {

    public static int maxSubarraywithsize(int arr[], int k)
    {
        int csum = 0;
        int msum = 0;
        for(int i = 0; i < k; i++)
        {
            csum = csum + arr[i];
        }

        msum = csum;


        for(int i = k; i < arr.length; i++)
        {
            csum = csum - arr[i-k] + arr[i];
            msum = Math.max(msum,csum);
        }

        return msum;

    }

    public static void main(String[] args) {
        int arr[] = {6,6,6,4,5,6};
        System.out.println(maxSubarraywithsize(arr,3));
    }
}
