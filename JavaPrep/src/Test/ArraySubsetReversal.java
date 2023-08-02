package Test;

import java.util.Arrays;

public class ArraySubsetReversal {

    public static void reversingSubsetArrayElements(int arr[], int subset)
    {

        for(int i=0; i< arr.length; i =i+subset)
        {
            int startingIndex = i;
            int lastIndex = Math.min(i + subset - 1, arr.length - 1);
            if(lastIndex - startingIndex >=subset-1)
                reverseSubset(arr,startingIndex,lastIndex);

        }


    }

    public static void reverseSubset(int arr[],int startingIndex,int lastIndex)
    {
        while(startingIndex < lastIndex)
        {
            int temp = arr[startingIndex];
            arr[startingIndex]=arr[lastIndex];
            arr[lastIndex]=temp;
            startingIndex++;
            lastIndex--;
        }
    }


    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12};
        reversingSubsetArrayElements(arr,3);
        System.out.println(Arrays.toString(arr));


    }
}
