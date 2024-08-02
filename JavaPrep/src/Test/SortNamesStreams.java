package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNamesStreams {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Miqdam","Tousif","Mohammed","Abdul","Royce");
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
