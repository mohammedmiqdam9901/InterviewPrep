package Test;

public class emp {

    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public emp(int id, String name, String city)
    {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmpID: " + id + " Name: " + name + " City: " + city;
    }



}
