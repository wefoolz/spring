package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{2+2}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")//static method
	private int z;
	@Value("#{T(java.lang.Math).E}")//static variable
	private int e;
	@Value("#{new java.lang.String('Parth')}")//object created
	private String name;
	
	@Value("#{8-4>3}")
	private boolean isTrue;
	
	
	
	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e=e;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo x=" + x + "\n y=" + y + "\n z=" + z + "\n e=" + e + "\n name=" + name + "\n isTrue=" + isTrue;
	}
	

}
