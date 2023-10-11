package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		Test t = new Test();
		System.out.println(a.getX());
		System.out.println(a);
		System.out.println(a.getOb());
		System.out.println(a.getOb().getY());
	}

}
