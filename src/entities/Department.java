package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private Address address;
	private List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	public Department(String name, int payDay, Address address, List<Employee> employees) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payroll() {
		double sum = 0;
		for (Employee c : employees) {
			sum += c.getSalary();
		}
		System.out.println();
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PAYROLL: \n");
		sb.append("Department " + name + " = " + String.format("R$ %.2f", payroll()) + "\n");
		sb.append("Payday " + payDay + "\n");
		sb.append("Employees: \n");
		for (Employee c : employees) {
			sb.append(c.getName() + "\n");
		}
		sb.append("For questions, please contact: " + address);

		return sb.toString();
	}

}
