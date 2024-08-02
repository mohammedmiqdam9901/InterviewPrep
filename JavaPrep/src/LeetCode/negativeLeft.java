package LeetCode;

public class negativeLeft {

    public static int[] negativeMoveLeft(int arr[])
    {
       int left =0;
       int right = arr.length-1;

       while(left <= right)
       {
           if(arr[left]< 0)
               left++;
           else if(arr[right] >=0)
               right--;
           else
           {
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
       }

       return arr;
    }

    public static void main(String[] args) {
        int arr[] =  {1, -1, 3, -2, -3, 5, 6, -7};
        int outArr[] = negativeMoveLeft(arr);

        for(int i =0; i < outArr.length;i++)
        {
            System.out.println(outArr[i]);
        }

    }
}
