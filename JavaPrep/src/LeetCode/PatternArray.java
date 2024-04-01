package LeetCode;

public class PatternArray {

    public static int numOfStrings(String[] patterns, String word) {

        int count = 0;
        for(int i =0; i < patterns.length; i++)
        {
            boolean patternFound = false;
            for(int j = 0; j <= (word.length() - patterns[i].length()); j++)
            {
                for(int k = 0; k < patterns[i].length() ; k++)
                {
                    if(patterns[i].charAt(k) != word.charAt(k+j))
                        break;

                    if(k == patterns[i].length()-1)
                    {
                        count++;
                        patternFound = true;
                        break;

                    }

                }

                if(patternFound)
                    break;


            }
        }

        return count;

    }

    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        System.out.println(numOfStrings(patterns,"abca"));

    }
}
