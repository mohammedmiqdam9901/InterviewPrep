package Test;

public class Employee implements Comparable<Employee> {

    private String name;
    private String city;
    private int id;


    public Employee(String name, String city, int id)
    {
        this.city = city;
        this.name = name;
        this.id = id;
    }


    @Override
    public int compareTo(Employee otheremp) {
        return this.name.compareTo(otheremp.name);
    }

    @Override
    public String toString() {
        return "EmpID: " + id + " Name: " + name + " City: " + city;
    }
}
