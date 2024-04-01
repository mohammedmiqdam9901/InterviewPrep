package Test;

public class arraySumDigits {

    public static int  arrayElementsIntegerSum(String str[])
    {
     int sum =0;
     for(int i=0;i<str.length;i++)
     {
         String word = str[i];
         for(int j=0; j < word.length();j++)
         {
             if(Character.isDigit(word.charAt(j)))
             {
                 sum = sum + Integer.parseInt(word.charAt(j) + "");
             }
         }
     }
     return sum;

    }

    public static void main(String[] args) {

        String str[] ={"A22","B12","C11","D23"};
        System.out.println(arrayElementsIntegerSum(str));

    }
}
