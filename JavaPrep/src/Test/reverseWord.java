package Test;


public class reverseWord {

    public static String reversingWord(String s)
    {

        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();


    }

    public static void main(String[] args) {
        System.out.println("The reversed word is " +reversingWord("string"));
    }
}
