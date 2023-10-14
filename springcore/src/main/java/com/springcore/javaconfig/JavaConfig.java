package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
@Bean
public Samosa getSamosa() { 
	return new Samosa();
}

@Bean(name= {"temp","student","11"})
public Student getStudent() {
	
	Student st = new Student(getSamosa());
	return st;
}
}
