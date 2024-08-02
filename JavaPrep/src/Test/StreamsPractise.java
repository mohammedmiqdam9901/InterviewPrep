package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsPractise {

    public static void main(String[] args) {

        int arr[] = {3,7,1,33,5,9,21,53};

        int arr1[] = Arrays.stream(arr).sorted().toArray();

        for(int i =0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }

        List<Integer> ar = Arrays.asList(1,4,22,11,77,32,4,44);
        List<Integer> updated = ar.stream().filter(x -> x%2 == 0).map(x->x/2).distinct().limit(3).collect(Collectors.toList());

        System.out.println(updated);
    }
}
