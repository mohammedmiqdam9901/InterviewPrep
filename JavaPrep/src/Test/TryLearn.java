package Test;

import java.sql.SQLOutput;

public class TryLearn {

    public static void main(String[] args) {
        int num = 10;
        int den = 0;
//
//        System.out.println("The result is" + num/den);

        try{
            int res = num/den;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by Zero");
        }
    }
}
