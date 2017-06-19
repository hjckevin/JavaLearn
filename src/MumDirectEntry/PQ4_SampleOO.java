package MumDirectEntry;

import java.util.*;

public class PQ4_SampleOO {
	public static void main(String[] args) {
		Employee e1 = new Employee("Bob", new Date("11/01/2000"), 45000.00);
		Employee e2 = new Employee("Dave", new Date("10/01/1990"), 65000.00);
		Employee e3 = new Employee("Hal", new Date("01/01/1995"), 55000.00);
		Employee e4 = new Employee("Susan", new Date("08/20/2004"), 45000.00);
		
		Employee[] eArray = {e1, e2, e3, e4};
		
		double sumSalary = 0;
		for (int i = 0; i < eArray.length; i++) {
			sumSalary += eArray[i].getSalary();
		}
		
		System.out.println(sumSalary);
	}
	
	
}

class Employee {
	private String name;
	private Date hireDate;
	private double salary;
	
	Employee(String name, Date hireDate, double salary) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
}
