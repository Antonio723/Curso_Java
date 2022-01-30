import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		in.close();
		
		double triangle = (a * c) / 2;
		double circle = Math.pow(c,2) * 3.14159;
		double trapeze = ((a+b)*c)/2;
		double square = b * b;
		double rectangle = a*b;
		
		System.out.printf("Triangulo: %.3f%n"
						+ "Circulo: %.3f%n"
						+ "Trapezio: %.3f%n"
						+ "Quadrado: %.3f%n"
						+ "Retangulo: %.3f%n", 
						triangle, circle, trapeze, square, rectangle);

	}

}
