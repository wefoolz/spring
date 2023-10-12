package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
//		Student st = context.getBean("student",Student.class);
		Student st = context.getBean("ob",Student.class);
		System.out.println(st);
	}

}
