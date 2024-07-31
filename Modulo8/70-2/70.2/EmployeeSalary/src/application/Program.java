package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Employee em = new Employee();
		
		System.out.print("Name: ");
		em.name = in.nextLine();
		System.out.print("Gross salary: ");
		em.grossSalary = in.nextDouble();
		System.out.print("Tax: ");
		em.tax = in.nextDouble();
		
		System.out.printf("Employe : "+em);
		System.out.printf("%nWhich percentage to increase salary? ");
		em.increaseSalary(in.nextDouble());
		
		System.out.printf("Update data: "+ em);
		
		in.close();
	}

}
