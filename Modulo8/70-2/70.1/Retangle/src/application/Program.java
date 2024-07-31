package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Retangle r1 = new Retangle();
		
		System.out.println("Enter rectangle width and height: ");
		r1.width = in.nextDouble();
		r1.height = in.nextDouble();
		
		System.out.println(r1);
		in.close();
		
		System.out.printf("%n%n programa finalizado :-) ");
	}

}
