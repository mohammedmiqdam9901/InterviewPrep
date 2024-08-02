package LeetCode;

import java.util.Arrays;
import java.util.List;

public class TestListConversion {

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Miqdam","Micky","Testing");

        Object arr[] = ls.toArray();
        System.out.println(arr[0]);

        System.out.println(System.getProperty("user.dir"));


    }
}
