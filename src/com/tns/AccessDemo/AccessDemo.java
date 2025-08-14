package com.tns.AccessDemo;

public class AccessDemo {
	private String empname;
	protected int salary;
	public String department;
	
	public void setempname(String empname) {
		this.empname=empname;
	}
	public String getempname() {
		return empname;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public int getsalary() {
		return salary;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public String getdepartment() {
		return department;
	}

}
  