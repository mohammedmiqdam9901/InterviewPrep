package Test;

public class replaceString {

    public static String replaceChar(String s, char c)
    {
        String replaced = "";
        String cr = c + "";
        if(s.indexOf(c)>=0)
            replaced = s.replaceFirst(cr,"");

        return replaced;
    }


    public static void main(String[] args) {
        System.out.println(replaceChar("miqdam",'m'));
    }
}
