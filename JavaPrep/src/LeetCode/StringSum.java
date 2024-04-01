package LeetCode;

public class StringSum {

    public static int gettingStringSum(String s)
    {
        String digit = "";
        int sum = 0;

        for(int i =0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                digit = digit + s.charAt(i);
            }
            else
            {
                if (!digit.isEmpty()) {
                    sum = sum + Integer.parseInt(digit);
                    digit = ""; // Reset digit to an empty string
                }
            }
        }

        if (!digit.isEmpty()) {
            sum = sum + Integer.parseInt(digit);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(gettingStringSum("a12b12c1"));
    }
}
