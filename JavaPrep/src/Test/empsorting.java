package Test;

import java.util.ArrayList;
import java.util.Collections;

public class empsorting {

    public static void main(String[] args) {
        emp e1 = new emp(22,"gh","melbourn");
        emp e2 = new emp(2,"ef","Perth");
        emp e3 = new emp(12,"cd","Amsterdsam");
        emp e4 = new emp(210,"ab","Delhi");

        ArrayList<emp> ar = new ArrayList<>();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);
        ar.add(e4);

        System.out.println(ar);
        Collections.sort(ar,new nameCompare());
        System.out.println(ar);



    }
}
