package com.constructors;

public class Employee {
	String name;
	double salary;
	public Employee(String name1,double salary1) {
		name=name1;
		salary=salary1;
		}
	public void dispalyDetails() {
		if(salary<0) {
		    salary=0;
		}
		System.out.println("Employee Name is:"+name);
		System.out.println("Salary is:"+salary);
	}

	public static void main(String[] args) {
       Employee emp=new Employee("Thaslim",100000);
       	emp.dispalyDetails();


	}

}
