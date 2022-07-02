package com.generic;

import java.util.HashSet;

public class Assignment1 {

	public static void main(String[] args) {
		HashSet<Employee> employeeHashSet = new HashSet();
        Employee a = new Employee(1, "Yogesh", 30000, "Dev");
        Employee b = new Employee(2, "Nil", 20000, "Q/A");
        Employee c = new Employee(3, "Aditya", 30000, "Dev");
        Employee d = new Employee(4, "Saurabh", 50000, "Manager");
        
        
        
        employeeHashSet.add(a);
        employeeHashSet.add(b);
        employeeHashSet.add(c);
        employeeHashSet.add(d);
        System.out.println(employeeHashSet);
    }

		
	}
        
	

class Employee{
	  int id, salary;
	    String name, dept;
	    
	    
	    public Employee(int id, String name, int salary, String dept) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.dept = dept;
	    }
	    public String toString() {
	        return "{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}";
	    }


	    public void displayDetails() {
	        System.out.println("{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}");
	    }
}
