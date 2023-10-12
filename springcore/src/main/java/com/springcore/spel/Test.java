package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d = context.getBean("demo",Demo.class);
		System.out.println(d);
		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		org.springframework.expression.Expression ep =  temp.parseExpression("2+3");
//		System.out.println(ep.getValue());
	}

}
