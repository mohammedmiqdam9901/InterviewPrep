package Test;

import java.util.Arrays;

public class namesSortArray {

    public static void sortingNames(String arr[])
    {
        Arrays.sort(arr);

        for(String x : arr)
        {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        String arr[]= {"Miqdam","Mohammed","Amrose","Bharath"};
        sortingNames(arr);

    }
}
