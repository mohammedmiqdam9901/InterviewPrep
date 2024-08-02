package LeetCode;

public class CompressString {

    public static String compressingString(String s)
    {
        StringBuilder compressed = new StringBuilder();
        int count =1;
        for(int i = 1; i < s.length(); i++)
        {
            if( s.charAt(i) != s.charAt(i-1))
            {
                compressed.append(s.charAt(i-1));
                compressed.append(count);
                count =1;
            }
            else
            {
                count++;
            }
        }

        compressed.append(s.charAt(s.length()-1));
        compressed.append(count);

        return compressed.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressingString("aaaabbaa"));
    }
}
