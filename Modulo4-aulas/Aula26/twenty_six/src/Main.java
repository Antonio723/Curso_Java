import java.util.Locale;
import java.util.Scanner;

public class Main {
	//Entrada de dados(teclado)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //Entrada de dados via console
		String x;
		
		x = sc.next();
		double y = sc.nextDouble();
		char a = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + a);
		
		sc.close();//sai do Scanner
	}
}
