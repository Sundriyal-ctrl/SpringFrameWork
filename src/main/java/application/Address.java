package application;

public class Address {
    private String city,area;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public String toString()
    {
        return "[ Address : area : "+area+" city : "+city+" ]";
    }
}
