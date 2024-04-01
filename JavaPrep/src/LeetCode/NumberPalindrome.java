package LeetCode;

public class NumberPalindrome {

    public static boolean checkPalindromeNumber(int num)
    {

        int originalNumber = num;
        int reversedNumber = 0;

        while(num != 0)
        {
            reversedNumber = reversedNumber * 10 + num %10;
            num = num/10;
        }

        return originalNumber == reversedNumber;


    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeNumber(1221));
    }
}
