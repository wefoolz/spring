package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s1 = (Student)context.getBean("Student1");
        
        System.out.println(s1);
        s1= (Student)context.getBean("Student2");
        System.out.println(s1);
        s1= (Student)context.getBean("Student3");
        System.out.println(s1);
    }
}
