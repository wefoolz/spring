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
		System.out.println("Hhhhhhhhhhhhhhhhhhhhh");
		TecT t2 =(TecT) context.getBean("t2");
		System.out.println(t2.toString());
		
		System.out.println("Hhhhhhhhhhhhhhhhhhhhh");
		TecTec t3 =(TecTec) context.getBean("t3");
		System.out.println(t3.toString());

	}

}
