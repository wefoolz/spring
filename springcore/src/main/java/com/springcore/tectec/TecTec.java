package com.springcore.tectec;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TecTec {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public TecTec() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "TecTec [subject=" + subject + "]";
}

@PostConstruct
public void start() {
	System.out.println("inside init t3");
}

@PreDestroy
public void dest() {
	System.out.println("inside dest t3");
}
}
