package LeetCode;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String number = "";

        for(int i =0; i < digits.length; i++)
        {
            number = number + digits[i];
        }

        int requiredNum = Integer.valueOf(number) + 1;

        String sum = String.valueOf(requiredNum);

        int arr[] = new int[sum.length()];

        for(int i=0; i < arr.length; i++)
        {
            arr[i] = Integer.valueOf(sum.charAt(i)+"");
            System.out.println(arr[i]);
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(plusOne(arr));
    }
}
