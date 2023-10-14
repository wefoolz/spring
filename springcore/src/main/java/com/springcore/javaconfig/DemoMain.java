package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain{

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student st = context.getBean("newStudent",Student.class);
//		Student st = context.getBean("getStudent",Student.class);//when no name is specified in javaconfig file for a bean
		Student st1 = context.getBean("temp", Student.class);
		System.out.println(st1);
		Student st2 =context.getBean("student", Student.class);
		System.out.println(st2);
		Student st3 =context.getBean("11", Student.class);
		System.out.println(st3);
		System.out.println(st1.Study());
	}

}
