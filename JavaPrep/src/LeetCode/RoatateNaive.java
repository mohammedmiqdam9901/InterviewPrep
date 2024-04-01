package LeetCode;

public class RoatateNaive {

    public static void rotateArray(int arr[])
    {
        int temp = arr[0];

        for(int i =1; i< arr.length; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[arr.length -1] = temp;
    }

    public static void rotateKTimes(int arr[], int k)
    {
        k = k % arr.length;

        for(int i =0; i < k; i++)
        {
            rotateArray(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotateKTimes(arr,3);

        for(int i =0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }



    }
}
