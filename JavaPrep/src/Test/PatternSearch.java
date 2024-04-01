package Test;

public class PatternSearch {

    public static boolean searchingPattern(String s, String pattern)
    {
        for(int i=0; i <= (s.length() - pattern.length());i++)
        {
            for(int j =0; j < pattern.length();j++)
            {
                if(pattern.charAt(j) != s.charAt(i+j))
                    break;

                if(j == pattern.length()-1)
                    return true;


            }
        }

        return false;
    }

    public static void main(String[] args) {

        if(searchingPattern("bba","bba"))
            System.out.println("Pattern found");
        else
            System.out.println("Pattern Not found");


    }
}
