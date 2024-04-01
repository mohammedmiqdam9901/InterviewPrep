package Test;

public class palandromeCheck {

    public static boolean checkingPalandrome(String s1)
    {
        StringBuilder sb1 = new StringBuilder(s1);
        return s1.equalsIgnoreCase(sb1.reverse().toString());

    }

    public static void main(String[] args) {
        String s1 = "malyalam";
        if(checkingPalandrome(s1))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


    }
}
