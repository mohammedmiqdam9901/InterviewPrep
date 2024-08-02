package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractise {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);

        int arr[] = {1,2,1,1,2,4,5,6};

        List<Integer> filteredList = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());

        List<Integer> squaredList = list2.stream().map(x -> x * x).collect(Collectors.toList());

        List<Integer> disArray =Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());

        System.out.println(filteredList);
        System.out.println(squaredList);
        System.out.println(disArray);
    }
}
