package Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentRecord {
    int studentId;
    String studentName;

    @Autowired
    StudentAddress address;

    public StudentRecord() {
    }

    public StudentRecord(int studentId, String studentName, StudentAddress address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public StudentAddress getAddress() {
        return address;
    }

    public void setAddress(StudentAddress address) {
        this.address = address;
    }
}
