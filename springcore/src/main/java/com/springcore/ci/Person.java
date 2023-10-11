package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi cer;
	private List<String> l;
	
	public Person(String name, int id, Certi cer,List<String> l) {
		this.name=name;
		this.id=id;
		this.cer=cer;
		this.l=l;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.id+" "+this.cer.id+" "+l;
	}

}
