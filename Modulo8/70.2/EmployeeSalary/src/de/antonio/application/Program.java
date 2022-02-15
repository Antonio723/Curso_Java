package de.antonio.application;

import java.util.Scanner;

import de.antonio.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee employ =new Employee();
		
		System.out.print("Name:");
		employ.name = in.nextLine();
		System.out.print("Gross salary: ");
		employ.grossSalary = in.nextDouble();
		System.out.print("Tax: ");
		employ.tax = in.nextDouble();
		employ.grossSalary = employ.netSalary();
		
		System.out.printf("%nEmployee: %s%n", employ.toString());
		System.out.print("Which percentage to increase salary?");
		double tax = in.nextDouble();
		employ.increaseSalary(tax);
		System.out.printf("%nUpdated data: %s", employ.toString());
		
		in.close();
	}

}
