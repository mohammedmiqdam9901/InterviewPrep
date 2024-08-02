package LeetCode;

public class BankApp {



    static class InsufficientBalanceException extends Exception
    {
        public InsufficientBalanceException(String message)
        {
            super(message);
        }
    }

    static class Account
    {
        private double initialBalance;
        public Account(double initialBalance)
        {
            this.initialBalance = initialBalance;
        }

        public void getBalance()
        {
            System.out.println("Balance Amount is :"+initialBalance);
        }

        public void creditAmount(double creditAmount)
        {
            if(creditAmount < 0)
                throw new IllegalArgumentException("Credit Amount cannot be Negative");

            initialBalance = initialBalance +  creditAmount;
        }

        public void debitAmount(double debitAmount) throws InsufficientBalanceException {
            if(debitAmount > initialBalance)
                throw new InsufficientBalanceException("You have insufficient funds");

            initialBalance = initialBalance - debitAmount;
            System.out.println("Amount "+debitAmount+" debited, remaining amount is"+initialBalance);
        }
    }

    public static void main(String[] args) throws InsufficientBalanceException {
        Account acc = new Account(1000);
        acc.getBalance();
        acc.creditAmount(-2);
        acc.debitAmount(1000);

    }


}
