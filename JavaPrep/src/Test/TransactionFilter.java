package Test;

public class TransactionFilter {

    public static String getTransAmount(String s)
    {
        return s.replaceAll("[a-zA-Z]", "");
    }

    public static void main(String[] args) {

        System.out.println(getTransAmount("Transaction charges are $12.45 rupees"));

    }
}
