package LeetCode;

import java.util.Arrays;

public class ArrayPlusOne {

    public static int[] addingOneToArray(int arr[])
    {
        for(int i = arr.length-1; i >= 0; i--)
        {
            if(arr[i] != 9)
            {
                arr[i] = arr[i]+1;
                return arr;
            }
            else
            {
                arr[i] = 0;
            }
        }
        arr = new int[arr.length+1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {9,9,9};
        int result[] = addingOneToArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
