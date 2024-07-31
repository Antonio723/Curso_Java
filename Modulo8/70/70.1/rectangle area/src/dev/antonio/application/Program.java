package dev.antonio.application;

import java.util.Locale;
import java.util.Scanner;

import dev.antonio.entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter retangle width and height:");
		Rectangle rectangle = new Rectangle(); 
		rectangle.width = in.nextDouble();
		rectangle.height = in.nextDouble();
		in.close();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
	}
}
