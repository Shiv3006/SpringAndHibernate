package com.bnt.studentassighnment;

public class Student {
	
	
	private String name;
	private String address;
	private int std;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public Student(String name, String address, int std) {
		super();
		this.name = name;
		this.address = address;
		this.std = std;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", std=" + std + "]";
	}
	
	

}
