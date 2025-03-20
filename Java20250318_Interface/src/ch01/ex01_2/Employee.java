package ch01.ex01_2;

public abstract class Employee {
	
	private String name;
	private int number;
	private String department;
	private int salary;  //100
	
	public Employee() {
	}

	public Employee(String name, int number,  String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();
	
	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDepartment() {
		return department;
	}

}
