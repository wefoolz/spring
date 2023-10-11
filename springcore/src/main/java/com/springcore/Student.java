package com.springcore;

public class Student {
	private int studentId;
	private String Name;
	private String Address;
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + Name + ", Address=" + Address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String address, String name) {
		super();
		this.studentId = studentId;
		Address = address;
		Name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
