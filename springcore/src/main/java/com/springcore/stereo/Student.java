package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component//generate reference using class name
@Component("ob")
//@Scope("prototype")
public class Student {
	@Value("Parth")
	private String studentName;
	@Value("Kolhapur")
	private String city;
	@Value("#{temp}")
	private List<Integer> phn;
	
	public List<Integer> getPhn() {
		return phn;
	}
	public void setPhn(List<Integer> phn) {
		this.phn = phn;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ",\n city=" + city + ",\n phn=" + phn + "]";
	}
	
}
