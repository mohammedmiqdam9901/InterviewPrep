package Test;
//checking

public class invertCase {

    public static String invertingCaseString(String s)
    {
        StringBuffer sb = new StringBuffer(s);

        for(int i=0; i < sb.length(); i++)
        {
            if(Character.isUpperCase(sb.charAt(i)))
            {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            else
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "MoHaMmEd";
        System.out.println(invertingCaseString(s));

    }
}
