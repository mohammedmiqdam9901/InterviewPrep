package LeetCode;

public class MakeAnagrams {

    public static int minSteps(String s, String t) {


        for(int i =0; i < s.length(); i++)
        {
            if(t.indexOf(s.charAt(i)) != -1)
            {
                t = t.replaceFirst(s.charAt(i) +"","");
            }
        }
        return t.length();

    }

    public static void main(String[] args) {
        System.out.println(minSteps("bab","aba"));
    }
}
