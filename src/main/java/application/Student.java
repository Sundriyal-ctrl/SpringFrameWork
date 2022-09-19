package application;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
 private int roll;
 private String name;
 private Address address;

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

 public Address getAddress() {
  return address;
 }

 public void setAddress(Address address) {
  this.address = address;
 }

 public String toString()
 {
  return "[ Student : id : "+roll+"   Name : "+name+"  Address : "+address;
 }
}
