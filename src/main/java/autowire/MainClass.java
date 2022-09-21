package autowire;

import application.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ByName.xml");
        ApplicationForStudent application=applicationContext.getBean("student",ApplicationForStudent.class);
        System.out.println("================ByName============================================");
        System.out.println(application);



        System.out.println("================ByType============================================");
        applicationContext=new ClassPathXmlApplicationContext("ByType.xml");
        ApplicationForStudent student=applicationContext.getBean("student",ApplicationForStudent.class);
        System.out.println(student);



        System.out.println("===============Constructer========================================");
        applicationContext=new ClassPathXmlApplicationContext("ByConstructer.xml");
        ApplicationForStudent student1=applicationContext.getBean("student",ApplicationForStudent.class);
        System.out.println(student1);


    }
}
