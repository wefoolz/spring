package com.springcore.tectec;

public class Tec {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Tec() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tec [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init");
	}
	
	public void dest() {
		System.out.println("inside dest");
	}

}
