package autowire;

public class StudentAddress {
    String city;
    String area;

    public StudentAddress() {
    }

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

    @Override
    public String toString() {
        return "StudentAddress{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public StudentAddress(String city, String area) {
        this.city = city;
        this.area = area;
    }
}
