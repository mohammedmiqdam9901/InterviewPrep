package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {

        String origin = paths.get(0).get(1);

        for(int i =1; i < paths.size();i++)
        {
            if(paths.get(i).get(0).equals(origin))
            {
                origin = paths.get(i).get(1);
            }
        }
        return origin;

    }

    public static void main(String[] args) {

        List<List<String>> data = new ArrayList<>();
        data.add(Arrays.asList("London", "New York"));
        data.add(Arrays.asList("New York", "Lima"));
        data.add(Arrays.asList("Lima", "Sao Paulo"));

        System.out.println(destCity(data));;


    }


}
