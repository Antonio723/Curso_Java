import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("Voc� digitou " + x);
		
		System.out.println("voc� digitou "+sc.next());
		sc.close();
	}
}
