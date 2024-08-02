package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray {

    public static List<int[]> dividingArray(int arr[])
    {
       int sum = Arrays.stream(arr).sum();

       if(sum%3 != 0)
           return null;

       int target = sum/3;

       List<int []> overAllList = new ArrayList<>();

       List<Integer> currentList = new ArrayList<>();

       int currentSum =0;

       for(int i : arr)
       {
           currentSum = currentSum + i;
           currentList.add(i);

           if(currentSum == target)
           {
               overAllList.add(currentList.stream().mapToInt(k ->k).toArray());
               currentList.clear();
               currentSum =0;
           }

       }

       if(overAllList.size() != 3)
           return null;
       else
           return overAllList;

    }


    public static void main(String[] args) {
        int arr[] ={1,4,3,5,6,2,3};
        List<int []> ls = dividingArray(arr);
        System.out.println(ls);


        if(ls != null)
        {
            for(int irr[]: ls)
            {
                Arrays.stream(irr).forEach(j -> System.out.println(j));
                System.out.println("________________________");
            }
        }


    }


}
