package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItems {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        for( List<String> innerlist : items)
        {
            for(String s : innerlist)
            {
                if(ruleKey.equals("type") && innerlist.get(0).equals(ruleValue))
                {
                    count++;
                    break;
                }
                else if(ruleKey.equals("color") && innerlist.get(1).equals(ruleValue))
                {
                    count++;
                    break;
                }
                else if(ruleKey.equals("name") && innerlist.get(2).equals(ruleValue))
                {
                    count++;
                    break;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        List<List<String>> lst = new ArrayList<>();

        // Adding inner lists to the outer list
        lst.add(Arrays.asList("phone", "blue", "pixel"));
        lst.add(Arrays.asList("computer", "silver", "lenovo"));
        lst.add(Arrays.asList("phone", "gold", "iphone"));


        System.out.println(countMatches(lst,"color","silver"));


    }
}
