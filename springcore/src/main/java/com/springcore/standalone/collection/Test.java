package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		Person person1 =(Person) context.getBean("person1");
		System.out.println(person1.toString());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getCourse().getClass().getName());
		System.out.println(person1.getProperty().getClass().getName());
		Person person2 =(Person) context.getBean("person2");
		System.out.println(person2.toString());
		System.out.println(person2.getFriends().getClass().getName());
		System.out.println(person2.getCourse().getClass().getName());
		System.out.println(person2.getProperty().getClass().getName());
	}

}
