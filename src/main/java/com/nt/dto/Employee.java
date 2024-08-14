package com.nt.dto;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	private Address adr;
	
	
	
	
	public Employee() {
		System.out.println("Public Constructor");
		//if scope = "prototype", this Constructor will not be called when xml file gets loaded.
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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


	public Address getAdr() {
		return adr;
	}


	public void setAdr(Address adr) {
		this.adr = adr;
	}

}
