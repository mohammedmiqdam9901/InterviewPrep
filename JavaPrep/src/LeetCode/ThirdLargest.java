package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class ThirdLargest {

    public static int thirdMax(int[] nums) {

        Queue<Integer> pq = new PriorityQueue<>();

        for(int i =0; i < nums.length; i++)
        {
            if(!pq.contains(nums[i]))
                pq.add(nums[i]);

            if(pq.size() > 3)
                pq.poll();
        }

        return pq.peek();

    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5,6};
        System.out.println(thirdMax(arr));
    }
}
