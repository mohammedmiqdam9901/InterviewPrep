package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RingsRods {

    public static int countAllColorRods(String rings)
    {
        Set<Integer> r = new HashSet<>();
        Set<Integer> g = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for(int i =0; i < rings.length();i+=2)
        {
            if(rings.charAt(i) == 'R')
                r.add(rings.charAt(i+1) - '0');
            else if(rings.charAt(i) == 'G')
                g.add(rings.charAt(i+1) - '0');
            else if(rings.charAt(i) == 'B')
                b.add(rings.charAt(i+1) - '0');

        }
        int count =0;

        for(int i =0 ; i <=9; i++)
        {
            if(r.contains(i) && g.contains(i) && b.contains(i))
            {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countAllColorRods("G4"));
    }
}
