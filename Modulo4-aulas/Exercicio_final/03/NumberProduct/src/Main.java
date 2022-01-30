import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		in.close();
		
		int difference = ((a * b) - (c * d));
		System.out.printf("Difference = %d %n", difference);
	}

}
