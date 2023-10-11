package com.springcore.tectec;
 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/tectec/tecconfig.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/tectec/tecconfig.xml");
		Tec t1 =(Tec) context.getBean("t1");
		System.out.println(t1.toString());
		context.registerShutdownHook();//need this to destroy object created by spring

	}

}
