package LeetCode;

public class reverseNumber {

    public static int reversingNumber(int num)
    {
        int reverse = 0;
        int sign = num > 0 ? 1 : -1;

        int x = Math.abs(num);

        while(x != 0)
        {
            int lastDigit = x%10;
            reverse = reverse*10 + lastDigit;
            x = x/10;
        }

        return reverse*sign;
    }

    public static void main(String[] args) {
        System.out.println(reversingNumber(230));
    }
}
