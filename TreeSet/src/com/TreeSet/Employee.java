package com.TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Employee {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Choose your sorting category");
	        System.out.println("1.id   2.name 3.salary   4.department");
	        int choose = scanner.nextInt();

	        Set<Employees> set = null;
	        if (choose == 1) {
	            set = new TreeSet<>(new IdSort());
	        } else if (choose == 2) {
	            set = new TreeSet<>(new NameSort());
	        } else if (choose == 3) {
	            set = new TreeSet<>(new SalarySort());
	        } else if (choose == 4) {
	            set = new TreeSet<>(new DepartmentSort());
	        }
	        set.add(new Employees("Sudipta", 190, 45000, "Testing"));
	        set.add(new Employees("Sibani", 891, 65000, "HR"));
	        set.add(new Employees("Deepak", 101, 30000, "Mgmt"));
	        set.add(new Employees("Bharat", 345, 90000, "Mgmt"));
	        set.add(new Employees("Gita", 879, 45000, "Dev"));
	        for (Employees temp : set) {
	            System.out.println(temp);

	        }

	    }

	}

	class Employees {
	    private String name;
	    private int id;
	    private double sal;
	    private String departments;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getSal() {
	        return sal;
	    }

	    public void setSal(double sal) {
	        this.sal = sal;
	    }

	    public String getDepartments() {
	        return departments;
	    }

	    public void setDepartments(String departments) {
	        this.departments = departments;
	    }

	    public Employees(String name, int id, double sal, String departments) {
	        super();
	        this.name = name;
	        this.id = id;
	        this.sal = sal;
	        this.departments = departments;
	    }

	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", departments=" + departments + "]";
	    }

	}


	class IdSort implements Comparator<Employees> {

	    @Override
	    public int compare(Employees o1, Employees o2) {
	        if (o1.getId() > o2.getId()) {
	            return 1;
	        } else {
	            return -1;
	        }
	    }

	}

	class NameSort implements Comparator<Employees> {

	    @Override
	    public int compare(Employees o1, Employees o2) {
	        return o1.getName().compareTo(o2.getName());
	    }

	}

	class DepartmentSort implements Comparator<Employees> {

	    @Override
	    public int compare(Employees o1, Employees o2) {
	        return o1.getDepartments().compareTo(o2.getDepartments());
	    }

	}

	class SalarySort implements Comparator<Employees> {

	    @Override
	    public int compare(Employees o1, Employees o2) {
	        if (o1.getSal() > o2.getSal()) {
	            return 1;
	        } else {
	            return -1;
	        }

	    }


	}


