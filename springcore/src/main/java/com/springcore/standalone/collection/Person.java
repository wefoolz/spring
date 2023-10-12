package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> course;
	private Properties property;

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	public Map<String, Integer> getCourse() {
		return course;
	}

	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", course=" + course + ", property=" + property + "]";
	}

}
