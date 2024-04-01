package Test;

import java.util.Arrays;

public class Sort012 {

    public static void Sorting012s(int arr[])
    {
        int low =0;
        int mid =0;
        int high = arr.length -1;

        while(mid <= high)
        {
            switch(arr[mid])
            {
                case 0:
                    swap(arr,mid,low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0,1,2,2,1};

        Sorting012s(arr);

    }
}
