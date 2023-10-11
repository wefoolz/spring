package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context = new 	ClassPathXmlApplicationContext("com/springcore/ci/personconfig.xml");
//		Person p1 =(Person) context.getBean("p1");
//		
//		System.out.println(p1.toString());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/personConfig.xml");
		Addition a = (Addition) context.getBean("a1");
		a.dosum();

	}

}
