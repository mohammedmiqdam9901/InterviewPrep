package Test;

import java.util.HashSet;

public class missingNumberArray {

    public static void missingNumber(int arr[],int numberLessThen)
    {
        HashSet hs = new HashSet();
        for(int i =0; i < arr.length; i++)
        {
            if(!hs.contains(arr[i]))
            {
                hs.add(arr[i]);
            }
        }
        System.out.println(arr.length);

        for(int j =0; j<numberLessThen; j++)
        {
            if(!hs.contains(j))
            {
                System.out.println(j);
            }

        }
    }

    public static void main(String[] args) {

        int arr[] = {0,1,2,4,5,7,9};
        missingNumber(arr,10);

    }
}
