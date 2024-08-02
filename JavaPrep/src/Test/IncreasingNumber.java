package Test;

public class IncreasingNumber {

    public static boolean checkNumber(String s)
    {
        String arr[] = s.split(" ");
        boolean flag = true;
        int prev = 0;

        for(String value: arr)
        {
            try{
                int number = Integer.parseInt(value);
                if(number <= prev)
                {
                    flag = false;
                    break;
                }
                prev = number;
            }
            catch (Exception e)
            {

            }
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber("9 box 2 red boxes 4 red boxes green"));
    }
}
