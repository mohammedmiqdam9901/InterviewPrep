package LeetCode;

public class StringDigitSum {

    public static int digitsSum(String number)
    {
        int sum =0;
        String digit = "";
        for(int i =0; i < number.length(); i++)
        {
            if(Character.isDigit(number.charAt(i)))
            {
               digit = digit + number.charAt(i);
            }
            else if(!digit.equals("")) {
                sum = sum + Integer.parseInt(digit);
                digit = "";
            }
        }

        return sum + Integer.parseInt(digit);
    }


    public static void main(String[] args) {
        System.out.println(digitsSum("a12b2c1"));
    }
}
