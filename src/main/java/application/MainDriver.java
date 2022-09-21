package application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.beancontext.BeanContext;
import java.util.*;


public class MainDriver<T> {

    void show(T obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");

        System.out.println("=============getBean with TypeCast===============");
        Employee employee=(Employee)applicationContext.getBean("employee");
        System.out.println(employee);
        Student student=(Student)applicationContext.getBean("student");
        System.out.println(student);
        System.out.println("==================getBean with .class way==============");
        Employee employee1=applicationContext.getBean("employee",Employee.class);
        System.out.println(employee);
        Student student1=applicationContext.getBean("student",Student.class);
        System.out.println(student);
        System.out.println("================getBean with multiple class============");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id name student or employee");
        String idname=scanner.next();
        new MainDriver<>().show(applicationContext.getBean(idname,Employee.class,Student.class));

    }
}



