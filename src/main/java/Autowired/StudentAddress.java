package Autowired;


public class StudentAddress {

    String area;
    String city;

    int id;
    public StudentAddress() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StudentAddress(String area, String city) {
        this.area = area;
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
