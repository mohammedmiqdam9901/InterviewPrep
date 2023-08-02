package Test;

public class checkRotateStrings {

    public static boolean checkStringRotations(String s1, String s2)
    {
        if(s1.length() == s2.length() && (s1 + s1).contains(s2))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(checkStringRotations("abcd","cdb"));;
    }
}
