package LinkedlistPrac;

public class StringSum {

    public static int gettingStringSum(String s)
    {
        String sum = "";
        int total =0;

        for(int i =0; i <s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sum = sum + s.charAt(i);
            }
            else
            {
                if(!sum.isEmpty())
                {
                    total = total + Integer.parseInt(sum);
                    sum = "";
                }
            }
        }

        if(!sum.isEmpty())
        {
            total = total + Integer.parseInt(sum);
        }

       return total;
    }

    public static void main(String[] args) {
        System.out.println(gettingStringSum("a12b12c1d1"));
    }
}
