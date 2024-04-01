package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        String entire_arr = "";
        for(String s : words)
        {
            entire_arr = entire_arr + s + separator;

        }
        System.out.println(entire_arr);

        String arr[] = entire_arr.split("\\.");
        return new ArrayList<>(Arrays.asList(arr));

    }

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("one.two.three");
        ls.add("four.five");
        ls.add("six");

        System.out.println(splitWordsBySeparator(ls,'.'));


    }
}
