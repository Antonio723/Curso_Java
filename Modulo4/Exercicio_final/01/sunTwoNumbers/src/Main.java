import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		
		Scanner in = new Scanner(System.in);
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();

		System.out.printf("O resultado da soma entre %.2f e %.2f � %.2f %n", num1, num2, (num1 + num2));
		System.out.println("Soma = " + (num1 + num2));
	}
}
