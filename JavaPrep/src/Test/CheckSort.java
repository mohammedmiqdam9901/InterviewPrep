package Test;

import java.util.ArrayList;
import java.util.Collections;

public class CheckSort {

    public static void main(String[] args) {

        Employee e1 = new Employee("Miqdam","bengaluru",23);
        Employee e2 = new Employee("satish","chennai",2);
        Employee e3 = new Employee("Shoaib","andhra",55);
        Employee e4 = new Employee("Dev","Nagaland",35);

        ArrayList<Employee> ar = new ArrayList();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);
        ar.add(e4);

        System.out.println(ar);

        Collections.sort(ar);

        System.out.println(ar);




    }
}
