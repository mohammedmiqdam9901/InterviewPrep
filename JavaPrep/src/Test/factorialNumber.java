package Test;

import java.sql.SQLOutput;

public class factorialNumber {

    public static int giveFactorial(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
         fact =fact*i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(giveFactorial(3));
    }
}
