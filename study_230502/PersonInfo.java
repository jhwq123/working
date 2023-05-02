package study_230502;

import java.io.Serializable;

public class PersonInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7686403517865061180L;
	String name;
	String city;
	int age;

	public PersonInfo(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String toString() {
		return name + " : " + city + " : " + age;
	}
}
