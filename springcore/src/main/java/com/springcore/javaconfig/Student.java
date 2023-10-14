package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component("newStudent")
public class Student {
	
private Samosa sm;

public String Study() {
	sm.price();
	return "Studying";
}

public Samosa getSm() {
	return sm;
}

public void setSm(Samosa sm) {
	this.sm = sm;
}

public Student(Samosa sm) {
	super();
	this.sm = sm;
}


}
