package Test;

import java.sql.SQLOutput;

public class secondLargestArray {

    public static int secondLargestArrayElement(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest )
            {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {12,24,56,76,23,45};
        System.out.println("Second Largest Element is "+ secondLargestArrayElement(arr));
    }
}
