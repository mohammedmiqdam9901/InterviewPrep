package LeetCode;

public class HalvesAlive {

    public static boolean halvesAreAlike(String s) {

        String firstPart = s.substring(0,s.length()/2);
        String secondPart = s.substring(s.length()/2,s.length());

        String firstVowelCount = firstPart.replaceAll("[aeiou]","");
        String secondVowelCount = secondPart.replaceAll("[aeiou]","");


        return firstPart.length() - firstVowelCount.length() == secondPart.length() - secondVowelCount.length();


    }

    public static void main(String[] args) {
        System.out.println();
    }
}
