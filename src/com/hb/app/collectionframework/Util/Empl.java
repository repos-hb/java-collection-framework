package com.hb.app.collectionframework.Util;

public class Empl {
	private String name;
	private int salary;

	public Empl(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.salary=i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString(){
		return "Name: "+this.name+"-- Salary: "+this.salary;
	}

}
