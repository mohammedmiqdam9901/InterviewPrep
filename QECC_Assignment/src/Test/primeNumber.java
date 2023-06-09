package Test;

public class primeNumber {

    public static boolean checkPrime(int n)
    {
        if(n<=1)
            return false;

        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int number =27;
        if(checkPrime(number))
        {
            System.out.println("Its a Prime Number");
        }
        else
            System.out.println("Its not a Prime Number");

    }
}
