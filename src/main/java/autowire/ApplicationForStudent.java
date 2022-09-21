package autowire;

public class ApplicationForStudent {
  int roll;
  String name;
  StudentAddress address;

    public ApplicationForStudent(StudentAddress address) {
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentAddress getAddress() {
        return address;
    }

    public void setAddress(StudentAddress address) {
        this.address = address;
    }

    public ApplicationForStudent() {
    }

    @Override
    public String toString() {
        return "ApplicationForStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
