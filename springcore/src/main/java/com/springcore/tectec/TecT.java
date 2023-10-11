package com.springcore.tectec;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TecT implements InitializingBean, DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TecT() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TecT [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init t2");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside dest t2");
	}
	
}
