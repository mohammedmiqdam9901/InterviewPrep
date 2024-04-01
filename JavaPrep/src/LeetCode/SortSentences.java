package LeetCode;

public class SortSentences {

    public static String sortSentenceTest(String s) {

        String arr[] = s.split(" ");

        for(String word : s.split(" ") )
        {
            int digit = Character.getNumericValue(word.charAt(word.length() -1));
            arr[digit -1]= word.substring(0,word.length()-1);
        }

//        StringBuilder sb = new StringBuilder();

//        for(String sh : arr)
//        {
//            sb.append(sh).append(" ");
//        }
//
        return String.join(" ",arr);



    }

    public static void main(String[] args) {
        System.out.println(sortSentenceTest("is2 sentence4 This1 a3"));
    }
}
