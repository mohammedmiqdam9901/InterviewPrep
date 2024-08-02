package LeetCode;

import java.util.Stack;

public class rotateright {

    public static void rotate(int[] nums, int k) {
        Stack<Integer> addedElement=new Stack();
        k=k%nums.length;
        for(int i=0;i<nums.length-k;i++){
            addedElement.push(nums[nums.length-k-i-1]);
        }
        for(int i=0;i<k;i++){
            addedElement.push(nums[nums.length-i-1]);
        }
        for(int i=0;i< nums.length;i++){
            nums[i]=addedElement.pop();
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);

    }
}
