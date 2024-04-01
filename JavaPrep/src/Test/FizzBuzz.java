package Test;

public class FizzBuzz {

    public static void fizzBuzzLogic()
    {
        for(int i=1; i<=100; i++)
        {
            if(i%3 == 0 && i%5 != 0)
            {
                System.out.println("FIZZ");
            }
            else if(i%5 == 0 && i%3 != 0)
            {
                System.out.println("BUZZ");
            }
            else if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FIZZBUZZ");

            }
            else
                System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        fizzBuzzLogic();
    }
}
