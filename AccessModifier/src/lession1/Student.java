package lession1;

import lession2.Polygon;

public class Student extends Polygon{
	private String name;
	private int age;
	public String getName() {
		//var = 10;	No modifier variable of super class can not be accessed
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
