package Test;

public class specialCharactersCount {

    public static void getSpecialCharacters(String s)
    {
        String specialCharacters = "[^a-zA-Z0-9 ]";

        for(int i =0; i< s.length(); i++)
        {
            if(String.valueOf(s.charAt(i)).matches(specialCharacters))
            {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {

        getSpecialCharacters("moha//mme{}");

    }
}
