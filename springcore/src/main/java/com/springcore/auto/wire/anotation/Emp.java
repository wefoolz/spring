package com.springcore.auto.wire.anotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	//@Autowired
	private Address adress;
	
	@Autowired
	public Emp(Address adress) {
		super();
		this.adress = adress;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAdress() {
		return adress;
	}
//@Autowired
	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Emp [adress=" + adress + "]";
	}


}
