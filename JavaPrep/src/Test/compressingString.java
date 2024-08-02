package Test;

public class compressingString {

    public static String compressString(String s)
    {
        String s1 = s.charAt(0) + "";
        int count =1;

        for(int i =1; i < s.length();i++)
        {

            char current = s.charAt(i);
            char prev = s.charAt(i-1);

            if(current == prev)
            {
                count++;
            }
            else {
                s1 = s1 + count;
                count = 1;
                s1 = s1 + current;
            }

        }

        s1 = s1 + count;
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabbccaa"));
    }
}
