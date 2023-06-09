package Test;

public class largestNumberArray {

    public static int largestNumber(int arr[])
    {
        int largest = arr[0];
        for (int i=1; i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }

        return largest;
    }

    public static void main(String args[])
    {
        int arr[] ={-1,-2,-3,-67,-56,-23};
        System.out.println("Largest Number in the array "+ largestNumber(arr));
    }
}
