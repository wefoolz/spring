package com.springcore.auto.wire;

public class Emp {

	private Address adress;
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

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Emp [adress=" + adress + "]";
	}


}
