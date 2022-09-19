package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class MainDriver {
    public static void main(String[] args) {
      ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
      System.out.println("=====================Getter setter Injection===============");
      Employee employee=applicationContext.getBean("employee",Employee.class);
      System.out.println(employee);
      System.out.println("===================Constructer Injection=======================");
      Employee employee1=applicationContext.getBean("employee1",Employee.class);
      System.out.println(employee1);
      System.out.println("=====================Object Injection=========================");
      Student student=applicationContext.getBean("student",Student.class);
      System.out.println(student);
    }
}

/*
OUTPUT

=====================Getter setter Injection===============
[ id: 12 Name : Anuj Sundriyal ]
===================Constructer Injection=======================
[ id: 13 Name : Anuj Sundriyal ]
=====================Object Injection=========================
[ Student : id : 145   Name : Anuj Sundriyal  Address : [ Address : area : Upper Nathanpur city : Dehradun ]
 */