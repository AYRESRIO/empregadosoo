package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter Pay day: ");
		int payDay = sc.nextInt();

		System.out.print("Email: ");
		String correio = sc.next();
		System.out.print("Phone: ");
		String cel = sc.next();

		Address address = new Address(correio, cel);

		Department dept = new Department(departmentName, payDay, address, null);

		System.out.print("How many employees to this department? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			sc.nextLine();
			System.out.println((i + 1) + "º Employee data: ");
			System.out.print("Name: ");
			String workerName = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee employees = new Employee(workerName, salary);
			dept.addEmployee(employees);
		}

		showReport(dept);

		sc.close();
	}

	private static void showReport(Department dept) {
		System.out.println(dept);

	}
}
