package LeetCode;

import java.util.Arrays;

public class NegativeShiftRelativeOrder {

    public static int[] shiftingNegativeNumbers(int arr[])
    {
        int result[] = new int[arr.length];
        int index =0;

        for(int i : arr)
        {
            if(i < 0)
                result[index++] = i;
        }

        for(int i : arr)
        {
            if(i >=0)
                result[index++]= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, -1, 3, -2, -3, 5, 6, -7};

        int res[] = shiftingNegativeNumbers(nums);
        System.out.println(Arrays.toString(res));
//        for(int num : res)
//        {
//            System.out.println(num);
//        }
    }
}
