package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
//		Student st = context.getBean("student",Student.class);
//		Student st = context.getBean("ob",Student.class);
//		System.out.println(st);
//		System.out.println(st.hashCode());
//		Student sst = context.getBean("ob",Student.class);
//		System.out.println(sst);
//		System.out.println(sst.hashCode());
		Teacher tech = context.getBean("tech",Teacher.class);
		System.out.println(tech.hashCode());
		Teacher tech2 = context.getBean("tech",Teacher.class);
		System.out.println(tech2.hashCode());
	}

}
