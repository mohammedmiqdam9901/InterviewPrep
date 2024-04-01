package Test;


public class stringCompression {

    public static String compressingString(String s)
    {
        String s1 = s.charAt(0) + "";
        int count =1;

        for(int i =1;i < s.length();i++)
        {
            char current = s.charAt(i);
            char previous = s.charAt(i-1);

            if(current == previous)
            {
               count++;
            }
            else
            {
                s1 = s1 + count;
                count =1;
                s1 =s1 + current;

            }

        }
        s1 = s1 + count;

        return s1;
    }

    public static void main(String[] args) {

        System.out.println(compressingString("aaabbaccaac"));;

    }
}
